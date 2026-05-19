package africa.semicolon.noStrings.data.repository;

import africa.semicolon.noStrings.data.models.Seeker;

import java.util.List;

public interface SeekerRepository {

    Seeker save(Seeker seeker);
    Seeker findById(int id);
    List<Seeker> findAll();
    boolean deleteById(int id);
    void deleteAll();
    int count();




}
