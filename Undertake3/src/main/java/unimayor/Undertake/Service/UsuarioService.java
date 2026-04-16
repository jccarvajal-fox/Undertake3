package unimayor.Undertake.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unimayor.Undertake.Model.Usuario;
import unimayor.Undertake.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos() {
        return this.usuarioRepository.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return (Usuario)this.usuarioRepository.save(usuario);
    }

    public Usuario buscarPorId(String id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        this.usuarioRepository.deleteById(id);
    }
}
