import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UbaldeStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <String> students = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("\nWelcome to Student Manager");
            System.out.println("1) Add Students");
            System.out.println("2) Remove Students");
            System.out.println("3) Display Students");
            System.out.println("4) Exit");
            System.out.print("\nEnter your choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Invalid input. Please eneter a number between 1 and 4.");
                input.nextLine();
                continue; 
            }

            switch (choice) {
                case 1:
                    System.out.print("\nEnter student name: ");
                    String addStudent = input.nextLine();
                    students.add(addStudent);
                    System.out.println(addStudent + " is added to the list.");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("\nThe list is empty. We can't delete anything.");
                        break;
                    }
                    System.out.println("\nCurrent list of students: " + students);
                    System.out.print("Enter index to delete (0 to " + (students.size() - 1) + "): ");
                    if (input.hasNextInt()) {
                        int indexToDelete = input.nextInt();
                        input.nextLine();
                        if (indexToDelete >= 0 && indexToDelete < students.size()) {
                            String removedStudent = students.remove(indexToDelete);
                            System.out.println(removedStudent + " is removed from the list.");
                        } else {
                            System.out.println("\nInvalid index.");
                        }
                    } else {
                        System.out.println("\nInvalid index. Please enter a valid index.");
                        input.nextLine();
                    }
                    break;
                case 3:
                    if (students.isEmpty()) {
                        System.out.println("\nThe list is empty.");
                    } else {
                        System.out.println("\nStudents in the ArrayList:");
                            for (String student : students) {
                                System.out.println(student);
                            }   
                    }
                    break;
                case 4:
                    System.out.println("\nThank you, and goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please enter a number from 1 and 4.");
            }
        }
        input.close();
    }
}
