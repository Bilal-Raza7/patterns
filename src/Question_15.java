import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for (int space=0;space<=i*2-1;space++){
                System.out.print("  ");
            }
            for(int star=0;star<n-i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for (int space=0;space<=i*2-1;space++){
                System.out.print("  ");
            }
            for(int star=0;star<n-i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
