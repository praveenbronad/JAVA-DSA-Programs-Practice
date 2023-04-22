package javaDSAPrograms;

import java.util.Scanner;

/*
 * https://www.youtube.com/watch?v=hjcxNWkZS0k&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=8
 */
public class FactorialOfNumber {
	static int factroial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		
		System.out.println(factroial(n));
	}

}
