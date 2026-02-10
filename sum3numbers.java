
import java.util.Scanner;

public class sum3numbers {
    public static void main(String[] args) {

        //you can also replace the double with int
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the first value :");
        double a= sc.nextDouble();

        System.out.print("Enter the second value :");
        double b= sc.nextDouble();

        System.out.print("Enter the third value :");
        double c= sc.nextDouble();

        double X= a+b+c;
        System.out.println("The sum of the all three values are :"+X);
    }
}
