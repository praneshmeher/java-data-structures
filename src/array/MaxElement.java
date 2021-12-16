package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class MaxElement {
	
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        return map.entrySet().stream().max((key1,key2)->key1.getValue()-key2.getValue()).get().getKey();
    }

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,5};
		System.out.println(MaxElement.majorityElement(arr));
	}

}
