package unimayor.Undertake.Service;

import unimayor.Undertake.Model.Pasantia;
import unimayor.Undertake.Repository.PasantiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasantiaService {
    @Autowired
    private PasantiaRepository repository;

    public List<Pasantia> obtenerTodos() { return repository.findAll(); }
    public Pasantia guardar(Pasantia p) { return repository.save(p); }
    public Pasantia buscarPorId(String id) { return repository.findById(id).orElse(null); }
    public void eliminar(String id) { repository.deleteById(id); }
}