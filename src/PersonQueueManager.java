import java.util.LinkedList;
import java.util.Queue;
public class PersonQueueManager {
    private String lastName;
    private String firstName;
    private int age;
    /**
     * initialization of main Queue collection
     */
    public static Queue<PersonQueueManager> personQueue = new LinkedList<>();
    /**
     * Array used to sort personQueue elements in descending order by last name
     */
    static String[] lastNameArray = {"0","0","0","0","0"};
    /**
     * Array used to sort personQueue elements in descending order by last name
     */
    static int[] ageArray = {0, 0, 0, 0, 0};

    /**
     * constructor to add new PersonQueueManager person to personQueue.
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
     * add new person to personQueue
     * @param person
     */
    public static void addToQueue(PersonQueueManager person) {
        personQueue.add(person);
    }

    /**
     * creates array version of personQueue called lastNameArray in order to sort personQueue
     * in descending order by last name, calls quickSortArray() and finalSort().
     */
    public static PersonQueueManager[] sortByLastName() {
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        for (int i = 0; i < 5; i++) {
            lastNameArray[i] = personArray[i].lastName;
        }
        QueueSortingTools.quickSortArray(lastNameArray, 0, 4);
        return QueueSortingTools.finalSort(personArray);
    }

    /**
     * creates array version of personQueue called "ageArray", sorts personQueue
     * in descending order by age by calling quickSortArray() and finalSort()
     */
    public static PersonQueueManager[] sortByAge() {
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        for (int i = 0; i < 5; i++) {
            ageArray[i] = personArray[i].age;
        }
        QueueSortingTools.quickSortArray(ageArray, 0, 4);
        return QueueSortingTools.finalSort(personArray);
    }

    /**
     * @return a String that represents personQueue sorted in descending order by age
     */
    public static StringBuilder printQueueReverseSortedByAge() {
        StringBuilder queueString = new StringBuilder();
        for (PersonQueueManager person : sortByAge()) {
            queueString.append("Full Name: " + person.firstName + " " + person.lastName +
                    "Age: " + person.age + "\n\n");
        }
        return queueString;
    }

    /**
     * @return a String that represents personQueue sorted in descending order by last name
     */
        public static StringBuilder printQueueReverseSortedByLastName() {
            StringBuilder queueString2 = new StringBuilder();
            for (PersonQueueManager person : sortByLastName()) {
                queueString2.append("Full Name: " + person.firstName + " " + person.lastName +
                        " Age: " + person.age + "\n\n");
            }
            return queueString2;
        }

    /**
     * @return personQueue in the order in which it was inputted into the main method
     */
        public static StringBuilder printUnsortedQueue(){
            PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
            StringBuilder queueString3 = new StringBuilder();
            for (PersonQueueManager person : personArray){
            queueString3.append("Name: " + person.firstName + " " + person.lastName +
                        "; Age: " + person.age + "\n\n");
            }
            return queueString3;
        }
    }
