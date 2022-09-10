package week1.day1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] a = {22, 3981, -19, 82, 0, 45, 37};
		Arrays.sort(a);
		
//		for (int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		// 
//		System.out.println(a);
		System.out.println("This is minimum " + a[0]);
		System.out.println("This is maximum " + a[a.length-1]);
	}

}
