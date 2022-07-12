package by.it_academy.tr.arrays;

import java.util.Random;

public class Number28 
{
	public static void main(String[] args)
	{
		int[][] array = new int[5][5];
		
		Random rand = new Random();
		
		int count = 0;
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				array[i][j]=rand.nextInt(0,10);
			}
		}
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				if(array[i][j] == 7) 
				{
					count++;
				}
			}
		}
		System.out.println("Число 7 среди элементов массива встречается = " + count );
	}

}
