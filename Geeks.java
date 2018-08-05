import java.util.Scanner;
class Geeks{
public static void main(String...s)
{
       System.out.println("Enter the size of String array:");
	   int z = new Scanner(System.in).nextInt();
	   String[] array1 = new String[z];

		for (int i = 0; i < array1.length; i++) 
		{
			System.out.println("Enter the element " + (i + 1) + " :");
			array1[i] = new Scanner(System.in).next();
		}
		
		System.out.println("Enter the size of int array:");
		int y = new Scanner(System.in).nextInt();
		int[] array2 = new int[y];
     
		for (int i = 0; i < array2.length; i++) 
		{
			System.out.println("Enter the element " + (i + 1) + " :");
			array2[i] = new Scanner(System.in).nextInt();
		}
	  
		String[] result1=sortedArray(array1,array2);

    System.out.println("Output is: ");
    for(String a:result1)
    System.out.print(a+"  ");
}

static String[] sortedArray(String[] array1,int[] array2)
{
	int m = array2[0];
		for (int i = 0; i < array2.length; i++) 
		{
			if (array2[i] > m)
				m = array2[i];
		}
		
	String[] result1 = new String[array2.length];	
    int c=0;
        for(int i =0; i<=m; i++)
        {

         for(int j=0; j<array2.length; j++)
	     {
            if(array2[j]==i)
		    {
			result1[c]=array1[j];
			c++;
            }
         }
        }
      return result1;
}
}
