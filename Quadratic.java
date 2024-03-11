import java.util.*;

class Quadratic 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        double delta = (b*b)-(4*a*c);
        System.out.println("Delta: "+ delta);
        
        double Root1 = (-b + Math.sqrt(delta))/(2*a);
        System.out.println("Root 1 of equation is: "+ Root1);
        double Root2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("Root 2 of equation is: "+ Root2);

        
    }
}
