class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
              for (int i = 0; i< n ; i++){
                   nums1[i+m] = nums2[i];
}
Arrays.sort(nums1);
    }
}
//    for (int j = 0, i = m; j < n; j++) {
//             nums1[i] = nums2[j];
//             i++;
//         }
//         Arrays.sort(nums1);