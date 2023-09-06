package codesjava;

public class supernumber {
	public static void main(String[] args)
	{
		int i=1,num=100,count=0;
		while(i<=100)
		{
		    if(num%i==0)
		    {
		        count+=1;
		    }
		    i++;
		}
		if(count==5)
		{
			System.out.println("supernumber");
		}
		else
		{
			System.out.println("not a super number.");
		}
	}

}
