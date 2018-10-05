package greenfox.chat.repositories;


import greenfox.chat.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User,Long> {
}
