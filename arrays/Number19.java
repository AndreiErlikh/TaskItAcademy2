package by.it_academy.tr.arrays;

public class Number19 
{
	public static void main(String[] args)
	{
		int[] array = new int[] {1, 2, 3, 3, 3, 1, 1, 2, 3, 2, 1, 2, 3, 2, 3};
		int count=0;
		int count2=0;
		int bigger=0;
	
		for(int i=0;i<array.length;i++) 
		{
			for(int j=0;j<array.length;j++) 
			{
				if(array[i]==array[j]) 
				{
					count++;
				}
			}
			
			if(count>count2) 
			{
				bigger = array[i];
				count2 = count;
				count = 0;
			}
			else if(count==count2) 
			{
				if(bigger>array[i]) 
				{
					bigger=array[i];
				}
				count = 0;
			}
			count = 0;
		}
		System.out.println("Наиболее часто встречающееся число = " + bigger);
	}

}
