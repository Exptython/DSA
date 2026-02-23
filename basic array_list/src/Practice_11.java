import java.util.Scanner;
public class Practice_11 {
    public static void main(String[] args) {


       Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {

                    // Check if already printed
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (!alreadyPrinted) {
                        System.out.println("Duplicate element: " + arr[i]);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }

    }
}
