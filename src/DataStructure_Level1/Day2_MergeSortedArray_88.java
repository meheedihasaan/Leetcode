/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day2_MergeSortedArray_88 {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m+n;
        
        //Append nums2 to nums1
        for(int i = m; i < length; i++){
            nums1[i] = nums2[i-m];
        }
        
        //Sort nums1
        for(int i = 0; i < length-1; i++){
            for(int j = i+1; j < length; j++){
                if(nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        merge(arr1,3,arr2,3);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}
