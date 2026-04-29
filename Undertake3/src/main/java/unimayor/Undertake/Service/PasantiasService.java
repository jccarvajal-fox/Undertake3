package unimayor.Undertake.Service;

import unimayor.Undertake.Model.Pasantias;
import unimayor.Undertake.Repository.PasantiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasantiasService {

    @Autowired
    private PasantiasRepository pasantiasRepository;

    public List<Pasantias> obtenerTodos() {
        return pasantiasRepository.findAll();
    }

    public Pasantias guardar(Pasantias pasantia) {
        return pasantiasRepository.save(pasantia);
    }

    public Pasantias buscarPorId(String id) {
        return pasantiasRepository.findById(Long.parseLong(id)).orElse(null);
    }

    public void eliminar(String id) {
        pasantiasRepository.deleteById(Long.parseLong(id));
    }

    public Pasantias actualizar(Long id, Pasantias pasantia) {
        Optional<Pasantias> existente = pasantiasRepository.findById(id);

        if (existente.isPresent()) {
            pasantia.setId(id);
            return pasantiasRepository.save(pasantia);
        } else {
            return null;
        }
    }
}