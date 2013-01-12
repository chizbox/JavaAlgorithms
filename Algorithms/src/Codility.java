
public class Codility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		binary_gap(9);

	}
	
	

	public static int binary_gap(int N){
		int totalCount = 0;
		int prev = 0;
		String bin = Integer.toBinaryString(N);
	
		for(int i = 0; i < bin.length();i++){
			if(bin.charAt(i) == '0'){
				totalCount = totalCount + 1;
			}else{
				totalCount = 0;
			}
				
			if(prev < totalCount){
				prev = totalCount;
			}
		}
		
		System.out.println(bin);
		System.out.println(prev);
		return prev;
	}
	
	
	
	
	
	public static int count_div(int a,int b,int k){
		int result = 0;
		for(int i=a; i<=b;i++){
			if((i % k) == 0) {
				result += 1;
			}
		}
		
		return result;
	}
	
	
}
