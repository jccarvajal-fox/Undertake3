package unimayor.Undertake.Repository;

import unimayor.Undertake.Model.Pasantia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasantiaRepository extends MongoRepository<Pasantia, String> {
}