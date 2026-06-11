import java.util.Scanner;
public class program52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[length];
        int even=0;
        int odd=0;
        for(int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < length; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        scanner.close();
    }
}
