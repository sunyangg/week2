import java.util.Scanner;
public class week2_2_3//�o�̭n���ɦW
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int year,i;
		System.out.print("�п�J�~��(�褸): ");
		year=scan.nextInt();
		System.out.println("�b���~�����e���|�~��:");
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