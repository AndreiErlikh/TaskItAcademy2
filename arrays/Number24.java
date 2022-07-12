package by.it_academy.tr.arrays;

import java.util.Random;

public class Number24 
{
	public static void main(String[] args)
	{
		int[][] array = new int[4][3];
		
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
				if(i == 0 || i == array.length-1) 
				{
					System.out.printf("[%4d]",array[i][j]);
				}
			}
			System.out.println();
		}
	}

}
