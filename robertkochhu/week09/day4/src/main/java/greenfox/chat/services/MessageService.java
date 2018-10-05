package greenfox.chat.services;

import greenfox.chat.dto.ReceivedJSON;
import greenfox.chat.models.Message;

public interface MessageService {
    public void save(Message message);
    public Iterable<Message> listAll();
    void forwardReceivedJSON(ReceivedJSON receivedJSON);
    void sendMessage(Message message);
}
