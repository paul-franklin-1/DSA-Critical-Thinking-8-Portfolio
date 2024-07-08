import java.util.LinkedList;
import java.util.Queue;

public class PersonQueueManager {
    public String lastName;
    public String firstName;
    public int age;

    /**
     * Initialization of main Queue collection.
     */
    public static Queue<PersonQueueManager> personQueue = new LinkedList<>();

    /**
     * Array used to sort personQueue elements in descending order by last name.
     */
    static String[] lastNameArray = {"0","0","0","0","0"};

    /**
     * Array used to sort personQueue elements in descending order by last name.
     */
    static int[] ageArray = {0, 0, 0, 0, 0};

    /**
     * Constructor to add new PersonQueueManager person to personQueue.
     * @param lastName
     * @param firstName
     * @param age
     */
    public PersonQueueManager(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    /**
     * Add new person to personQueue.
     * @param person
     */
    public static void addToQueue(PersonQueueManager person) {
        personQueue.add(person);
    }

    /**
     * Creates array version of personQueue called lastNameArray in order to sort personQueue
     * in descending order by last name, calls quickSortArray() and finalSort().
     */
    public static PersonQueueManager[] sortByLastName() {
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        try {
            for (int i = 0; i < 5; i++) {
                lastNameArray[i] = personArray[i].lastName;
            }
            QueueSortingTools.quickSortArray(lastNameArray, 0, 4);
            return QueueSortingTools.finalSort(personArray);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error sorting by last name: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
        return personArray;
    }

    /**
     * Creates array version of personQueue called "ageArray", sorts personQueue
     * in descending order by age by calling quickSortArray() and finalSort().
     */
    public static PersonQueueManager[] sortByAge() {
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        try {
            for (int i = 0; i < 5; i++) {
                ageArray[i] = personArray[i].age;
            }
            QueueSortingTools.quickSortArray(ageArray, 0, 4);
            return QueueSortingTools.finalSort(personArray);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error sorting by age: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
        return personArray;
    }

    /**
     * @return a String that represents personQueue sorted in descending order by age.
     */
    public static StringBuilder printQueueReverseSortedByAge() {
        StringBuilder queueString = new StringBuilder();
        try {
            for (PersonQueueManager person : sortByAge()) {
                queueString.append("Full Name: " + person.firstName + " " + person.lastName +
                        " Age: " + person.age + "\n\n");
            }
        } catch (Exception e) {
            System.err.println("Error printing queue reverse sorted by age: " + e.getMessage());
        }
        return queueString;
    }

    /**
     * @return a String that represents personQueue sorted in descending order by last name.
     */
    public static StringBuilder printQueueReverseSortedByLastName() {
        StringBuilder queueString2 = new StringBuilder();
        try {
            for (PersonQueueManager person : sortByLastName()) {
                queueString2.append("Full Name: " + person.firstName + " " + person.lastName +
                        " Age: " + person.age + "\n\n");
            }
        } catch (Exception e) {
            System.err.println("Error printing queue reverse sorted by last name: " + e.getMessage());
        }
        return queueString2;
    }

    /**
     * @return personQueue in the order in which it was inputted into the main method.
     */
    public static StringBuilder printUnsortedQueue(){
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        StringBuilder queueString3 = new StringBuilder();
        try {
            for (PersonQueueManager person : personArray){
                queueString3.append("Name: " + person.firstName + " " + person.lastName +
                        "; Age: " + person.age + "\n\n");
            }
        } catch (Exception e) {
            System.err.println("Error printing unsorted queue: " + e.getMessage());
        }
        return queueString3;
    }
}
