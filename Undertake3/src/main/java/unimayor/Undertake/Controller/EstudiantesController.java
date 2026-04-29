package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.EstudiantesDTO;
import unimayor.Undertake.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {

    @Autowired
    private EstudianteService estudiantesService;

    @GetMapping
    public List<Estudiantes> obtenerTodos() {
        return EstudiantesService.obtenerTodos();
    }

    @PostMapping
    public Estudiantes guardar(@RequestBody Estudiante estudiante) {
        return EstudianteService.guardar(estudiante);
    }

    @GetMapping("/{id}")
    public Estudiantes obtenerPorId(@PathVariable String id) {
        return EstudiantesService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        EstudiantesService.eliminar(id);
    }
}
