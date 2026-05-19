package africa.semicolon.noStrings.data.repository;

import africa.semicolon.noStrings.data.models.Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileRepositoryImpl implements ProfileRepository {

    private int count;
    private List<Profile> profiles = new ArrayList<>();

    @Override
    public void add(Profile id) {
        count++;
        profiles.add(id);
    }
    @Override
    public Profile findProfile(Profile id) {

        if (!profiles.contains(id)) {
            throw new IllegalArgumentException("Profile does not exist");
        }
        return id;
    }
    @Override
    public void deleteById(Profile id) {
        if(!profiles.contains(id)){
            throw new IllegalArgumentException("Profile does not exist");
        }
        count++;
        profiles.remove(id);
    }

    public int getCount(){
        return count;
    }


}
