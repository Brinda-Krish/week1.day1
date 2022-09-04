package week1.day1;

public class Prime {

	public static void main(String[] args) {
		int n=135;
		boolean prime=true;
		
		for (int i=2; i<=n-1; i++)
		{
			
			if (n%i==0)
			{
				System.out.println("composite");
				prime=false;
				break;
			}
		}
		
		if (prime)
		{
			System.out.println("prime");
		}
		// TODO Auto-generated method stub

	}

}
