package unimayor.Undertake.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unimayor.Undertake.Model.Estudiante;
import unimayor.Undertake.Repository.EstudianteRepository;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository EstudianteRepository;

    public List<Estudiante> obtenerTodos() {
        return this.EstudianteRepository.findAll();
    }

    public Estudiante guardar(Estudiante estudiante) {
        return this.EstudianteRepository.save(estudiante);
    }

    public Estudiante buscarPorId(String id) {
        return this.EstudianteRepository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        this.EstudianteRepository.deleteById(id);
    }
}