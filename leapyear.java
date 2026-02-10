
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the year :");
        int Year =sc.nextInt();
        if (Year/4==0)
        {
            System.out.print("this is leap year");
        }
        // else
        // {
        //     System.out.print("this is not leap year");
        // }
    }
    
}
