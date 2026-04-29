package unimayor.Undertake.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unimayor.Undertake.Model.Empleado;
import unimayor.Undertake.Repository.EmpleadosRepository;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadosRepository EmpleadosRepository;

    public List<Empleado> obtenerTodos() {
        return this.empleadoRepository.findAll();
    }

    public Empleado guardar(Empleado empleado) {
        return this.EmpleadosRepository.save(empleado);
    }

    public Empleado buscarPorId(String id) {
        return this.EmpleadosRepository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        this.EmpleadosRepository.deleteById(id);
    }
}