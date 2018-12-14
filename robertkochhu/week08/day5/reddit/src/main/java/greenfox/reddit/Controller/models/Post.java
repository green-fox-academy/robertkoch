package greenfox.reddit.Controller.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class    Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long popular;
    private String title;
    private String link;

    public Post(long popular, String title, String link) {
        this.popular = popular;
        this.title = title;
        this.link = link;
    }

    public Post(String title, String link) {
        this.popular = 0;
        this.title = title;
        this.link = link;
    }

    public Post() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPopular() {
        return popular;
    }

    public void setPopular(long popular) {
        this.popular = popular;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
