package by.it_academy.tr.arrays;

public class Number1
{

	public static void main(String[] args) 
	{
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10,0,2,4,0,6,0};
		int k = 2;
		int summ = 0;
		
		for(int i = 0;i<array.length;i++) 
		{
			if(array[i] % k == 0) 
			{
				summ += array[i];
			}
		}
		System.out.println(summ);
	}

}
