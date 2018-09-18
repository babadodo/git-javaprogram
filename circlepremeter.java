import java.util.Scanner;

public class circlepremeter
{
public static void main(String args[])
{
double r, pi=3.14, p;
System.out.println("Circle Radius is :")
Scanner input = new Scanner(System.in);
r = input.nextDouble();

p=2*pi*r;

System.out.println("Premeter of Circle :" +p);

}
}
