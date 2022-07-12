package by.it_academy.tr.arrays;

import java.util.Random;

public class Number22 
{
	public static void main(String[] args) 
	{
		Random rand=new Random();
		
		int array[][]=new int [2][3];
		
		for(int i=0;i<array.length;i++) 
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=rand.nextInt(9);
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
	}

}
