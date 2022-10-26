class Box
{
double height;
double width;
double breadth;

double getVolume()
{
	double volume=(height*width*breadth);
	return volume;
}
double getArea()
{
double area= 2*(breadth*width + breadth*height + width*height);	
	return area;
}
Box()
{
height=0.0;
width=0.0;
breadth=0.0;	
}
Box(double height,double width,double breadth)
{
	this.height=height;
	this.width=width;
	this.breadth=breadth;
	
}
}



public class BoxDemo
{
public static void main(String arga[])
{
Box d1=new Box(20.1,52.25,63.0);
Box d2=new Box(52.0,65.12,41.02);
double area=d1.getArea();
double volume=d1.getVolume();
System.out.println("Area="+area);
System.out.println("Volume="+volume);

double area2=d2.getArea();
double volume2=d2.getVolume();

System.out.println("Area="+area);
System.out.println("Volume="+volume);

}
}
