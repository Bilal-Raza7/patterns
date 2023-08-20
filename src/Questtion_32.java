import java.util.Scanner;

public class Questtion_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i*2+1;j++){
                if(j%2==0){
                    System.out.print(i+1+" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i*2-1;j++){
                if(j%2==0){
                    System.out.print(i+" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}