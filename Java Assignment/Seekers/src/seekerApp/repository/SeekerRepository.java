package seekerApp.repository;

import seekerApp.models.Seeker;

import java.util.List;

public interface SeekerRepository {

    Seeker save(Seeker seeker);
    Seeker findById(int id);
    List<Seeker> findAll();
    boolean deleteById(int id);
    void deleteAll();
    int count();




}
