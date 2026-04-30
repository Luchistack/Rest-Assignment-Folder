package MainDiaryApplication;

import java.time.LocalDateTime;

public class Entry{

    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;


    public Entry(int id, String title, String body) {

        if(title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be Empty");
        }
        if(body == null || body.isBlank()){
            throw new IllegalArgumentException("Body cannot be blank");
        }
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now();

    }

    public LocalDateTime getDateCreated(){
        return dateCreated;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }

    public String getBody() {
        return body;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setBody(String body) {
        this.body = body;
    }
}
