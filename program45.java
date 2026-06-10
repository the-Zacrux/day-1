import java.util.Scanner;
public class program45{
    public static String pal (int a) {
        int b=a,c=0;
        while(a>0){
            c=c*10+a%10;
            a/=10;
        }
        if(b==c)
            return "Palindrome";
        return "Not Palindrome";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.println( pal(x));
        sc.close();
    }
}