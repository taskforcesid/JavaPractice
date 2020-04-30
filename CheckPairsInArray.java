import java.util.*;


public class CheckPairsInArray
{
    
    //How to find all pairs in an array of integers whose sum is equal to the given number
    
    public static HashMap CheckPairs  (int [] A, int sum){
        
        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        HashMap results = new HashMap();
        for(int i=0; i < A.length; i++)
        {
            int value = sum - A[i];
            myMap.put(A[i], value);
            
            if(myMap.containsKey(value))
            {
                int cache = myMap.get(value);
                if(cache == A[i])
                {
                    results.put(value, A[i]);
                }
            }
        }
        return results;
    }

	public static void main(String[] args) {
	    int [] A = {11,2,3,4,5,6,12, 9, 14};
        int result = 23;
		HashMap results = CheckPairs (A, result);
	    System.out.println(results);
	}
}
