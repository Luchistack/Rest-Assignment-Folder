package seekerApp.service;

import seekerApp.models.Seeker;

public interface SeekerService {

//    checks age rule, then calls repository.save()
//    DTO (Data Transfer Object)
    void registerSeeker(Seeker seeker);
//    checks ownership, then calls repository.save()
    void updateProfile(int id);
//    checks if id exists, then calls repository.deleteById()
    void deleteAccount(int id);

}
