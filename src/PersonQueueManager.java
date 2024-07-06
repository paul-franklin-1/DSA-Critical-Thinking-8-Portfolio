import java.util.LinkedList;
import java.util.Queue;
public class PersonQueueManager {
    private String lastName;
    private String firstName;
    private int age;
    public Queue<PersonQueueManager> personQueue;
    public PersonQueueManager(String lastName, String firstName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    public void addToQueue(PersonQueueManager person){
        personQueue.add(person);
        System.out.println("Person \"" + person + "\" has been added to the queue.");
    }
    public void sortByLastName(PersonQueueManager person){
        PersonQueueManager[] lastNameArray = personQueue.toArray(new PersonQueueManager[5]);
        int firstHighIndex = (personQueue.size()-1);
        QueueSortingTools.partition(lastNameArray,0,firstHighIndex);

    }
    public void sortByAge(PersonQueueManager person){

    }
    public StringBuilder printQueue(){
        StringBuilder queueString = new StringBuilder();
        for (PersonQueueManager person : personQueue) {
            queueString.append("Full Name: " + person.firstName + " " + person.lastName +
                    "Age: " + person.age + "\n\n");
            return queueString;
        }


}}
