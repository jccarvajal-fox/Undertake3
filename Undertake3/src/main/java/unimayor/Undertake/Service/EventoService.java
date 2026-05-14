package unimayor.Undertake.Service;

import unimayor.Undertake.Model.Evento;
import unimayor.Undertake.Repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
    @Autowired
    private EventoRepository repository;

    public List<Evento> obtenerTodos() { return repository.findAll(); }
    public Evento guardar(Evento e) { return repository.save(e); }
    public Evento buscarPorId(String id) { return repository.findById(id).orElse(null); }
    public void eliminar(String id) { repository.deleteById(id); }
}