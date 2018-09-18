import java.util.Scanner;

public class circlearea
{
public static void main(String args[])
{
double r,a;
double pi = 3.14;
System.out.println("Enter the Value of Radius :");
Scanner input = new Scanner(System.in);
r =input.nextDouble();

a = pi*r*r;

System.out.println("Circle Area :" +a);

}
}
