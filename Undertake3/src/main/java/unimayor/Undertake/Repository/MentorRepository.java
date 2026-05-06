package unimayor.Undertake.Repository;

import unimayor.Undertake.Model.Mentor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends MongoRepository<Mentor, String> {
}