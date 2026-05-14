package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.Pasantia;
import unimayor.Undertake.Service.PasantiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasantias")
public class PasantiaController {
    @Autowired
    private PasantiaService pasantiaService;

    @GetMapping
    public List<Pasantia> obtenerTodos() { return pasantiaService.obtenerTodos(); }

    @PostMapping
    public Pasantia guardar(@RequestBody Pasantia pasantia) { return pasantiaService.guardar(pasantia); }

    @GetMapping("/{id}")
    public Pasantia obtenerPorId(@PathVariable String id) { return pasantiaService.buscarPorId(id); }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) { pasantiaService.eliminar(id); }
}