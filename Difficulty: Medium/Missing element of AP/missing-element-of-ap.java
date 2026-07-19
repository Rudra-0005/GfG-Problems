class Solution {
    public int findMissing(int[] arr) {
        int n = arr.length;

        // Special case for 2 elements
        if (n == 2) {
            return arr[1] + (arr[1] - arr[0]);
        }

        int d1 = Math.abs(arr[1] - arr[0]);
        int d2 = Math.abs(arr[n - 1] - arr[n - 2]);

        int diff = Math.min(d1, d2);

        if (arr[1] < arr[0])
            diff = -diff;

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int expected = arr[0] + mid * diff;

            if (arr[mid] == expected) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] == arr[0] + (mid - 1) * diff)
                    return expected;

                high = mid - 1;
            }
        }

        // No missing element
        return arr[n - 1] + diff;
    }
}