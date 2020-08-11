package algorithm;

public class NumOfGoodPair {

	public static void main(String[] args) {
		NumOfGoodPair pa = new NumOfGoodPair();
		int [] nums = {1,2,3,1,1,3};
		System.out.println(pa.numIdenticalPairs(nums));
	}
	
	public int numIdenticalPairs(int[] nums){
		int result = 0 ;
		for(int i = 0 ; i < nums.length-1; i ++){
			for(int j = 0 ; j < nums.length;j++){
				if(nums[i] == nums[j] && i < j ){
					result ++;
				}
			}
		}
		return result;
	}

}
