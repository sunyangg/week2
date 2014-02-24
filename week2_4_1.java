import java.util.*;
public class week2_4_1//�o�̭n���ɦW
{
	public static void main(String args[])
	{		
		Scanner scan=new Scanner(System.in);
		ArrayList<Circle> c=new ArrayList<Circle>();
		double a,b;
		int count=0;
		while(true)
		{
			Circle t;
			System.out.print("�п�J���b�b��a(-1 to exit): ");
			a=scan.nextDouble();
			System.out.print("�п�J���b�b��b(-1 to exit): ");
			b=scan.nextDouble();
			if(a==-1 || b==-1)
				break;
			t=new Oval(a,b);
			c.add(t);
			System.out.print("\n");
			t=null;
			count++;
		}
		for(int i=0;i<count;i++)
		{
			c.get(i).show();
		}
	}
}
class Circle 
{ 
	double r; 
 
	Circle(double r) 
	{ 
		this.r = r; 
	} 
 
	double area() 
	{ 
		return 3.14 * r * r; 
	}
	
	void show()
	{
		System.out.println("�b�|:"+r+"  ���n:"+area());
	}
 }
 class Oval extends Circle
 {
	double r2;
	
	Oval(double a,double b)
	{
		super(a);
		this.r2=b;
	}
	double area() 
	{ 
		return 3.14 * r * r2; 
	}
	
	void show()
	{
		System.out.println("a="+r+"b="+r2+"  ���n:"+area());
	}
 }