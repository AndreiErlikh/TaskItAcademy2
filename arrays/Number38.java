package by.it_academy.tr.arrays;

public class Number38 
{
	public static void main(String[] args)
	{
		int[][] array = new int [4][4];
		
		for(int i=0;i<array.length;i++) 
		{
			for(int j=0;j<array[i].length-i;j++)
			{
				array[i][j]=i+1;
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
		
	}

}
