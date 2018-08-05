import java.util.Scanner;
public class Desired
{
public static void main(String...args){
System.out.println("Enter the size of desiredArray:");
int N = new Scanner(System.in).nextInt();
int[] desiredArray = new int[N];

		for (int i=0; i<desiredArray.length; i++) {
			System.out.println("Enter the element: " );
			desiredArray[i] = new Scanner(System.in).nextInt();
		}
		int ans = optimalSolutions(desiredArray);
System.out.println("Optimal number of operations are: "+ans );
}

static int optimalSolutions(int[] temp)                    ////temp is desiredArray
{
	int count=0; 
	while(!zeroChecker(temp))                   // zeroChecker() returns true if all elements are 0
   { 
   for(int i=0; i<temp.length; i++)
   {
	   if(temp[i]%2!=0)                        ///if temp[i] is odd
	   { 
		   temp[i]--;
		   count++;                     ///to count each increment operation
	   }
    }
	 if(!zeroChecker(temp))
	 {
		   for(int j=0; j<temp.length; j++)       /// to divide each element by 2(All elements are even already)
			   temp[j]=temp[j]/2;
		       count++;                      /// to count double operation
	 }
   }
return count;	
}
static boolean zeroChecker(int[] a){
	for(int i=0; i<a.length; i++)
	{
		if(a[i]!=0)
			return false;
	}
	return true;
}

}
