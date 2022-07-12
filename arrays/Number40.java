package by.it_academy.tr.arrays;

public class Number40 
{
	public static void main(String[] args) 
	{
		//Время 5 утра, это самое ужасное что я писал=)
		
		int[][] array = new int[7][7];
		
		for(int i=0;i<array.length;i++) 
		{
			int j = 0;
			int k = array[i].length-1;
			for(;j<i+1 ; j++,k--) 
			{
				array[i][j]=1;
				array[i][k]=1;
				
			}
			if(j>k) 
			{
				break;
			}
		}
		
		int count = 0;
		
		for(int i = array.length-1;i>0;i--,count++) 
		{
			int j = 0;
			int k = array[i].length-1;
			for(;j<count+1 ; j++,k--) 
			{
				array[i][j]=1;
				array[i][k]=1;	
			}
			
			if(j>k) 
			{
				break;
			}
		}
		
		for(int i=0;i<array.length;i++) 
		{
			for(int j=0;j<array[i].length;j++) 
			{
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
