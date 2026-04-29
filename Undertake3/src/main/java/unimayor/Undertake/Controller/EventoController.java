package unimayor.Undertake.Controller;

import unimayor.Undertake.Model.Evento;
import unimayor.Undertake.Service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> obtenerTodos() { return eventoService.obtenerTodos(); }

    @PostMapping
    public Evento guardar(@RequestBody Evento evento) { return eventoService.guardar(evento); }

    @GetMapping("/{id}")
    public Evento obtenerPorId(@PathVariable String id) { return eventoService.buscarPorId(id); }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) { eventoService.eliminar(id); }
}