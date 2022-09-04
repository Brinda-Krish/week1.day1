package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = num1 + num2;
		System.out.print(num1);
		System.out.print(' ');
		
		System.out.print(num2);
		System.out.print(' ');
		System.out.print(num3);
		System.out.print(' ');
		for (int i=1; i<=8; i++)
		{ num1 = num2;
		num2 = num3;
		num3 = num1 + num2;
		System.out.print(num3);
		System.out.print(' ');
		
		
		}
		
		// TODO Auto-generated method stub

	}

}
