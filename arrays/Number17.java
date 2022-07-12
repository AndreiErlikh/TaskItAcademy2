package by.it_academy.tr.arrays;

public class Number17
{
	public static void main(String[] args) 
	{
		int[] array = new int[] {1, 2, 5, -2, -4, 8, -10, 12, -15};
		
		for(int i = 0;i<array.length-1;) 
		{
			if(array[i+1]<array[i]) 
			{
				int j;
				j=array[i];
				array[i]=array[i+1];
				array[i+1]=j;
				i=0;
				continue;
			}
			i++;
		}
		
		int[] array2 = new int[array.length-1];
		
		for(int i = 1, j = 0;j<array2.length;i++ , j++) 
		{
			array2[j]=array[i];
		}
		
		System.out.print("Массив без минимального значения = ");
		for(int i:array2) 
		{
			System.out.print(i + " ");
		}
	}

}
