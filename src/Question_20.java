import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for(int j=0;j<n;j++){
                    if(j==n/2){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            } else if (i<=n/2) {
                int firstStar = n/2 -i;
                int secondStar = n/2 +i;
                for(int j=0;j<n;j++){
                    if(j==firstStar || j==secondStar){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }else {
                int firstStar =i- n/2;
                int secondStar = n-1-firstStar ;
                for(int j=0;j<n;j++){
                    if(j==firstStar || j==secondStar){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

        }
    }
}
