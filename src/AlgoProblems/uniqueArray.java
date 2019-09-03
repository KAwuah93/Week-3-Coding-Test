package AlgoProblems;

public class uniqueArray {
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6,7,8,9,0,9,9,9};
		int[] y = removeDups(x,x.length);
		
		for(int num : y) {
			System.out.println(num);
		}
	}
	public static int[] removeDups(int[] arr, int arrlength) {
		//keeping track of the unique numbers to create an array out of later
		int unique = 0;
		//an array for checking the other values against
	    boolean[] check = new boolean[arrlength+1];
	    
	    for (int i : arr) {
	        if (!check[i]) {
	            unique++;
	            check[i] = true;
	        }
	    }
	    int[] result = new int[unique];
	    int j = 0;
	    for (int i=0; i<check.length; i++) {
	        if (check[i]) result[j++] = i;
	    }
	    return result;
	}
}
