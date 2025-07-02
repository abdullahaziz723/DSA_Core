public class firstandLastPosition_42 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);  // First occurrence
        ans[1] = search(nums, target, false); // Last occurrence

        return ans;
    }

    static int search(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target < nums[mid]) {
                e = mid - 1;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                ans = mid;
                if (findFirst) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}
