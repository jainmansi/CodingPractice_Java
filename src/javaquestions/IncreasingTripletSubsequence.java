package javaquestions;

public class IncreasingTripletSubsequence {
	public static void main(String args[]) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(increasingTriplet(nums));
	}

	public static boolean increasingTriplet(int[] nums) {
		if (nums == null || nums.length < 3)
			return false;

		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= min) {
				min = nums[i];
			} else if (nums[i] <= secondMin) {
				secondMin = nums[i];
			} else
				return true;
		}
		return false;
	}

}
