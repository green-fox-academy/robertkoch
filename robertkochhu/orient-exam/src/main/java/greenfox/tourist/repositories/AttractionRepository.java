package greenfox.tourist.repositories;

import greenfox.tourist.models.Attraction;
import org.springframework.data.repository.CrudRepository;

public interface AttractionRepository extends CrudRepository<Attraction, Long> {
}
