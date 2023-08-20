import java.util.Scanner;

public class Questtion_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int space=0;space<n-i-1;space++){
                System.out.print("  ");
            }
            int leftStart = i+1;
            int rightStart = i*2;
            for(int star=0;star<i*2+1;star++){
                if(leftStart<=i*2+1){
                    System.out.print(leftStart++ +" ");
                }else{
                    System.out.print(rightStart-- +" ");
                }

            }
            System.out.println();
        }
    }
}