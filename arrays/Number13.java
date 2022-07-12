package by.it_academy.tr.arrays;

public class Number13 
{
	public static void main(String[] args) 
	{
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int l = 3;
		int n = 8;
		int m = 2;
		int count = 0;
		
		for(int i=l;i<n;i++) 
		{
			if(array[i]%m == 0) 
			{
				count++;
			}
		}
		
		System.out.println("Количество элементов последовательности натуральных чисел, кратных"
				           + " числу М и заключенных в промежутке от L до N = " + count);
	}

}
