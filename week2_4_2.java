import java.util.*;
public class week2_4_2//�o�̭n���ɦW
{
	public static void main(String args[])
	{
		ArrayList<Shape> arrayList=new ArrayList<Shape>();
		Scanner scan=new Scanner(System.in);
		int sel;
		double a,b;
		int count=0;
		while(true)
		{
			System.out.print("1)Triangle 2)Rectangle 3)Circle 4)Oval 5)exit:");
			sel=scan.nextInt();
			if(sel==1)
			{
				Triangle triangle;
				System.out.println("�п�J��: ");
				a=scan.nextDouble();
				System.out.println("�п�J��: ");
				b=scan.nextDouble();
				triangle=new Triangle(a,b);
				arrayList.add(triangle);
				triangle=null;
				count++;
			}
			else if(sel==2)
			{
				Rectangle rectangle;
				System.out.println("�п�J��: ");
				a=scan.nextDouble();
				System.out.println("�п�J�e: ");
				b=scan.nextDouble();
				rectangle=new Rectangle(a,b);
				arrayList.add(rectangle);
				rectangle=null;
				count++;
			}
			else if(sel==3)
			{
				Circle circle;
				System.out.println("�п�J�b�|: ");
				a=scan.nextDouble();				
				circle=new Circle(a);
				arrayList.add(circle);
				circle=null;
				count++;
			}
			else if(sel==4)
			{
				Oval oval;
				System.out.println("�п�Ja: ");
				a=scan.nextDouble();
				System.out.println("�п�Jb: ");
				b=scan.nextDouble();
				oval=new Oval(a,b);
				arrayList.add(oval);
				oval=null;
				count++;
			}
			else if(sel==5)
			{
				break;
			}
			else
			{
				System.out.println("ERROR!!!\n");
			}
		}
		for(int i=0;i<count;i++)
		{
			arrayList.get(i).show();
		}
	}
}
abstract class Shape
{
	abstract void show();
}
class Triangle extends Shape
{
	double a,b;
	Triangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("�Ϊ�:�T����  ���n:"+a*b/2);
	}
}
class Circle extends Shape
{
	double r;
	Circle(double r)
	{
		this.r=r;
	}
	void show()
	{
		System.out.println("�Ϊ�:���  ���n:"+3.14*r*r);
	}
}
class Oval extends Shape
{
	double a,b;
	Oval(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("�Ϊ�:����  ���n:"+3.14*a*b);
	}
}
class Rectangle extends Shape
{	
	double a,b;
	Rectangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("�Ϊ�:����  ���n:"+a*b);
	}
}