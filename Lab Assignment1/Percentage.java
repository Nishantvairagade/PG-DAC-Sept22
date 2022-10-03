import java.util.Scanner;
class Percentage
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
System.out.println("Enter the 5 subject marks");
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
double sum=0;
for(int i=0;i<5;i++)
{
sum=sum+arr[i];
}
double percent;
percent=(sum/500)*100;
System.out.println("sum="+sum);
System.out.println("Percentage marks="+percent+"%");



}
}