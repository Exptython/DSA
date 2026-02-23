import java.util.Scanner;

public class Practice_8 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number:");
        int number= input.nextInt();

        int first=0;
        int second=1;

        for (int i=0;i<=number;i++){
            System.out.print(first+" ");
             int next=first +second;
             first=second;
             second=next;



        }
        input.close();











    }
}
