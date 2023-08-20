import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for(int star=0;star<n;star++){
                    System.out.print("* ");
                }
            }else {
                for (int j=0;j<n;j++){
                    if(j==0 || j==n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
