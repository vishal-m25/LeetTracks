class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        int start = -1, end = -1;

        // Finding the start index
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                start = mid;
                r = mid - 1; // Move left to find the first occurrence
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        // If start is not found, return {-1, -1}
        if (start == -1) return {-1, -1};

        // Finding the end index
        l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                end = mid;
                l = mid + 1; // Move right to find the last occurrence
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return {start, end};
    }
};

