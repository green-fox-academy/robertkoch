package greenfox.reddit.repository;

import greenfox.reddit.Controller.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}