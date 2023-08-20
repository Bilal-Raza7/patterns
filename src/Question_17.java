import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(n/2 - i >= 0){
                int start = n/2 -i;
                int end = n/2 +i +1;
                for(int j=0;j<=n;j++){
                    if(j>=start && j<=end){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }else {
                int start = i-n/2 -1;
                int end = n-start;
                for(int j=0;j<=n;j++){
                    if(j>=start && j<=end){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

        }
    }
}
