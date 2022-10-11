package ArrayProgram;

public class P01_print_the_elements_of_an_array 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
////////////////OR//////////////////
		
		int b[]= new int[5];
		
		b[0]=1;
		b[1]=1;
		b[2]=3;
		b[3]=4;
		b[4]=5;
		
		for (int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}
				
		
		
	}

}
