package javaDSAPrograms;

import java.util.Scanner;

public class Vowels {
	static int countVowels(String word)
	{
		int count=0;
		for(int i =0;i<=word.length()-1;i++)
		{
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				count++;
			}
			
		}
		return count;
		
	}
	
	static void vowels(String str)
	{
		
		String str1="";
		for(int i =0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				str1+=str.charAt(i);
			}
			
		}
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		vowels(str);
		System.out.println(countVowels(str));

	}

}
