package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.Empleo;
import unimayor.Undertake.Service.EmpleoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleos")
public class EmpleoController {

    @Autowired
    private EmpleoService empleoService;

    @GetMapping
    public List<Empleo> obtenerTodos() {
        return empleoService.obtenerTodos();
    }

    @PostMapping
    public Empleo guardar(@RequestBody Empleo empleo) {
        return empleoService.guardar(empleo);
    }

    @GetMapping("/{id}")
    public Empleo obtenerPorId(@PathVariable String id) {
        return empleoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        empleoService.eliminar(id);
    }

}