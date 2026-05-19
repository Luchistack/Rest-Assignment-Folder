package africa.semicolon.noStrings.services;

import africa.semicolon.noStrings.data.models.Seeker;

public interface SeekerService {


    void registerSeeker(Seeker seeker);
    void updateProfile(int id);
    void deleteAccount(int id);

}
