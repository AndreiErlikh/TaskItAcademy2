package by.it_academy.tr.arrays;

import java.util.Random;

public class Number23
{
	public static void main(String[] args)
	{
		int[][] array = new int[2][3];
		
		Random rand = new Random();
		
		for(int i=0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				array[i][j]=rand.nextInt(3);
			}
		}
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<array.length;i++) 
		{
			for(int j=0;j<array[i].length;j+=array[i].length-1)
			{
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
