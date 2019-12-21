package Interview;

public class occuranceofcharacter {
	static final int MAX_CHAR=256;
	static void occuranceofchar(String str) 
	{
		int[] count=new int[MAX_CHAR];
		for(int i=0;i <str.length();i++)
			count[str.charAt(i)]++;
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(ch[i]==ch[j])
					find++;
			}
			if(find==1)
				System.out.println("no of occurance of" +str.charAt(i) +" is " + count[str.charAt(i)]);
		}

	}

	public static void main(String[] args)
	{
		String str="INFOSYS";
		occuranceofchar(str);
	}
}
