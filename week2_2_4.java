import java.util.Scanner;
import java.util.*;
public class week2_2_4//這裡要打檔名
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);	
		ArrayList<String> name=new ArrayList<String>();
		ArrayList<Integer> score=new ArrayList<Integer>();
		int i=0,sToInt,id;
		String n="",s="";
		System.out.println("姓名或分數輸入\"-1\"可跳出\n");
		while(true)
		{
			System.out.print("請輸入編號"+i+"的學生資料\n");
			System.out.print("姓名: ");
			n=scan.next();		
			while(true)
			{
				try
				{
					System.out.print("分數: ");
					s=scan.next();
					sToInt=Integer.parseInt(s);
				}
				catch(NumberFormatException e)
				{
					System.out.print("分數的地方請輸入數字!\n\n");
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
			System.out.print("請輸入編號(-1結束): ");
			id=scan.nextInt();
			if(id<i && id>=0)
			{
				System.out.print("姓名: "+name.get(id)+"\n");
				System.out.print("分數: "+score.get(id)+"\n");
			}
			else if(id==-1)
				break;
			else
			{
				System.out.print("請輸入範圍內的id!\n\n");
			}
		}
	}
}