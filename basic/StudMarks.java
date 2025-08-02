import java.util.Scanner;

public class StudMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter student's name: ");
            String name = sc.nextLine(); // Read student's name

            int marks = 0; // Variable to store marks
            boolean valid = false; // Flag to check for valid input

            // Keep asking for marks until valid input is provided
            while (!valid) {
                System.out.print("Enter student's marks (integer): ");
                if (sc.hasNextInt()) { // Check if input is an integer
                    marks = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    valid = true; // Mark input as valid
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.nextLine(); // Consume the invalid input
                }
            }

            System.out.println("Student " + i + ": Name = " + name + ", Marks = " + marks);
        }

        sc.close(); 
    }
}

