package by.it_academy.tr.arrays;

import java.util.Random;

public class Number27 
{
	public static void main(String[] args) 
	{
		int[][] array = new int[5][5];
		
		Random rand = new Random();
		
		int summ = 0;
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				array[i][j]=rand.nextInt(-10,10);
			}
		}
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				if(array[i][j]< 0 && array[i][j]%2 != 0 ) 
				{
					summ += Math.abs(array[i][j]);
				}
			}
		}
		
		System.out.println("Сумма модулей отрицательных нечетных элементов = " + summ);
	}

}
