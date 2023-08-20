import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for (int space=0;space<i;space++){
                System.out.print("  ");
            }
            for(int star=0;star<n-i;star++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
