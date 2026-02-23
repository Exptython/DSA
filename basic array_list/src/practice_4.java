public class practice_4 {
    public static void main(String[] args) {


        int n=6;
        for (int i =1;i<=n;i++){
            for (int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }




    }
}
