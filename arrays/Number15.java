package by.it_academy.tr.arrays;

public class Number15
{
	public static void main(String[] args) 
	{
		double[] array = new double[] {-5, -2.2, -1.5, -0.345, 0.4, 1, 2.7, 3.5, 4.5, 5};
		
		double c = -2;
		double d = 4;
		
		for(int i = 0;i<array.length;i++) 
		{
			if(array[i]>=c && array[i]<=d) 
			{
				System.out.println("Элемент " + array[i] + " принадлежит отрезку от " + c + " до " + d);
			}
		}
	}

}
