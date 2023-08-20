import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                for(int j=0;j<=2*n-2;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                int start=i+1;
                int end = 2*n-3-i;
                for(int j=0;j<=2*n-2;j++){
                    if(j>=start && j<=end){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
