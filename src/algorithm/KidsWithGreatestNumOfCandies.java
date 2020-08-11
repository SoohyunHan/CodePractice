package algorithm;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumOfCandies {
	public static void main(String args[]) {
		KidsWithGreatestNumOfCandies can = new KidsWithGreatestNumOfCandies();
		
		int [] candies = {2,3,5,1,3};
		can.kidsWithCandies(candies, 3);
		for(Boolean a : can.kidsWithCandies(candies, 3)){
			System.out.println(a);
		}
	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<Boolean>();
		int max = candies[0];
		for (int i = 1; i < candies.length; i++) {
			if (max < candies[i]) {
				max = candies[i];
			}
		}
		for (int i = 0; i < candies.length; i++) {
			if(max <= candies[i]+extraCandies){
				result.add(true);
			}else{
				result.add(false);
			}
			
		}
		return result;
	}
}
