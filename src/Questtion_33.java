import java.util.Scanner;

public class Questtion_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int s=0;s<2*n-1;s++){
            System.out.print("  ");
        }
        System.out.print(0);
        System.out.println();
        for(int i=1;i<n*2;i++){
            for(int space=0;space<2*n-i-1;space++){
                System.out.print("  ");
            }
            int leftStart=2*n-i;
            int rightStart=2*n-1;
            for(int j=0;j<i*2+1;j++){
                if(j<i){
                    System.out.print(leftStart++ +" ");
                } else if (j==i) {
                    System.out.print(0 +" ");
                }else {
                    System.out.print(rightStart-- +" ");
                }
            }
            System.out.println();
        }
    }

}