import java.util.Scanner;

public class Questtion_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=n;j>=1;j--){
                if(j==i+1){
                    System.out.print("* ");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}