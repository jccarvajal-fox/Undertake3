package unimayor.Undertake.Repository;

import unimayor.Undertake.Model.Evento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventoRepository extends MongoRepository<Evento, String> {
}