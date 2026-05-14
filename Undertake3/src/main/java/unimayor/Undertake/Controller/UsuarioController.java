package unimayor.Undertake.Controller;

import org.springframework.http.ResponseEntity;
import unimayor.Undertake.Model.Usuario;
import unimayor.Undertake.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarioService.obtenerTodos();
    }

    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }

    @GetMapping("/{id}")
    public Usuario obtenerPorId(@PathVariable String id) {
        return usuarioService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        usuarioService.eliminar(id);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario usuario) {
        List<Usuario> usuarios = usuarioService.obtenerTodos();
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail()) &&
                    u.getPassword().equals(usuario.getPassword())) {
                return ResponseEntity.ok(u);
            }
        }
        return ResponseEntity.status(401).body("Credenciales incorrectas");
    }

}