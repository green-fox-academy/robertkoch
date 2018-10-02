package greenfox.reddit.services;

import greenfox.reddit.Controller.models.Post;

public interface PostService {
    void save(Post post);

    void create(String submitLink, String submitTitle);

    Iterable<Post> findAll();

}
