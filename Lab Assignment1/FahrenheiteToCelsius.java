import java.util.Scanner;
class FahrenheiteToCelsius{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Fahrenheite Temperature");
double far=sc.nextDouble();
double c;
c=5*(far-32)/9;
System.out.println("Temperature in celsius="+c);



}
}