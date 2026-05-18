package seekerApp.service;

import seekerApp.models.Seeker;

public interface SeekerService {


    void registerSeeker(Seeker seeker);
    void updateProfile(int id);
    void deleteAccount(int id);

}
