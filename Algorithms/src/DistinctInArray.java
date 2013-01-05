import 	java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DistinctInArray {
	private static ArrayList<Integer> getDistinct(int[] numbers){
		ArrayList<Integer> distinctNums = new ArrayList();
		boolean isSame;
		
		for(int i=0;i < numbers.length;i++){
			isSame = false;
			
			if (distinctNums.size()>=1){
				
				for (int x = 0; x < distinctNums.size(); x++){
					
					int dist = (Integer) distinctNums.get(x);
					
					if (Math.abs(dist) == Math.abs(numbers[i])){
						isSame = true;
					}
				}
			
			}

			if (!isSame){
				distinctNums.add(Math.abs(numbers[i]));
			}
		}
		return distinctNums;
	}
	
	
	private static int countDistinctUsingSet(int[] nums) {
	    Set<Integer> s = new HashSet<Integer>();
	    for (int n : nums)
	        s.add(Math.abs(n));
	    int count = s.size();
	    return count;
	}
	
	private static int countDistinctLeftToRight(int[] nums){
		return (Integer) null;
				
	}
	
	
	public static void main(String args []){
		int[] numbers = {1,2,7,4,4,1,5,-2,9,100};
		
		long time2 = System.nanoTime();
		System.out.println("Count Using Set: " + countDistinctUsingSet(numbers));
		System.out.println("Time2 Consumed is: " + time2);
		
		
		long time1 = System.nanoTime();
		ArrayList<Integer> distinctNums = getDistinct(numbers);
		System.out.println("Distinct Number is: " + distinctNums.size());
		System.out.println("Time1 Consume is: " + time1);
		
		if (time1 < time2 ){
			System.out.println("time1 is faster than time2");
		}else{
			System.out.println("time2 is faster than time1");
		}
		
	}

}
