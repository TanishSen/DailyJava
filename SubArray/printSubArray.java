package DailyJava.SubArray;

public class printSubArray 
{
	public static void main(String[] args) 
	{
	    int[] arr = {1,-2,6,-1,3};
	    
		for(int i=0 ; i<5 ; i++)
		{
		    for(int j=i ; j<5 ; j++)
		    {
		        int k=i;
		        
		        while(k<=j)
		        {
		            System.out.print(arr[k]);
		            k++;
		        }
		        System.out.print(" ");
		    }
		    
		    System.out.println();
		}
	}
}

    
// How to run this code:
// Step 1: Navigate to the parent directory (where DailyJava folder is located):
// ---> cd /Users/tanishsen/Desktop/JAVA
// Step 2: Compile the Java file:
// ---> javac DailyJava/SubArray/printSubArray.java
// Step 3: Run the program using the full package name:
// ---> java DailyJava.SubArray.printSubArray
