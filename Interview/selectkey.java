package Interview;

import java.util.Scanner;

public class selectkey {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total elements");
		int T=sc.nextInt();

		int [] arr=new int[T];
		System.out.println("Enter" + T + "integers");
		for(int i=0;i<T;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key to be searched");
		int key=sc.nextInt();
		
		int first=0;
		int last=arr.length-1;
		int mid=(first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("position of key is"  + (mid+1) );
				break;
			}
			else 
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println(-1);
		}
		
		
	
	}

}
