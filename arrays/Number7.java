package by.it_academy.tr.arrays;

public class Number7 
{

	public static void main(String[] args)
	{
		double[] array = new double[] {-1.0 , 0.5 , 1.5 , 3.5, 5.0 , 7.3};
		
		double z = 1.0;
		int count = 0;
		
		for(int i=0;i<array.length;i++) 
		{
			if(array[i]>z) 
			{
				array[i]=z;
				count++;
			}
		}
		
		for(double a:array) 
		{
			System.out.println(a);
		}
		
		System.out.println("Количество замен = " + count);
	}

}
