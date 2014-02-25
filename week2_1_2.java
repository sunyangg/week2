public class week2_1_2
{
	public static void main(String args[])
	{
		int num[]={1,2,3,4,5,6,7,8,9};
		int sum=0;
		double avg;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		avg=sum/num.length;
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}
}