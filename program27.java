import  java.util.Scanner;
public class program27 {
    public static int sum(int n){
        if(0==n){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Sum of digits of " + x + " is " + sum(x));
        sc.close();
    }
}    