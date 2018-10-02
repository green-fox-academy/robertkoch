package greenfox.reddit.services;

import greenfox.reddit.Controller.models.Post;
import greenfox.reddit.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService {
    private PostRepository postRepository;

    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void create(String submitTitle, String submitLink) {
        Post post = new Post(0, submitTitle, submitLink);
        postRepository.save(post);
    }

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }
}
