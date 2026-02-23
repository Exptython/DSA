import java.util.Scanner;

public class practice_10 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < size - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate found at positions "
                        + i + " and " + (i + 1)
                        + " with value: " + arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No consecutive duplicates found.");
        }










    }
}
