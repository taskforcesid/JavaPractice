import java.util.*;

public class MergeAndSortArrays
{
    
    public static int [] SortArrays (ArrayList<int []> inputArrays)
    {
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        int numberOfElements  = 0;
        
        for(int i =0; i < inputArrays.size(); i++)
        {
            numberOfElements += inputArrays.get(i).length;
        }
        int []results = new int[numberOfElements];
        
        int index = 0;
        for(int i=0; i < inputArrays.size(); i++)
        {
            for(int j=0; j < inputArrays.get(i).length;j++)
            {
                results[index] = inputArrays.get(i)[j];
                index++;
            }
        }
        
        Arrays.sort(results);
        return results;
    }
    
    
	public static void main(String[] args) {
	    
	    int [] Array1 = {1, 3, 4, 99};
	    int [] Array2 = {2, 5};
	    int [] Array3 = {8, 12};
	    int [] Array4 = {1, 3, 4, 7};
	    int [] Array5 = {2, 5 };
	    int [] Array6 = {5, 7 , 8};
	    int [] Array7 = {1, 3, 4, 7};
	    int [] Array8 = {2, 5 , 6, 31};
	    int [] Array9 = {5, 7 , 8, 12};
	    
	    
		ArrayList <int []> myList = new ArrayList<int []>();
		myList.add(Array1);
		myList.add(Array2);
		myList.add(Array3);
		myList.add(Array4);
		myList.add(Array5);
		myList.add(Array6);
		myList.add(Array7);
		myList.add(Array8);
		myList.add(Array9);
		
		int []results = SortArrays (myList);
		for(int i: results)
		    System.out.print(i + " ");
	}
}
