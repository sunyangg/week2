import java.util.Scanner;
public class week2_2_2//這裡要打檔名
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		double	num1,num2,result=0;
		String c;
		System.out.print("請輸入第一個數字: ");
		num1=scan.nextDouble();
		do
		{
			System.out.print("請輸入第二個數字(不可為0): ");
			num2=scan.nextDouble();
			if(num2==0)
			{
				System.out.print("請輸入第二個數字不可為0!!!\n\n");
			}
		}while(num2==0);
		do
		{
			System.out.print("請輸入一個四則運算的符號: ");
			c=scan.next();	
			if(c.charAt(0)!='+'&& c.charAt(0)!='-' && c.charAt(0)!='*' && c.charAt(0)!='/')
				System.out.print("必須是四則運算的符號!!!\n\n");			
		}while(c.charAt(0)!='+'&& c.charAt(0)!='-' && c.charAt(0)!='*' && c.charAt(0)!='/');
		switch(c.charAt(0))
		{
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;		
		}
		System.out.print("\n\n"+num1+c.charAt(0)+num2+"="+result);		
	}
}