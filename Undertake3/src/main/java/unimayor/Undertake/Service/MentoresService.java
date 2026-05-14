package unimayor.Undertake.Service;

import unimayor.Undertake.Model.Mentores;
import unimayor.Undertake.Repository.MentoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MentoresService {

    @Autowired
    private MentoresRepository mentoresRepository;

    public List<Mentores> obtenerTodos() {
        return mentoresRepository.findAll();
    }

    public Mentores guardar(Mentores mentor) {
        return mentoresRepository.save(mentor);
    }

    public Mentores buscarPorId(String id) {
        return mentoresRepository.findById(Long.parseLong(id)).orElse(null);
    }

    public void eliminar(String id) {
        mentoresRepository.deleteById(Long.parseLong(id));
    }

    public Mentores actualizar(Long id, Mentores mentor) {
        Optional<Mentores> existente = mentoresRepository.findById(id);

        if (existente.isPresent()) {
            mentor.setId(id);
            return mentoresRepository.save(mentor);
        } else {
            return null;
        }
    }
}
