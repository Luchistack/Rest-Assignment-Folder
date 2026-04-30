import java.util.HashSet;
import java.util.Set;

public class LuchiSet {

    private Set <String> set;

    public LuchiSet() {

        set = new HashSet<>();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public void add(String value) {
        set.add(value);
    }

    public boolean contains(String value) {
        return set.contains(value);
    }

    public boolean remove(String value) {
        return set.remove(value);
    }


    public void clear() {
        set.clear();
    }
    public int size(){
       return set.size();
    }
}

