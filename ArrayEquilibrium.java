import java.util.*;

/*
An array A consisting of N integers is given. An equilibrium index 
of this array is any integer P such that 0 ≤ P < N and the sum of 
elements of lower indices is equal to the sum of elements of 
higher indices, i.e
*/

public class ArrayEquilibrium
{
    public static ArrayList<Integer> equilibrium  (){
        int [] A = {-1, 3, -4, 5, 1, -6, 2, 1};
        ArrayList<Integer> results = new ArrayList<Integer>();
     
        int SUM = 0;
        int []runningSum = new int[A.length];
        for ( int i = 0; i < A.length; i++)
        {
            runningSum[i] = SUM;
            SUM += A[i];
        }
     
        for(int i=0; i < A.length; i++)
        {
            if(runningSum[i] == (SUM-runningSum[i]-A[i]))
                results.add(i);
        }
      
        for(Integer i: results)  
            System.out.println(i);
     
        return results;
    }

	public static void main(String[] args) {
		System.out.println(equilibrium ());
	}
}
