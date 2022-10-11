package ArrayProgram;

public class P02_Odd_Even_number 
{
	public static void main(String[] args) 
	{
		int a []= {11,55,33,84,12,96,74,25,55,93,19};
		
		for (int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even number"+a[i]);
			}
			else
			{
				System.out.println("Odd number"+a[i]);
			}
		}

	}

}
