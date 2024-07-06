import java.util.LinkedList;
import java.util.Queue;
public class PersonQueueManager {
    private String lastName;
    private String firstName;
    private int age;
    public static Queue<PersonQueueManager> personQueue;
    String[] lastNameArray;
    int[] ageArray;
    public PersonQueueManager(String lastName, String firstName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    public void addToQueue(PersonQueueManager person){
        personQueue.add(person);
        System.out.println("Person \"" + person + "\" has been added to the queue.");
    }

    public void removeFromQueue(){
        PersonQueueManager removedPerson = personQueue.element();
        personQueue.remove();
        System.out.print(removedPerson + " has been removed from the queue.")
    }

    public void sortByLastName(PersonQueueManager person){
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        for(int i = 0; i < 5;i++){
            lastNameArray[i] = personArray[i].lastName;
        }
        QueueSortingTools.quickSorter(lastNameArray,0,4);
    }

    public void sortByAge(PersonQueueManager person){
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        for(int i = 0; i < 5;i++){
            ageArray[i] = personArray[i].age;
        }
        QueueSortingTools.quickSortArray(lastNameArray,0,4);
        QueueSortingTools.
    }

    public StringBuilder printQueue(){
        StringBuilder queueString = new StringBuilder();
        for (PersonQueueManager person : personQueue) {
            queueString.append("Full Name: " + person.firstName + " " + person.lastName +
                    "Age: " + person.age + "\n\n");
            return queueString;
        }


}}
