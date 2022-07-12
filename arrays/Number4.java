package by.it_academy.tr.arrays;

public class Number4
{

	public static void main(String[] args) 
	{
		double[] array = new double[] {1 , 2 , 3 , 0.5};
		int checkbox = 0;
		
		for(int i = 0; i<array.length-1;i++) 
		{
			if(array[i]>array[i+1]) 
			{
				checkbox++;
				break;
			}
			
		}
		
		if(checkbox>0)
		{
			System.out.println("Последовательность не является возрастающей");
		}
		else 
		{
			System.out.println("Последовательность является возрастающей");
		}
	}

}
