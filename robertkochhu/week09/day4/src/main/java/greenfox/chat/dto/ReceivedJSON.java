package greenfox.chat.dto;


import greenfox.chat.models.Message;

import javax.validation.Valid;

public class ReceivedJSON {

    @Valid
    private Message message;
    @Valid
    private Client client;

    public ReceivedJSON(Message message, Client client) {
    }


    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
