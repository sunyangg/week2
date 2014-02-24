import java.util.Scanner;
public class week2_2_1
{
	public static void main(String args[])
	{		
		String name;
		int year;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("請輸入姓名: ");
		name=scan.nextLine();
		System.out.print("請輸入西元生日: ");
		year=scan.nextInt();
		System.out.println("您的姓名是: "+name);
		System.out.println("您的出生年是(民國): "+(year-1911));
	}
}