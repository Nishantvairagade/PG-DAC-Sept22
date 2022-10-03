import java.util.Scanner;
class SimpleInterest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double interest;
double rate;
int year;
int principal;
System.out.println("enter the principal,rate and year");
principal=sc.nextInt();
rate=sc.nextDouble();
year=sc.nextInt();

interest=(principal*rate*year)/100;
System.out.println("Simple Interest="+interest);


}
}