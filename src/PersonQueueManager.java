import java.util.LinkedList;
import java.util.Queue;
public class PersonQueueManager {
    private String lastName;
    private String firstName;
    private int age;
    private Queue<PersonQueueManager> personQueue;
    public PersonQueueManager(String lastName, String firstName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    public void addToQueue(PersonQueueManager person){
        personQueue.add(person);
        System.out.println("Person \"" + person + "\" has been added to the queue.");
    }

}
