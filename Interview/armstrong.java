package Interview;

public class armstrong {

	public static void main(String[] args) {
		int n=121;
		int rev=0;
		int temp=n;

		while(n>0) {
			int r=n%10;
			n=n/10;
			rev=rev+(r*r*r);
		}
		if (temp==rev)
		{
			System.out.println("armstrong no");

		}
		else
		{
			System.out.println("not an armstrong no");
		}
	}

}
