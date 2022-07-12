package by.it_academy.tr.arrays;

import java.util.Random;

public class Number31 
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
		
		System.out.println("Вывести элементы в порядке:первая строка справа налево, вторая строка слева направо, "
				         + "третья строка справа налево:");
		
		for(int i = 0;i<array.length;i++) 
		{
			int o = array[i].length;
			
			for(int j = 0;j<array[i].length;j++) 
			{
				if(i%2 == 0) 
				{
					System.out.printf("[%4d]",array[i][o-1]);
				}
				else if(i%2 != 0) 
				{
					System.out.printf("[%4d]",array[i][j]);
				}
				o--;
			}
			System.out.println();
		}
	}

}
