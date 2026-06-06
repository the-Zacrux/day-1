import java.util.Scanner;
public class program26 {
    public static void fib(int n){
        int a=0,b=1,c;
        while(n>0){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        fib(x);
        sc.close();
    }
}    