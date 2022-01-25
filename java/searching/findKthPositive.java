 package com.saikat;

public class findKthPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 4;
        System.out.println(sol(arr,k));
    }
    static int sol(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end - start) /2;

            if(arr[mid]-mid-1 < k){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
