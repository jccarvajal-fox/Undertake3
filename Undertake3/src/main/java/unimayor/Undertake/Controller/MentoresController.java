package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.Mentores;
import unimayor.Undertake.Service.MentoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentores")
public class MentoresController {

    @Autowired
    private MentoresService mentoresService;

    @GetMapping
    public List<Mentores> obtenerTodos() {
        return mentoresService.obtenerTodos();
    }

    @PostMapping
    public Mentores guardar(@RequestBody Mentores mentor) {
        return mentoresService.guardar(mentor);
    }

    @GetMapping("/{id}")
    public Mentores obtenerPorId(@PathVariable String id) {
        return mentoresService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        mentoresService.eliminar(id);
    }

    @PutMapping("/{id}")
    public Mentores actualizar(@PathVariable Long id, @RequestBody Mentores mentor) {
        return mentoresService.actualizar(id, mentor);
    }
}