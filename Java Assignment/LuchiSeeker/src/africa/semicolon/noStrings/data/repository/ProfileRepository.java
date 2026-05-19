package africa.semicolon.noStrings.data.repository;

import africa.semicolon.noStrings.data.models.Profile;

public interface ProfileRepository {

    void add(Profile profile);
    Profile findProfile(Profile id);
    void deleteById(Profile id);
    int getCount();


}