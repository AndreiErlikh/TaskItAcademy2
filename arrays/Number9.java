package by.it_academy.tr.arrays;

public class Number9 
{

	public static void main(String[] args)
	{
		int[] array = new int[] {1 , 5 , 0 , -2 , 10 , -5 , 18};
		
		int min = array[0];
		int max = array[0];
		
		for(int i = 0;i<array.length;i++ ) 
		{
			if(array[i] < min) 
			{
				min = array[i];
			}
			else if(array[i] > max) 
			{
				max = array[i];
			}
		}
		
		for(int i = 0 ; i<array.length;i++) 
		{
			if(array[i] == min) 
			{
				array[i] = max;
			}
			else if(array[i] == max) 
			{
				array[i] = min;
			}
		}
		
		System.out.println("Минимальное число массива = " + min);
		System.out.println("Максимальное число массива = " + max);
	}

}
