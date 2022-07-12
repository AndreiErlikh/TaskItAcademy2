package by.it_academy.tr.arrays;


public class Number2
{

	public static void main(String[] args) 
	{
		int[] array = new int[] {1,2,3,9,8,0,4,0,3,5,6,0};
		int[] arrayZero = new int[10];
		
		for(int i=0,a=0;i<array.length;i++) 
		{
			if(array[i]==0) 
			{
				arrayZero[a]=i;
				a++;
			}
		}

		for(int i:arrayZero) 
		{
			System.out.println(i);
		}
	}

}
