import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseManagementTest {

    public ExcerciseManagement management;

    @Before
    public void initialize(){
        management = new ExcerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning(){
        assertEquals(0,management.getExcerciseList().size());
    }

    @Test
    public void addingExcerciseGrowsListByOne(){
        management.add("test");
        assertEquals(1,management.getExcerciseList().size());
    }

    @Test
    public void addedExcerciseIsOnList(){
        management.add("test");
        assertTrue(management.getExcerciseList().contains("test"));
    }

    @Test
    public void excerciseCanBeMarkedAsCompleted(){
        management.add("test");
        management.markAsCompleted("test");
        assertTrue(management.isCompleted("test"));
    }

    @Test
    public void ifNotMarkedAsCompletedIsNotCompleted(){
        management.add("test");
        management.markAsCompleted("test");
        assertFalse(management.isCompleted("test 2"));
    }


}
