import java.util.Scanner;
class Room{

double height;
double width;
double breadth;


void displayvolume()
{
double volume=height*width*breadth;
System.out.println("Volume of the Room is="+volume);
}

void AcceptTheDimention()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the height,width and breadth of Room");
height=sc.nextDouble();
width=sc.nextDouble();
breadth=sc.nextDouble();

}

}
public class RoomDemo{
	public static void main(String args[]){
Room obj1=new Room();
obj1.AcceptTheDimention();
obj1.displayvolume();
}
}

