import java.util.Scanner;
class Student{
String name;
double math;
double english;
double science;
double avg;
double total;

void assignInitialValues(String name,double math,double english,double science)
{
this.name=name;
this.math=math;
this.english=english;
this.science=science;
}

void average()
{
 total=math+english+science;
 avg=total/3;
 
}

void displayResult()
{
System.out.println("Average="+avg);
System.out.println("Total marks="+total);
}

public static void main(String args[])
{
Student obj1=new Student();
obj1.assignInitialValues("Nishant",95,75,95);
obj1.average();
obj1.displayResult();



}
}