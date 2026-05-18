package seekerApp.repository;

import seekerApp.exceptions.MessageNotFoundException;
import seekerApp.models.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageRepositoryImpl implements MessageRepository{

    private List<Message> messages = new ArrayList<>();


    @Override
    public void saveMessage(Message message) {
        messages.add(message);

    }

    @Override
    public Message findMessageById(String id) {
        for(Message message : messages){
            if(message.getId().equals(id)){
                return message;
            }
        }
        throw new MessageNotFoundException("id not found");
    }


    @Override
    public void deleteMessageById(String id) {

        messages.removeIf(message -> message.getId().equals(id));

    }

    @Override
    public void updateMessageById(String id, Message message) {

    }

    @Override
    public void sendMessageById(Message message) {

    }

    @Override
    public void deleteAllMessage() {

    }
}