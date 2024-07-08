import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonQueueJUnitTester {

    @BeforeEach
    public void setUp() {
        PersonQueueManager.personQueue.clear();
        PersonQueueManager.addToQueue(new PersonQueueManager("Smith", "John", 30));
        PersonQueueManager.addToQueue(new PersonQueueManager("Doe", "Jane", 25));
        PersonQueueManager.addToQueue(new PersonQueueManager("Black", "James", 40));
        PersonQueueManager.addToQueue(new PersonQueueManager("White", "Emily", 35));
        PersonQueueManager.addToQueue(new PersonQueueManager("Brown", "Michael", 20));
    }

    @Test
    public void testSortByLastName() {
        PersonQueueManager[] sortedByLastName = PersonQueueManager.sortByLastName();
        assertEquals("White", sortedByLastName[0].lastName);
        assertEquals("Smith", sortedByLastName[1].lastName);
        assertEquals("Doe", sortedByLastName[2].lastName);
        assertEquals("Brown", sortedByLastName[3].lastName);
        assertEquals("Black", sortedByLastName[4].lastName);
    }

    @Test
    public void testSortByAge() {
        PersonQueueManager[] sortedByAge = PersonQueueManager.sortByAge();
        assertEquals(40, sortedByAge[0].age);
        assertEquals(35, sortedByAge[1].age);
        assertEquals(30, sortedByAge[2].age);
        assertEquals(25, sortedByAge[3].age);
        assertEquals(20, sortedByAge[4].age);
    }

    @Test
    public void testAddToQueue() {
        PersonQueueManager newPerson = new PersonQueueManager("Green", "Chris", 28);
        PersonQueueManager.addToQueue(newPerson);
        assertEquals(6, PersonQueueManager.personQueue.size());
        assertTrue(PersonQueueManager.personQueue.contains(newPerson));
    }
}

