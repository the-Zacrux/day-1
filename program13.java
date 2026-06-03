import java.util.Scanner;
public class program13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n = sc.nextInt();
        if(0>=n){
            System.out.println("Invalid input");
            return;
        }
        if(1==n){
            System.out.println("0");
            return;
        }
        if(2==n){
            System.out.println("0 1");
            return;
        }
        System.out.print("0 1 ");
        int a=0, b=1;
        for(int i=3; i<=n; i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        sc.close();
    }
}
