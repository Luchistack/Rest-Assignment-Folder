package MainDiaryApplication;


public class MainDiaryApplication {

    public static void main(String[] args) {


        Diaries diaries = new Diaries();

        diaries.add("Faith", "1234");

        Diary diary = diaries.findByUsername("Faith");

        if(diary != null) {
            diary.unlockDiary("1234");
            diary.createEntry("My Story", "Today i saw Rose");
            diary.createEntry("My Way", "This day as been a lot");


            Entry entry1 = diary.findEntryById((1);
            Entry entry2 = diary.findEntryById(2);

            System.out.println(entry1.getTitle() + ":" + entry1.getBody());
            System.out.println(entry1.getTitle() + ":" + entry2.getBody());

        }



    }

}
