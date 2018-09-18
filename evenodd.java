import java.util.Scanner;

public class evenodd
{
public static void main(String args[])
{
int n;
System.out.println("Enter a Number :");
Scanner input = new Scanner(System.in);
n = input.nextInt();

if(n%2==0)
{
System.out.println("Entered Number is Even");
}
else
{
System.out.println("Entered Number is Odd");
}

}
}
