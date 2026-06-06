import java.util.Scanner;       
public class program28{
    static int r=0;
    public static void rev(int n){
        if(0==n){
            return;
        }
        r=r*10+n%10;
        rev(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        rev(x);
        System.out.println("Reverse of " + x + " is " + r);
        sc.close();
    }
}