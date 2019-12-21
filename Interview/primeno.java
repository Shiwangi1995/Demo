package Interview;

public class primeno {
public static void main(String[] args)
{
	int n=15;
	int count=0;
	if(n==0||n==1)
	{
		System.out.println(" not a prime no");
	}
	else
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
	if(count==0)
	{
		System.out.println("a prime no");
	}
	else
	{
		System.out.println(" not a prime no");
	}
	}
}
}
