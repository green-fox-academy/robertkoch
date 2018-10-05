package greenfox.chat.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
    @Id
    private long id;
    private String username;

    public User() {
    }

    public User( String username) {
        this.id = 1;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
