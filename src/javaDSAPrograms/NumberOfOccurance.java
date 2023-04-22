package javaDSAPrograms;

import java.util.Scanner;

public class NumberOfOccurance {
	
	static int noOfOccurance(String str,char ch)
	{
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}	
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		System.out.println("Enter charactor");
		System.out.println(noOfOccurance(str,'a'));

	}

}
