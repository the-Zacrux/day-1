import java.util.Scanner;
public class program57 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x=n-1;
        for (int i = 0; i < n/2; i++) {
            arr[x]=(arr[i]+arr[x])-(arr[i]=arr[x]);
            x--;
        }
        System.out.println("Reversed array is:");
        for (int i = 0; i < n; i++) {   
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}