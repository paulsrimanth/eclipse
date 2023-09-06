package forloops;

public class prime {
	public static void main(String[] args) 
	{
		int num=50,c=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c+=1;
			}
		}
		if(c==2)
		{
			System.out.println("prime");
			
			
		}
		else
			System.out.println("not prime");
	}

}
