package by.it_academy.tr.arrays;

import java.util.Random;

public class Number26 
{
	public static void main(String[] args)
	{
		int[][] array = new int[5][3];
		
		Random rand = new Random();
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				array[i][j]=rand.nextInt(10);
			}
		}
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				if(i%2 != 0 && i != 0 && array[i][0]>array[i][array[i].length-1]) 
				{
					System.out.printf("[%4d]",array[i][j]);
				}
			}
			System.out.println();
		}
	}

}
