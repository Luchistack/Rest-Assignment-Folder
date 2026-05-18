package seekerApp.repository;

import seekerApp.models.Profile;

public interface ProfileRepository {

    void add(Profile profile);
    Profile findProfile(Profile id);
    void deleteById(Profile id);
    int getCount();


}