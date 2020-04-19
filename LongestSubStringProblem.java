/******************************************************************************
	//Given a string of code, find the longest substring that begins and ends 
	// with the same character (given CABBAGE)
*******************************************************************************/
public class LongestSubStringProblem
{
	public static void main(String[] args) {
		System.out.println(LongestSubString("CABBAGE"));
		System.out.println(LongestSubString("forgeeksskeegfor"));
	}
	
	public static String LongestSubString(String inputString)
	{
	    //get the string lenght
	    int stringSize = inputString.length();
	    
	    //create a stringSize x stringSize Array
	    int Array[][] = new int [stringSize][stringSize];
	    
	    //initiate the array with 1 for the diagonal
	    for(int i = 0 ; i < stringSize; i++)
	        Array[i][i] = 1;
	    
	    int min = 0, max = 0;
	    int maxLength = 1;
	    char stringArray[] = inputString.toCharArray();
	    
	    // Go ahead and setup my Matrix
	    for(int i = 0; i < stringSize; i++){
	        int rowMin = stringSize-1, rowMax =0;
	        for(int j = 0; j < stringSize; j++)
	        {
	            if(stringArray[i]==stringArray[j])
	            {
	                Array[i][j] = 1;
	                if(rowMin > j)
	                    rowMin = j;
	                if(rowMax < j )
	                    rowMax = j;
	            }
	            // Check for the optimal solution
	            if((rowMax + 1 - rowMin) > maxLength)
	            {
	                maxLength = (rowMax + 1 - rowMin);
	                min = rowMin;
	                max = rowMax;
	            }
	           // System.out.print(Array[i][j]+ " ");
	        }
	        //System.out.println(rowMin +" "+ rowMax);
	    }

	    return inputString.substring(min,max+1);
	}
}
