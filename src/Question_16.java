import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for (int space=0;space<=i-1;space++){
                System.out.print("  ");
            }
            for(int star=0;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for (int space=0;space<i;space++){
                System.out.print("  ");
            }
            for(int star=0;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
