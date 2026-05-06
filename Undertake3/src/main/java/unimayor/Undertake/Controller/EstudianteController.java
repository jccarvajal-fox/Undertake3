package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.Estudiante;
import unimayor.Undertake.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> obtenerTodos() {
        return estudianteService.obtenerTodos();
    }

    @PostMapping
    public Estudiante guardar(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }

    @GetMapping("/{id}")
    public Estudiante obtenerPorId(@PathVariable String id) {
        return estudianteService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        estudianteService.eliminar(id);
    }

}
