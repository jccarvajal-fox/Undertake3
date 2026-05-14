package unimayor.Undertake.Repository;

import unimayor.Undertake.Model.Empleo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleoRepository extends MongoRepository<Empleo, String> {
}