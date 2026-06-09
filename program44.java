import java.util.Scanner;
public class program44{
    public static int fac(int a) {
        if (a < 2) {
            return 1;
        }
        int b=1;
        for (int i=1;i<=a;i++){
            b=b*i;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.println( fac(x));
        sc.close();
    }
}