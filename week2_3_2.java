import java.util.Scanner;
public class week2_3_2//這裡要打檔名
{
	public static void main(String args[])
	{
		int year,month,day;
		Scanner scan=new Scanner(System.in);
		System.out.print("請輸入年:");
		year=scan.nextInt();
		System.out.print("請輸入月:");
		month=scan.nextInt();
		System.out.print("請輸入日:");
		day=scan.nextInt();
		Date d=new Date(year,month,day);
		d.show();
		d.valid();
	}
}
class Date
{
	int year,month,day;
	Date(int year,int month,int day)
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
	void show()
	{
		System.out.println("year="+year+"\nmonth="+month+"\nday="+day);
	}
	void valid()
	{
		if(year<0)
			System.out.println("year is invalid!");
		else
			System.out.println("year OK!");
		if(month>0 && month<=12)
			System.out.println("month OK!");
		else
			System.out.println("month is invalid!");
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:				
			case 8:			
			case 10:				
			case 12:
			if(day>0 && day<=31)
				System.out.println("day OK!");
			else
				System.out.println("day is invalid1");
				break;
			case 2:		
			if(day>0 && day<=28)
				System.out.println("day OK!");
			else
				System.out.println("day is invalid!");
				break;						
			case 4:				
			case 6:				
			case 9:				
			case 11:
			if(day>0 && day<=30)
				System.out.println("day OK!");
			else
				System.out.println("day is invalid!");
				break;				
		}
	}
}