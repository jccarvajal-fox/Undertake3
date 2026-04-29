package unimayor.Undertake.Repository;

import unimayor.Undertake.Model.Empleados;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadosRepository extends MongoRepository<Empleados, String> {
}