import java.util.Scanner;
class Circule
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of Circle");
int r=sc.nextInt();
double area=3.14*r*r;
double Cir=2*3.14*r*r;
System.out.println("Area of Circle="+area);
System.out.println("Circumference of Circle="+Cir);
}
}