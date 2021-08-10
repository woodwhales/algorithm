package cn.woodwhales.algorithm.search;

/**
 * @author woodwhales on 2021-08-10 22:58
 * @Description 二分查找
 * 参见：https://leetcode-cn.com/problems/binary-search/
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{23, 45, 56, 67, 78, 89, 90, 91, 100, 103};
        int num = 0;

        int index = search(arr, num);
        System.out.println("index = " + index);
        if(index != -1) {
            System.out.println("search result = " + (arr[index] == num));
        }
    }

    public static int search(int[] nums, int target) {
        int ans = -1;
        if (nums == null) {
            return ans;
        }

        int L = 0;
        int R = nums.length - 1;
        int mid;
        while (L <= R) {
            mid = L + ((R -L) >> 2);
            if (nums[mid] == target) {
                ans = mid;
                break;
            }

            if (nums[mid] < target) {
                L = mid + 1;
            }

            if (nums[mid] > target) {
                R = mid - 1;
            }
        }

        return ans;
    }


}
