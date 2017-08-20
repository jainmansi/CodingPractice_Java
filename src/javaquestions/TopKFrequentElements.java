package javaquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
	
	public static void main (String args[]) {
		int[] nums = {1,1,1,2,2,2,3,3,3,3};
		int k = 2;
		List<Integer> result = topKFrequent(nums, k);
		
		for(int i : result) {
			System.out.println(i);
		}
	}

	public static List<Integer> topKFrequent(int[] nums, int k) {

		List<Integer>[] bucket = new List[nums.length + 1];
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i]))
				map.put(nums[i], 0);

			map.put(nums[i], map.get(nums[i]) + 1);
		}

		for (int key : map.keySet()) {
			int frequency = map.get(key);
			if (bucket[frequency] == null)
				bucket[frequency] = new ArrayList<>();

			bucket[frequency].add(key);
		}

		List<Integer> result = new ArrayList<>();

		for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
			if (bucket[i] != null)
				result.addAll(bucket[i]);
		}

		return result;

	}
}
