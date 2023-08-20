import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for (int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else if(i<=n/2){
                int start = n/2 -i+1;
                int end = n/2 +i -1;
                for(int j=0;j<n;j++){
                    if(j>=start && j<=end){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
           }
            else {
                int start = i-n/2 +1;
                int end = n-start-1;
                for(int j=0;j<n;j++){
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
