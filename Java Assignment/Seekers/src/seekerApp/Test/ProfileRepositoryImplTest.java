package seekerApp.Test;


import org.testng.annotations.Test;
import seekerApp.models.Profile;
import seekerApp.repository.ProfileRepositoryImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProfileRepositoryImplTest {



        @Test
        public void testThatProfileCanAdd() {

            ProfileRepositoryImpl repository = new ProfileRepositoryImpl();

            Profile profile = new Profile();

            repository.add(profile);

            assertEquals(profile,  repository.findProfile(profile));
        }

        @Test
        public void testThatProfileCanAddXYZAndReturnXZ(){

            ProfileRepositoryImpl repository = new ProfileRepositoryImpl();

            Profile profileOne = new Profile();
            Profile profileTwo = new Profile();
            Profile profileThree = new Profile();

            repository.add(profileOne);
            repository.add(profileTwo);
            repository.add(profileThree);

            assertEquals(profileOne, repository.findProfile(profileOne));
            assertEquals(profileThree, repository.findProfile(profileThree));
        }
    }

