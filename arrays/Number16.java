package by.it_academy.tr.arrays;

public class Number16 
{
	public static void main(String[] args)
	{
		int array[]= {1, 5, 8, 4, 32, 23, 2, 13, 12, 27, 39, 3};
		
		int n=5;
		int max=array[0]+array[11];
		
		for(int i=0;i<n;i++) 
		{
			if(array[i]+array[2*n-i-1] > max)
			{
				max=array[i]+array[2*n-i-1];
			}
			
			System.out.println(array[i]+"+"+array[2*n-i-1] + "\n");
		}
		
		System.out.println("max = " + max);
	}

}
