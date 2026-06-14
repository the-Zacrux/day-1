import java.util.Scanner;
public class program58 {  
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();
        k=k%n;
        for(int i=0;i<k;i++){
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println("Rotated array is :");
        for (int i = 0; i < n; i++) {   
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}