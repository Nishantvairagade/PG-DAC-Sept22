class Demo()
{
int a;
int b;
Demo()
{
 a=0;
 b=0;
}

Demo(int a,int b)
{
this.a=a;
this.b=b;
}

void print(){
System.out.println("a="+a+"b="+b);
}

void increament(int x, int y)
{
x++;
y++;
}

void change(Demo d)
{
d.a=d.a+this.a;
d.b=d.b+this.b;
}
}
public Class CallByValandRefDemo
{
public static void main(String args[])
{
Demo d1=new Demo(5,10);

int x=2;
int y=4;
d1.increament(x,y);
Demo d2=new Demo(20,30);
d2.print();
d1.change(d2);
d2.print();
}
}