package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.Empleados;
import unimayor.Undertake.Service.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

    @Autowired
    private EmpleadosService empleadosService;

    @GetMapping
    public List<Empleados> obtenerTodos() {
        return empleadosService.obtenerTodos();
    }

    @PostMapping
    public Empleados guardar(@RequestBody Empleado empleados) {
        return empleadosService.guardar(empleados);
    }

    @GetMapping("/{id}")
    public Empleados obtenerPorId(@PathVariable String id) {
        return empleadosService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        empleadosService.eliminar(id);
    }
}
