import java.util.*;


public class CheckPairsInArray
{
    
    //Complete the pairs function below. It must return an integer representing 
	//the number of element pairs having the required difference.

pairs has the following parameter(s):

k: an integer, the target difference
arr: an array of integers
    
    public static HashMap CheckPairs  (int [] A, int sum){
        
    static int pairs( int[] A, int sum) {
        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        HashMap results = new HashMap();
        int count = 0;
        for(int i=0; i < A.length; i++)
        {
            myMap.put(A[i], A[i]-sum);
        }
        for(int i=0; i < A.length; i++)
        {
            if(myMap.containsKey(A[i]))
            {   int value = A[i]-sum;
                if (myMap.containsKey(value))
                {
                    count++;
                }
            }
        }

        return count;
    }


	public static void main(String[] args) {
	    int [] A = {11,2,3,4,5,6,12, 9, 14};
        int result = 23;
		HashMap results = CheckPairs (A, result);
	    System.out.println(results);
	}
}
