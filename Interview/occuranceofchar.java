package Interview;

public class occuranceofchar {
	
	static int occurance(String str,char c)
	{
		int count=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i) == c)
					count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str="the mother india";
		char c='t';
		
		System.out.println(occurance(str,c));

	}

}
