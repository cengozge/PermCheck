import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import conversion.Conversions;


public class PermutationCheck {

	public static void main(String[] args){
		int[] A = {8,6,4};
		System.out.println(Arrays.asList(solution(A)));
	}
	
	public static int solution(int[] A){
		
		List<Integer> list = Conversions.fromArrayToList(A);
		Collections.sort(list);
		
		int tempVar = 0;
		
		for (Integer integer : list) {
			if(++tempVar == integer){
				;
			}
			else
				return 0;
		}
		return 1;
	}
}
