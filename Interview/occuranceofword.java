package Interview;

public class occuranceofword {
	
	static int occurance(String str,String word)
	{
		String a[]=str.split(" ");
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(word.equals(a[i]))
				count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		String str="the mother india";
		String word="the";
		
		System.out.println(occurance(str,word));

	}

}
