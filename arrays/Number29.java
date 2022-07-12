package by.it_academy.tr.arrays;

import java.util.Random;

public class Number29 
{
	public static void main(String[] args)
	{
		int[][] array = new int[4][4];
		
		Random rand = new Random();
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				array[i][j]=rand.nextInt(0,10);
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Диагональ:");
		String s="    "; 
		for(int i=0;i<array.length;i++) 
		{
			System.out.print(s);
			System.out.printf("[%4d]",array[i][i]);
			System.out.println();
			s=s+"    ";
		}
	}

}
