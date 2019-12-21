package Interview;

public class frequency {
	
	static void occurance(String str)
	{
		int count[]=new int[256];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			
		ch[i]=str.charAt(i);
		int find=0;
		for(int j=0;j<=i;j++)
		{
			if(str.charAt(i)==ch[j])
				find++;
		}
		if(find==1)
			System.out.println("no of occur is" + count[str.charAt(i)]);
		}
	}

	public static void main(String[] args) {
		String str="thisisit";
		occurance(str);
	}

}
