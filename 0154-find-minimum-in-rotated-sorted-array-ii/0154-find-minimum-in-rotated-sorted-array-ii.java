
        class Solution {
    public int findMin(int[] arr) {
        if (arr.length == 1) return arr[0];
        int low = 0, high = arr.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If duplicates exist, shrink the range
            if (arr[low] == arr[high]) {
                high--;
                continue;
            }

            // If the subarray is already sorted
            if (arr[low] < arr[high]) {
                return arr[low];
            }

            // Check the mid element
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }
}

  