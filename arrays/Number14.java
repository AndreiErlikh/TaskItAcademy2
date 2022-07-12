package by.it_academy.tr.arrays;

public class Number14 
{
	public static void main(String[] args) 
	{
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -20, -3, -5, -50};

		int max = 0;
		int min = 0;
		
		for(int i = 0;i<array.length;i++) 
		{
			
			if(i%2 == 0) 
			{
				if(array[i]>max) 
				{
					max = array[i];
				}
			}
			else if(i%2 != 0) 
			{
				if(array[i]<min) 
				{
					min = array[i];
				}
			}
		}
		System.out.println("Наибольшее из четных = " + max);
		System.out.println("Наименьшее из нечетных = " + min);
	}

}
