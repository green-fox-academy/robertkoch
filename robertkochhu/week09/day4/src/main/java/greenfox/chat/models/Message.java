package greenfox.chat.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

import static java.lang.Math.random;

@Entity
public class Message {
    @Id
    private long id;
    private String text;
    private LocalDateTime timestamp;
    private String username;

    public Message(Message message, String username) {
    }

    public Message(String text, String username) {
        this.id = (long) (Math.random() * 8999999 + 1000000);
        this.timestamp = LocalDateTime.now(ZoneOffset.UTC);
        this.text = text;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimestramp() {
        return timestamp;
    }

    public void setTimestramp(LocalDateTime timestramp) {
        this.timestamp = timestramp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
