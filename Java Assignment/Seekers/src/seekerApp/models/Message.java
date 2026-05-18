package seekerApp.models;

public class Message {

    private String id;
    private String content;
    private String senderId;
    private String recieverId;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }

    public String getSenderId(){
        return senderId;
    }
    public void setSenderId(String senderId){
        this.senderId = senderId;
    }
    public String getReceiverId(){
        return recieverId;
    }
    public void setReceiverId(String receiverId){
        this.recieverId = recieverId;
    }

}