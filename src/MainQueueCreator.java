import java.util.Scanner;

public class MainQueueCreator {
    public static void main(String[] Args) {
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Please enter information for five people:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter first name for Person #" + i + 1 + ": ");
                String firstName = scnr.nextLine();
                System.out.println("Enter last name for Person #" + i + 1 + ": ");
                String lastName = scnr.nextLine();
                System.out.println("Enter age of Person #" + (i + 1) + ": ");
                while (!scnr.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid age for Person #" + (i + 1) + ": ");
                    scnr.next();
                }
                int age = scnr.nextInt();
                scnr.nextLine();
                PersonQueueManager person = new PersonQueueManager(lastName,firstName,age);
            }
            PersonQueueManager.printCurrentQueue();
        }




    }
}
