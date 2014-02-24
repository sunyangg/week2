import java.util.Scanner;
public class week2_2_3//這裡要打檔名
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int year,i;
		System.out.print("請輸入年份(西元): ");
		year=scan.nextInt();
		System.out.println("在此年份之前的閏年有:");
		for(i=0;i<=year;i++)
		{
			if(i%4==0 && i%100!=0)
				System.out.println(i);
			else if(i%400==0)
				System.out.println(i);
			else;
		}
	}
}