import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for (int space=0;space<n-i-1;space++){
                System.out.print("  ");
            }
            for(int star=1;star<=i*2+1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
