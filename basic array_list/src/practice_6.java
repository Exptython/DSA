import java.util.Scanner;

public class practice_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine(); // clear buffer

        String topStudent = "";
        double highestScore = -1;


        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student score: ");
            double score = input.nextDouble();
            input.nextLine(); // clear buffer

            if (score > highestScore) {
                highestScore = score;
                topStudent = name;
            }
        }


        System.out.println("\nStudent with highest score:");
        System.out.println("Name: " + topStudent);
        System.out.println("Score: " + highestScore);

        input.close();


    }
}
