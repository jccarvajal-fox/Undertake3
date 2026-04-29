package unimayor.Undertake.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unimayor.Undertake.Model.Estudiante;
import unimayor.Undertake.Repository.EstudiantesRepository;

@Service
public class EstudiantesService {

    @Autowired
    private EstudiantesRepository EstudiantesRepository;

    public List<Estudiante> obtenerTodos() {
        return this.EstudiantesRepository.findAll();
    }

    public Estudiante guardar(Estudiante estudiante) {
        return this.EstudiantesRepository.save(estudiante);
    }

    public Estudiante buscarPorId(String id) {
        return this.EstudiantesRepository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        this.EstudiantesRepository.deleteById(id);
    }
}