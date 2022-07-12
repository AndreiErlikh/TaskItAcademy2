package by.it_academy.tr.arrays;

public class Number11 
{
	public static void main(String[] args)
	{
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int m = 2;
		int l = 0;
		
		for(int i = 0; i<array.length;i++) 
		{
			if(array[i] % m == l) 
			{
				System.out.println("Натуральные числа,у которых остаток от деления на М равен L " + array[i]);
			}
		}
	}

}
