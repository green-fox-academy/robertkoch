package greenfox.reddit.services;

import greenfox.reddit.Controller.models.Post;

public interface PostService {
    void save(Post post);

    void create(String submitLink, String submitTitle);
    void find(long id);
    Iterable<Post> findAll();
    void upvotePost(long id);
    void  downvotePost(long id);
    Iterable<Post>  findAllByOrderByPopularDesc();
}
