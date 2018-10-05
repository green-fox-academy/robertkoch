package greenfox.reddit.services;

import greenfox.reddit.Controller.models.Post;
import greenfox.reddit.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public void find(long id) {
        postRepository.findById(id);
    }

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public void upvotePost(long id) {
        Optional<Post> post = postRepository.findById(id);
         post.get().setPopular(post.get().getPopular()+1);
        postRepository.save(postRepository.findById(id).get());
    }

    @Override
    public void downvotePost(long id) {
        Optional<Post> post = postRepository.findById(id);
        post.get().setPopular(post.get().getPopular()-1);
        postRepository.save(postRepository.findById(id).get());
    }

    @Override
    public Iterable<Post> findAllByOrderByPopularDesc() {
        return postRepository.findAllByOrderByPopularDesc();
    }
}
