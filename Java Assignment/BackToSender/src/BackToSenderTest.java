import static org.testng.AssertJUnit.*;

import org.testng.annotations.Test;

public class BackToSenderTest{

    @Test
    void testThatCollectionLessThan50ReturnsRightResult(){


        BackToSender collection = new   BackToSender();

        int collectionRate = 25;

        int actualResult = collection.functionOne(collectionRate);

        int expectedResult = 9000;

        assertEquals(expectedResult, actualResult);


    }
    @Test
    void testThatCollectionAbove50to59ReturnsRightResult(){


        BackToSender collection = new BackToSender();

        int collectionRate = 55;

        int actualResult = collection.functionTwo(collectionRate);

        int expectedResult = 16_000;

        assertEquals(expectedResult, actualResult);


    }
    @Test
    void testThatCollectionAbove60to69ReturnsRightResult(){


        BackToSender collection = new BackToSender();

        int collectionRate = 62;

        int actualResult = collection.functionThree(collectionRate);

        int  expectedResult = 20_500;

        assertEquals(expectedResult, actualResult);


    }
    @Test
    void testThatCollectionAbove70AndAboveReturnsRightResult(){


        BackToSender collection = new BackToSender();

        int collectionRate = 71;

        int actualResult = collection.functionFour(collectionRate);

        int expectedResult = 40_500;

        assertEquals(expectedResult, actualResult);


    }


}