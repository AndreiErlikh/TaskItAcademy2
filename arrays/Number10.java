package by.it_academy.tr.arrays;

public class Number10 
{

	public static void main(String[] args) 
	{
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] > i)
			{
                System.out.print(array[i] + " ");
            }
		}
	}

}
