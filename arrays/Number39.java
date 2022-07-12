package by.it_academy.tr.arrays;

public class Number39 
{
	public static void main(String[] args)
	{
		int[][] array=new int [5][5];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i;j<array[i].length-i;j++)
			{
				array[i][j]=1;
			}
		}
		
		int c=0;
		
		for(int i=array.length-1;i>=0;i--)
		{
			for(int j=c;j<array[i].length-c;j++) 
			{
				array[i][j]=1;
			}
			c++;
		}
		
		for(int i=0;i<array.length;i++) 
		{
			for(int j=0;j<array[i].length;j++) 
			{
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
