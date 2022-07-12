package by.it_academy.tr.arrays;

public class Number33 
{
	public static void main(String[] args)
	{
		int[][] array = new int [4][4];
		
		for(int i = 0;i<array.length;i++) 
		{
			for(int j = 0;j<array[i].length;j++) 
			{
				array[i][j]=j;
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------");
		for(int i=0;i<array.length;i++)
		{
			int o = array[i].length;
			
			for(int j=0;j<array[i].length;j++)
			{
				if(i%2 != 0) 
				{
					System.out.printf("[%4d]",array[i][o-1]);
				}
				else if(i%2 == 0) 
				{
					System.out.printf("[%4d]",array[i][j]);
				}
				o--;			}
			System.out.println();
		}
		
	}

}
