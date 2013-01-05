import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Dominator {
	
	public static int nullToInt(Object intI){
		if(intI != null){
			return (int)intI;
		} else {
			return 0;
		}
	}
	
	
	public static int findDominator(int [] myList){
		int[] sortList = myList.clone();
		Arrays.sort(sortList);
		int count = 0;
		int domNum = 0;
		int curNum = 0;
		int max = 0;
		double maxPercentage = 0;
		
		for(int num: sortList){
			if(curNum != num){
				count = 0;
				curNum = num;
			}else{
				count++;
				if(count > max){
					max = count;
					domNum = num;
				}
			}
		}
		int length = myList.length;
		maxPercentage = (double) max / (double) length;     
		System.out.println("max count: " + max);
		System.out.println("percentage count: " + maxPercentage);
		
		if (maxPercentage >= .5){
		return domNum;
		}else{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int[] dominator = {1,2,3,1,1,1};
		System.out.println("The Dominating number is: " + findDominator(dominator));
	}

}
