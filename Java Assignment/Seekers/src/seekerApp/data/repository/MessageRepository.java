package seekerApp.repository;

import seekerApp.models.Message;

public interface MessageRepository {

    void saveMessage(Message message);
    void deleteMessageById(String id);
    void updateMessageById(String id, Message message);
    void sendMessageById(Message message);
    Message findMessageById(String id);
    void deleteAllMessage();

}