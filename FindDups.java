package week1.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int[] nums = {12, 25, 12, 56, 89, 25};
		Arrays.sort(nums);
		
		for (int i=0; i<nums.length-1; i++)
		{
			int first = nums[i];
			int second = nums[i+1];
					if (first==second)
						System.out.println(nums[i]);
						
		}
	}

}
