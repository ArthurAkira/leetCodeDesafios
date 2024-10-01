import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a, b;
        int j = 0;
        double y;
        int p = nums1.length + nums2.length;
        double[] nums3 = new double[p];
        
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }

        // Copiando os elementos de nums2 para nums3
        for (int i = 0; i < nums2.length; i++) {
            nums3[nums1.length + i] = nums2[i];
        }

        Arrays.sort(nums3);
        
        if(nums3.length % 2 != 0) {
            int midIndex = nums3.length / 2;
            y = nums3[midIndex];
            return y;
        } else {
            // Para arrays com número ímpar de elementos
            int midIndex = nums3.length / 2;
            y = (nums3[midIndex -1] + nums3[midIndex]) / 2.0;
            return y; // O elemento do meio
        }
        
    }

}