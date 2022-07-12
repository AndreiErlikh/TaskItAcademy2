package by.it_academy.tr.arrays;

public class Number3 
{

	public static void main(String[] args)
	{
		int[] array = new int[] {-2,2,3,-1,2};
		
			if(array[0]>0) 
			{
				System.out.println("Раньше встречается положительное = " + array[0]);
			}
			else if(array[0]<0)
			{
				System.out.println("Раньше встречается отрицательное = " + array[0]);
			}
			else
			{
				System.out.println("Раньше встречается = 0 ");
			}
			
		}
	}


