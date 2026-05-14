package unimayor.Undertake.Service;

import  java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unimayor.Undertake.Model.Empleo;
import unimayor.Undertake.Repository.EmpleoRepository;

@Service
public class EmpleoService {

    @Autowired
    private EmpleoRepository empleoRepository;

    public List<Empleo> obtenerTodos() {
        return this.empleoRepository.findAll();
    }

    public Empleo guardar(Empleo empleo) {
        return this.empleoRepository.save(empleo);
    }

    public Empleo buscarPorId(String id) {
        return empleoRepository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        this.empleoRepository.deleteById(id);
    }
}