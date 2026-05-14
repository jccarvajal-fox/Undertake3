package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.Mentor;
import unimayor.Undertake.Service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentores")
public class MentorController {
    @Autowired
    private MentorService mentorService;

    @GetMapping
    public List<Mentor> obtenerTodos() { return mentorService.obtenerTodos(); }

    @PostMapping
    public Mentor guardar(@RequestBody Mentor mentor) { return mentorService.guardar(mentor); }

    @GetMapping("/{id}")
    public Mentor obtenerPorId(@PathVariable String id) { return mentorService.buscarPorId(id); }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) { mentorService.eliminar(id); }
}