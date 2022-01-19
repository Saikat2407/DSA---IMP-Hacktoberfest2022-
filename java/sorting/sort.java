package com.saikat;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
       int[] nums  = {-4,-1,0,3,10};
       System.out.println(Arrays.toString(nums));
    }
    static void sorted(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];
        Arrays.sort(arr);
    }
}