package greenfox.chat.models;

import greenfox.chat.dto.Client;

public class MessageStuff {
    private Client client;
    private Message message;

    public MessageStuff() {
    }

    public MessageStuff(Client client, Message message) {
        this.client = client;
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
