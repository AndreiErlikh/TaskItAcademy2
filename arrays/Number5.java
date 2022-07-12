package by.it_academy.tr.arrays;

public class Number5 
{

	public static void main(String[] args)
	{
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] arrayChet = new int[10];
		
		for(int i = 0, a = 0;i<array.length;i++) 
		{
			if(array[i] % 2 == 0) 
			{
				arrayChet[a]=array[i];
				a++;
			}
		}
		
		for(int i:arrayChet) 
		{
			System.out.println(i);
		}
	}

}
