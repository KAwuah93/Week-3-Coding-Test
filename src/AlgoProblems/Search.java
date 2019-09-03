package AlgoProblems;

public class Search {
	public static void main(String[] args) {
		//A few tests
		
		int[] test = {1,2,3,4,5,6,7,8,9,10};
		int t1 = binarySearch(test,0,test.length,2);
		System.out.println(t1);
		int[] test2 = {4,5,6,7,8,9,10,14,16,21,22};
		int[] test3 = {1,2,3,4,5,6,10,20,50};
		int t2 = binarySearch(test2,0,test2.length,14);
		System.out.println(t2);
		int t3 = binarySearch(test3,0,test3.length,20);
		System.out.println(t3);
		
	}
	static int binarySearch(int arr[], int left, int right, int x) 
    { 
        if (right >= left) { 
        	
            int mid = left + (right - left) / 2; 
            if (arr[mid] == x) return mid; 
            else if (arr[mid] > x) return binarySearch(arr, left, mid - 1, x); 
            return binarySearch(arr, mid + 1, right, x); 
        } 
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 

}