package unimayor.Undertake.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unimayor.Undertake.Model.Mentor;
import unimayor.Undertake.Repository.MentorRepository;

@Service
public class MentorService {
    @Autowired
    private MentorRepository mentorRepository;

    public List<Mentor> obtenerTodos() {
        return mentorRepository.findAll();
    }

    public Mentor guardar(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public Mentor buscarPorId(String id) {
        return mentorRepository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        mentorRepository.deleteById(id);
    }
}
