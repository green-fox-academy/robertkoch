package greenfox.chat.services;

import greenfox.chat.dto.Client;
import greenfox.chat.dto.ReceivedJSON;
import greenfox.chat.models.Message;
import greenfox.chat.repositories.MessageRepository;
import greenfox.chat.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImpMessageService implements MessageService {
    MessageRepository messageRepository;
    UserRepository userRepository;

    public ImpMessageService(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }
    @Override
    public void save(Message message) {
        messageRepository.save(new Message(message, userRepository.findById(1L).get().getUsername()));
    }

    @Override
    public Iterable<Message> listAll() {
        return messageRepository.findAll();
    }
    @Override
    public void forwardReceivedJSON(ReceivedJSON receivedJSON) {
        if (!receivedJSON.getClient().getId().equals(System.getenv("CHAT_APP_UNIQUE_ID"))){
            final String url = "http://" + System.getenv("CHAT_APP_PEER_ADDRESS") + ":8080/api/message/receive";
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForObject(url, receivedJSON, ReceivedJSON.class);
        }
    }

    @Override
    public void sendMessage(Message message) {
        final String url = "http://" + System.getenv("CHAT_APP_PEER_ADDRESS") + ":8080/api/message/receive";
        ReceivedJSON newMessage = new ReceivedJSON(message, new Client());
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(url, newMessage, ReceivedJSON.class);
    }
}
