package by.it_academy.tr.arrays;

public class Number20 
{
	public static void main(String[] args)
	{
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 6, 10, 2, 4};
		
		for(int i = 0;i<array.length-1;i++) 
		{
			for(int j=i+1;j<array.length;j++) 
			{
				if(array[i]==array[j] && array[i]!=0) 
				{
					array[j]=0;
				}
			}
		}
		
		for(int i:array) 
		{
			System.out.println(i);
		}
	}

}
