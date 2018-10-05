package greenfox.chat.dto;

import javax.validation.constraints.NotNull;

public class Client {
    @NotNull(message = "Client id is missing")
    private String id= System.getenv("CHAT_APP_UNIQUE_ID");

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
