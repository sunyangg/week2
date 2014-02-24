import java.util.Scanner;
import java.util.*;
public class week2_3_1//這裡要打檔名
{
	public static void main(String args[])
	{
		ArrayList<Circle> c=new ArrayList<Circle>();
		Scanner scan=new Scanner(System.in);
		double r,ang;
		int i=0,id;
		while(true)
		{
			System.out.print("請輸入半徑(－１跳出)：　");
			r=scan.nextDouble();
			if(r==-1)
				break;
			Circle t=new Circle(r);
			c.add(t);
			t=null;
			c.get(i).show();
			i++;
		}
		while(true)
		{
			System.out.print("請輸入編號(－１跳出): ");
			id=scan.nextInt();
			System.out.print("請輸入角度(－１跳出): ");
			ang=scan.nextDouble();
			if(id==-1 || ang==-1)
				break;
			if(id<i && id>=0)
			{
				c.get(id).show();
				System.out.println("對應弧長:"+c.get(id).arc(ang)+"\n對應面積:"+c.get(id).pie(ang));
			}
			
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
	
	double arc(double ang)
	{
		return 2*3.14*r*(ang/360);
	}
	
	double pie(double ang)
	{
		return 3.14 * r * r*(ang/360); 
	}
	
	void show()
	{
		System.out.println("半徑:"+r+"  面積:"+area());
	}
 }