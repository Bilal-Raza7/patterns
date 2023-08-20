import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for (int space=0;space<n-i;space++){
                System.out.print("  ");
            }
            for(int star=1;star<=i*2+1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
