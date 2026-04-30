package MainDiaryApplication;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String username;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<>();

    public Diary(String username, String password) {

        this.username = username;
        this.password = password;

    }
    public String getUsername(){
        return username;
    }

    public void unlockDiary(String password) {

        if (this.password.equals(password)) {
            isLocked = false;
        }
    }

    public void lockDiary() {
        isLocked = true;

    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body) {
        if(!isLocked) {
            entries.add(new Entry(entries.size() + 1, title, body));
        }
    }
    public int getEntryCount(){

        return entries.size();
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) return entry;
        }
        return null;
    }

    public void deleteEntry(int id) {

        entries.removeIf(entry -> entry.getId() == id);
    }


    public void updateEntry(int id, String title, String body) {

        if(!isLocked) {
        Entry entry = findEntryById(id);
        if (entry != null) {
            entry.setTitle(title);
            entry.setBody(body);

        }
        }

    }

}
