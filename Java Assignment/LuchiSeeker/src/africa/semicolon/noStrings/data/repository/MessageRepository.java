package africa.semicolon.noStrings.data.repository;

import africa.semicolon.noStrings.data.models.Message;

public interface MessageRepository {

    void saveMessage(Message message);
    void deleteMessageById(String id);
    void updateMessageById(String id, Message message);
    void sendMessageById(Message message);
    Message findMessageById(String id);
    void deleteAllMessage();

}