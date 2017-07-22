package javaquestions;

public class RotatedSortedArraySearch {
	
	public static void main(String[] args) {
		int[] nums = {1, 3};
		int target = 0;
		
		System.out.println(search(nums, target));
	}

	public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return -1;
        
        int start = 0;
        int end = nums.length -1;
        int mid = 0;
        while(start <= end) {
            mid =  start + (end - start)/2;
            
            if(nums[mid] == target)
                return mid;
            
            if(target < nums[mid] && target > nums[start]) {
                end = mid - 1;
            } else if(target > nums[mid] && target > nums[start]) {
                start = mid + 1;
            } else 
            	start = mid + 1;
        }
        return -1;
    }
}
