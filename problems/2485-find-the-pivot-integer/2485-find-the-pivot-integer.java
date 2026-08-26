class Solution {

    public int pivotInteger(int n) {

        int[] prefix = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + i;
        }

        int pivot = Math.max(1, n / 2);

        while (pivot <= n) {

            int sum = prefix[pivot];

            int sum2 = prefix[n] - prefix[pivot - 1];

            if (sum == sum2) {
                return pivot;
            }

            pivot++;
        }

        return -1;
    }
}