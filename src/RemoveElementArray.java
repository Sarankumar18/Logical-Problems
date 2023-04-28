
class Solution {
    public int removeElement(int[] nums, int val) {
        int temp[] = new int[nums.length];
        int out = 0, j = 0;
        for(int i  = 0 ; i<nums.length-1 ; i++){
            if(nums[i] != val){
                temp[j++] = num[i];
                out++;
            }
        }
        System.out.print(nums);
        return out;
    }
}

public class RemoveElementArray {

	public static void main(String[] args) {
		int nums
		Solution s = new Solution();
		s.removeElement(nums, 0)
	}

}
