import java.util.Scanner;

public class practice_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 values:");


        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter value to search: ");
        int searchValue = sc.nextInt();

        boolean found = false;


        for (int i = 0; i < 10; i++) {
            if (arr[i] == searchValue) {
                System.out.println("Value found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }

    }
}
