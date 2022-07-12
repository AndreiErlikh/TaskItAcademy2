package by.it_academy.tr.arrays;

import java.util.Random;

public class Number18 
{
	public static void main(String[] args) 
	{
		int[] array = new int[10];
		int[] arrayCell = new int[2];
		
		Random rand = new Random();
		
		for(int a = 0;a<1;)
		{
			for(int i=0;i<arrayCell.length;i++) 
			{
				arrayCell[i]=rand.nextInt(10);
			}
			if(arrayCell[0]==arrayCell[1]) 
			{
				a=0;
				continue ;
			}
			a++;
		}
		
		if(arrayCell[0]>arrayCell[1]) 
		{
			int j = arrayCell[0];
			arrayCell[0]=arrayCell[1];
			arrayCell[1]=j;
		}
		
		for(int i = 0;i<arrayCell.length;i++) 
		{
			array[arrayCell[i]] = rand.nextInt(1,7);
		}
		
		if(arrayCell[1]-arrayCell[0]>3) 
		{
			array[arrayCell[0]+1]=2;
			array[arrayCell[0]+2]=3;
			array[arrayCell[0]+3]=5;
		}
		else if(arrayCell[0]>=3) 
		{
			array[arrayCell[0]-1]=2;
			array[arrayCell[0]-2]=3;
			array[arrayCell[0]-3]=5;
		}
		else if(arrayCell[0]<3) 
		{
			array[arrayCell[1]+1]=2;
			array[arrayCell[1]+2]=3;
			array[arrayCell[1]+3]=5;
		}
		
		for(int i:array) 
		{
			System.out.print(i + " ");
		}
	}

}
