/*
In this we will see how to find the odd and even number.
_________________________________________________________
Question : For given number find that number is even or odd.
          NOTE : Number can be negative also.
_______________________________________________________________
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int b = 0 ;
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO CHECK :");
        int a = sc.nextInt();
        b = a / 2;
        ans = a % 2;
        if (ans == 0){
            System.out.println("NUMBER IS EVEN :" + b);
        }else
            System.out.println("NUMBER IS ODD BECOZ REMINDER IS : " + ans);
    }
}