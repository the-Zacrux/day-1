import java.util.Scanner;
public class program14 {
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
            System.out.println("1");
            return;
        }
        int c=0 ,a=0, b=1;
        for(int i=3; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c+" ");
        sc.close();
    }
}
