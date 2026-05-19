package africa.semicolon.noStrings.data.repositries;
import africa.semicolon.noStrings.data.models.Message;

import org.testng.annotations.Test;
import africa.semicolon.noStrings.data.repository.MessageRepositoryImpl;

import static org.testng.Assert.assertEquals;

public class MessageRepositoryImplTest {


    @Test
    public void testThatRepositoryCanAddMessage(){

        MessageRepositoryImpl repository = new MessageRepositoryImpl();

        Message message = new Message();

        message.setId("1");

        message.setContent("Hello beautiful");

        repository.saveMessage(message);

        Message foundMessage = repository.findMessageById("1");

        assertEquals(message, foundMessage);


    }

    @Test
    void testThatRepoCanDeleteById(){

        MessageRepositoryImpl repository = new MessageRepositoryImpl();
        Message message = new Message();

        message.setId("2");
        message.setContent("Whats up Gbasa?");

        repository.saveMessage(message);

        Message foundMessage = repository.findMessageById("2");

        repository.deleteMessageById("2");

        assertEquals(message, foundMessage);

    }



}