package by.it_academy.tr.arrays;

public class Number12 
{
	public static void main(String[] args)
	{
		double[] array = new double[] {1, 2.5, -3.4, 5.0, -7.4, 7, 2.3, 11};
		
		double summ = 0;
		
		for(int i = 0;i<array.length;i++) 
		{
			if(i%2 != 0 && i != 1) 
			{
				summ += array[i];
			}
		}
		
		System.out.println("Сумма  чисел, порядковые номера которых являются простыми числами = " + summ);
	}

}
