
public class LuchiSet {

    private String [] set;
    private int count;

    public LuchiSet() {

        set = new String[10];
        count = 0;
    }

    public boolean isEmpty() {

        return count == 0;
    }

    public void push(String value) {

        if(count == set.length){
            resize();
    }
        if(contains(value)){
            throw new RuntimeException("Set does not take duplicate");
           
    }
        set[count] = value;
        count ++;
    }

    public boolean contains(String value) { 

        for(int index = 0; index < count; index++){

        if(set[index].equals(value)){
            return true;
        }
    }
        return false;
    }

    public boolean remove(String value) {

        for(int index = 0; index < count; index++){

        if(set[index].equals(value)){

        
        for(int inner = index; inner < count - 1; inner++){
            set[inner] = set[inner + 1];
          
    }
         set[count - 1] = null;
         count--;

        return true;
    }
}
        return false;
}


    public void clear() {

        for(int index = 0; index < count; index ++){

            set[index] = null;
        }

        count = 0;
    }

    public int size(){

       return count;
    }
    public void resize(){


    String [] newSet = new String[set.length * 2];

    for(int index = 0; index < set.length; index ++){
        
        newSet[index] = set[index];
 }
        set = newSet;

}

}

