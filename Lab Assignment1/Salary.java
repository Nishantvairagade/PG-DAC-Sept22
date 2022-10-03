import java.util.Scanner;
class Salary{
public static void main(String args[]){
double basic;
double HRA;
double DA;
double GS;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Salary");
basic=sc.nextDouble();
if(basic<10000)
{
HRA=(10.0/100)*basic;
DA=(90.0/100)*basic;

}
else
{
HRA=2000;
DA=(98.0/100)*basic;
}
System.out.println("Gross Salary="+(basic+HRA+DA));
}

}