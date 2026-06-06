import java.util.Scanner;
public class program25 {
    public static long fac(int n){
        if(0==n||1==n){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Factorial of " + x + " is " + fac(x));
        sc.close();
    }
}    