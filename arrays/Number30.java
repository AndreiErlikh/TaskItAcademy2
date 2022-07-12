package by.it_academy.tr.arrays;

import java.util.Random;

public class Number30 
{
	public static void main(String[] args)
	{

		int[][] array = new int[4][4];
		
		Random rand = new Random();
		
		int k = 2;
		int p = 3;
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				array[i][j]=rand.nextInt(0,10);
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Вывести " + k + " строку:");
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				if(i == k) 
				{
					System.out.printf("[%4d]",array[k][j]);
				}
			}
		}
		
		System.out.println();
		System.out.println("Вывести " + p + " столбец:");
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				if(j == p) 
				{
					System.out.printf("[%4d]",array[i][p]);
					System.out.println();
				}
			}
		}
	}

}
