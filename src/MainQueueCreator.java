import java.util.Scanner;

/**
 * Driver class to harbor main method that will permit user to instantiate, sort and
 * print array representations of Queue<PersonQueueManager> personQueue.
 */
public class MainQueueCreator {
    /**
     * Main method serves as entry point into program.
     * @param Args
     */
    public static void main(String[] Args) {
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Please enter information for five people:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter first name for Person #" + (i + 1) + ": ");
                String firstName = scnr.nextLine();
                System.out.println("Enter last name for Person #" + (i + 1) + ": ");
                String lastName = scnr.nextLine();
                System.out.println("Enter age of Person #" + (i + 1) + ": ");
                while (!scnr.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid age for Person #" + (i + 1) + ": ");
                    scnr.next();
                }
                int age = scnr.nextInt();
                scnr.nextLine();
                PersonQueueManager person = new PersonQueueManager(lastName, firstName, age);
                PersonQueueManager.addToQueue(person);
            }
            System.out.println("***Unsorted Queue: ");
            System.out.println(PersonQueueManager.printUnsortedQueue());
            System.out.println("***Queue Reverse Sorted by Last Name: ");
            System.out.println(PersonQueueManager.printQueueReverseSortedByLastName());
            System.out.println("***Queue Reverse Sorted by Age: ");
            System.out.println(PersonQueueManager.printQueueReverseSortedByAge());
        } catch (Exception e) {
            System.err.println("Unexpected error in main method: " + e.getMessage());
        }
    }
}
