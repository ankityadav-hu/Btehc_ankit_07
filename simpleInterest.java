
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

    //     System.out.print("enter the principle amount :");
    //     double P =sc.nextDouble();

    //     System.out.print("enter the Rate of Interest :");
    //     double R =sc.nextDouble();

    //     System.out.print("enter the Time period :");
    //     double T =sc.nextDouble();

    //     double SI =P*R*T/100;
    //     System.out.println("Simple Interest :"+SI);
    // }
        int p = 69 , r = 5 , t = 8;
        double si= p*r*t/100.0; // here reminder is int/int=int , int/double=double  so if you put only 100 si=27.0 if put 100.0 si= 27.6
        System.out.println(si);

}
}