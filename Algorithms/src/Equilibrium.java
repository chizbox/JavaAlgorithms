
public class Equilibrium {

	public static void main(String[] args) {
		int[] equilibrium = {-7,1,5,2,-4,3,0};
		
		for(int i = 0; i <= (equilibrium.length - 1); i++){
			int leftTotal = 0;
			int rightTotal = 0;
			
			for(int left = 0;left <= i; left++ ){
				leftTotal = leftTotal + equilibrium[left];
			}

			System.out.println("leftTotal: " + leftTotal);
			
			for(int right = (equilibrium.length -1); right > i;right--){
				rightTotal = rightTotal + equilibrium[right];
			}
			
			System.out.println("RightTotal: "+ rightTotal);

			if(leftTotal == rightTotal){
				System.out.println("Congratulations you have found the Equilibrium");				
				break;
			}
			
			System.out.println("No Equilibrium Found");
		}

	}

}
