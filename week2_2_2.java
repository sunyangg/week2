import java.util.Scanner;
public class week2_2_2//�o�̭n���ɦW
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		double	num1,num2,result=0;
		String c;
		System.out.print("�п�J�Ĥ@�ӼƦr: ");
		num1=scan.nextDouble();
		do
		{
			System.out.print("�п�J�ĤG�ӼƦr(���i��0): ");
			num2=scan.nextDouble();
			if(num2==0)
			{
				System.out.print("�п�J�ĤG�ӼƦr���i��0!!!\n\n");
			}
		}while(num2==0);
		do
		{
			System.out.print("�п�J�@�ӥ|�h�B�⪺�Ÿ�: ");
			c=scan.next();	
			if(c.charAt(0)!='+'&& c.charAt(0)!='-' && c.charAt(0)!='*' && c.charAt(0)!='/')
				System.out.print("�����O�|�h�B�⪺�Ÿ�!!!\n\n");			
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