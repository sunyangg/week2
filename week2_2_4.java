import java.util.Scanner;
import java.util.*;
public class week2_2_4//�o�̭n���ɦW
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);	
		ArrayList<String> name=new ArrayList<String>();
		ArrayList<Integer> score=new ArrayList<Integer>();
		int i=0,sToInt,id;
		String n="",s="";
		System.out.println("�m�W�Τ��ƿ�J\"-1\"�i���X\n");
		while(true)
		{
			System.out.print("�п�J�s��"+i+"���ǥ͸��\n");
			System.out.print("�m�W: ");
			n=scan.next();		
			while(true)
			{
				try
				{
					System.out.print("����: ");
					s=scan.next();
					sToInt=Integer.parseInt(s);
				}
				catch(NumberFormatException e)
				{
					System.out.print("���ƪ��a��п�J�Ʀr!\n\n");
					continue;
				}
				break;
			}
			if(n.equals("-1") || s.equals("-1"))
				break;
			name.add(n);
			score.add(sToInt);
			System.out.println(name.get(i)+"  "+score.get(i));
			i++;
		}
		while(true)
		{
			System.out.print("�п�J�s��(-1����): ");
			id=scan.nextInt();
			if(id<i && id>=0)
			{
				System.out.print("�m�W: "+name.get(id)+"\n");
				System.out.print("����: "+score.get(id)+"\n");
			}
			else if(id==-1)
				break;
			else
			{
				System.out.print("�п�J�d�򤺪�id!\n\n");
			}
		}
	}
}