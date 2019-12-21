package Interview;

public class palindrome {

	public static void main(String[] args) {
		int n=123;
		int temp;
		int revno=0;
		int num=0;
		temp=n;
		while(n>0)
		{
			int r=n%10;
		  revno=(num*10)+r;
			n=n/10;
		}
		if(temp==revno)
		
			System.out.println("palindrome");
		else
		
			System.out.println("nope");
		

	}

}
