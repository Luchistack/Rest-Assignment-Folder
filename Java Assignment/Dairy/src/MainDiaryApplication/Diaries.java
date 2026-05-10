package MainDiaryApplication;

import java.util.ArrayList;
import java.util.List;

public class Diaries {

private List <Diary> diaries = new ArrayList<>();




public void add(String username, String password) {
        diaries.add(new Diary(username, password));
}



public Diary findByUsername(String username) {

    for (Diary diary : diaries) {
        if (diary.getUsername().equals(username)) {
            return diary;
        }
    }
    return null;
}

    public void delete(String username){

        Diary diary = findByUsername(username);
        if(diary != null){
            diaries.remove(diary);
        }
    }
}