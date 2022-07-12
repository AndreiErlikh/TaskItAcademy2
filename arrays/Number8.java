package by.it_academy.tr.arrays;

import java.util.Random;

public class Number8
{
	public static void main(String[] args) 
	{
		double[] array = new double[10];
		
		Random rand = new Random();
		
		for(int j = 0;j<array.length;j++) 
		{
			array[j] = rand.nextDouble(-100 , 100);
		}
		
		int big = 0;
		int small = 0;
		int zero = 0;
		
		for(int i = 0;i<array.length;i++) 
		{
			if(array[i]>0) 
			{
				big++;
			}
			else if(array[i]<0) 
			{
				small++;
			}
			else if(array[i]==0) 
			{
				zero++;
			}
		}
		
		System.out.println("Положительных чисел в массиве = " + big + 
						   "\nОтрицательных чисел в массиве " + small + 
						   "\nЧисел равных нулю = " + zero);
	}

}
