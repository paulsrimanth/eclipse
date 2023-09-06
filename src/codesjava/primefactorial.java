package codesjava;

public class primefactorial {
	public static void main(String[] args) {
		int i=2,num=60,c=0;
		while(i<=(num/2))
		{
		    if(num%i==0)
		    {
	
		        for(int p=1;p<=i;p++)//prime
		        {
		            if(i%p==0)
		            {
		                c+=1;
		            }
		            
		        }
		        if(c==2)
		            {
		               System.out.println(i);
		            }
		    }
		    
		 i++;  
		}
		
	}

}
