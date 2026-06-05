import java.util.Scanner;
public class program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        int binary = 0, place = 1;
        while (n > 0) {  // System.out.println("Binary = " + Integer.toBinaryString(n));
            int rem = n % 2;
            binary = binary + rem * place;
            place = place * 10;
            n = n / 2;
        }
        System.out.println("Binary = " + binary);
        sc.close();
    }
}