package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.Pasantias;
import unimayor.Undertake.Service.PasantiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasantias")
public class PasantiasController {

    @Autowired
    private PasantiasService pasantiasService;

    @GetMapping
    public List<Pasantias> obtenerTodos() {
        return pasantiasService.obtenerTodos();
    }

    @PostMapping
    public Pasantias guardar(@RequestBody Pasantias pasantia) {
        return pasantiasService.guardar(pasantia);
    }

    @GetMapping("/{id}")
    public Pasantias obtenerPorId(@PathVariable String id) {
        return pasantiasService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        pasantiasService.eliminar(id);
    }

    @PutMapping("/{id}")
    public Pasantias actualizar(@PathVariable Long id, @RequestBody Pasantias pasantia) {
        return pasantiasService.actualizar(id, pasantia);
    }
}