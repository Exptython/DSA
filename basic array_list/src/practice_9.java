public class practice_9 {
    public static void main(String[] args) {

        int row=8;

        for (int i=0;i<=row;i++){

            for (int space=1;space<=row-i;space++){
                System.out.print("  ");
            }
            int num=1;
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num*2;
            }
            num=num/2;

            for (int j=1;j<i;j++){
                num=num/2;
                System.out.print(num+" ");
            }
            System.out.println();
        }









    }
}
