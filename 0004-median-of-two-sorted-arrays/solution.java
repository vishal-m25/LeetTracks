class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                int n=(nums1.length)+(nums2.length);
                        int[] ar=new int[n];
                                System.arraycopy(nums1, 0, ar, 0, nums1.length); 
                                        System.arraycopy(nums2, 0, ar, nums1.length, nums2.length);
                                                Arrays.sort(ar);
                                                        if (n==1){
                                                                    return(ar[0]);
                                                                            }
                                                                                    if (n%2==0){
                                                                                                return ((ar[n/2]+ar[(n/2)-1])/2.0);
                                                                                                        }
                                                                                                                else{
                                                                                                                            return ar[(n/2)];
                                                                                                                                    }
                                                                                                                                        }
                                                                                                                                        }


        


