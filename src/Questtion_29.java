import java.util.Scanner;

public class Questtion_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int space=0;space<n-i-1;space++){
                System.out.print("  ");
            }
            int num = i+1;
            for(int star=0;star<i*2+1;star++){
                if(star==0 || star==i*2){
                    System.out.print(num +" ");
                }else{
                    System.out.print(0 +" ");
                }
            }
            System.out.println();
        }
    }
}