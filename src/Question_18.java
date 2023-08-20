import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n/2;i++){
            for (int space = 0; space < n/2 - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= i * 2 + 1; star++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for(int i=n/2 -1;i>=0;i--){
            for (int space = 0; space < n/2 - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= i * 2 + 1; star++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
