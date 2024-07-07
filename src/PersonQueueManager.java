import java.util.LinkedList;
import java.util.Queue;
public class PersonQueueManager {
    private String lastName;
    private String firstName;
    private int age;
    public static Queue<PersonQueueManager> personQueue = new LinkedList<>();
    static String[] lastNameArray = {"0","0","0","0","0"};
    static int[] ageArray = {0, 0, 0, 0, 0};

    public PersonQueueManager(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public static void addToQueue(PersonQueueManager person) {
        personQueue.add(person);
    }

    public static PersonQueueManager[] sortByLastName() {
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        for (int i = 0; i < 5; i++) {
            lastNameArray[i] = personArray[i].lastName;
        }
        QueueSortingTools.quickSortArray(lastNameArray, 0, 4);
        return QueueSortingTools.finalSort(personArray);
    }

    public static PersonQueueManager[] sortByAge() {
        PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
        for (int i = 0; i < 5; i++) {
            ageArray[i] = personArray[i].age;
        }
        QueueSortingTools.quickSortArray(ageArray, 0, 4);
        return QueueSortingTools.finalSort(personArray);
    }

    public static StringBuilder printQueueReverseSortedByAge() {
        StringBuilder queueString = new StringBuilder();
        for (PersonQueueManager person : sortByAge()) {
            queueString.append("Full Name: " + person.firstName + " " + person.lastName +
                    "Age: " + person.age + "\n\n");
        }
        return queueString;
    }

        public static StringBuilder printQueueReverseSortedByLastName() {
            StringBuilder queueString2 = new StringBuilder();
            for (PersonQueueManager person : sortByLastName()) {
                queueString2.append("Full Name: " + person.firstName + " " + person.lastName +
                        " Age: " + person.age + "\n\n");
            }
            return queueString2;
        }

        public static StringBuilder printUnsortedQueue(){
            PersonQueueManager[] personArray = personQueue.toArray(new PersonQueueManager[5]);
            StringBuilder queueString3 = new StringBuilder();
            for (PersonQueueManager person : personArray){
            queueString3.append("Name: " + person.firstName + " " + person.lastName +
                        "; Age: " + person.age + "\n\n");
            }
            return queueString3;
        }
        public static int[] copyIndexArray() {
            int[] copiedArray = new int[QueueSortingTools.indexArray.length];
            System.arraycopy(QueueSortingTools.indexArray, 0, copiedArray, 0, QueueSortingTools.indexArray.length);
            return copiedArray;
        }
    }
