import java.util.Scanner;
public class week2_2_1
{
	public static void main(String args[])
	{		
		String name;
		int year;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�п�J�m�W: ");
		name=scan.nextLine();
		System.out.print("�п�J�褸�ͤ�: ");
		year=scan.nextInt();
		System.out.println("�z���m�W�O: "+name);
		System.out.println("�z���X�ͦ~�O(����): "+(year-1911));
	}
}