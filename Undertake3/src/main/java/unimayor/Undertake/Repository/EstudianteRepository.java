package unimayor.Undertake.Repository;

import unimayor.Undertake.Model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends MongoRepository<Estudiante, String> {
}