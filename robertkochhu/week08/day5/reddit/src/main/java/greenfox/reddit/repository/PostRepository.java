package greenfox.reddit.repository;

import greenfox.reddit.Controller.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> {
    Iterable<Post> findAllByOrderByPopularDesc();

    Optional<Post> findById(long id);
}