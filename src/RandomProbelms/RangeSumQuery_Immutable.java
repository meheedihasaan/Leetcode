/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class RangeSumQuery_Immutable {
    
    private int tree[];
    private int n;
    RangeSumQuery_Immutable(int nums[]){
        n = nums.length;
        int height = (int)(Math.ceil(Math.log(n)/Math.log(2)));
        int size = 2*((int)Math.pow(2, height))-1;
        //int size = 4*n;
        tree = new int[size];
        
        int node = 0, start = 0, end = n-1;
        buildTree(nums, node, start, end);
    }

    private void buildTree(int[] nums, int node, int start, int end) {
        if(start == end){
            tree[node] = nums[start];
            return;
        }
        
        int mid = (start+end)/2;
        buildTree(nums, 2*node+1, start, mid);       //Build the left subtree
        buildTree(nums, 2*node+2, mid+1, end);       //Build the right subtree
        tree[node] = tree[2*node+1]+tree[2*node+2];
    }
    
    public int sumRange(int left, int right){
        int node = 0, start = 0, end = n-1;
        return getSum(node, start, end, left, right);
    }
    
    public int getSum(int node, int start, int end, int left, int right){
        if(left > end || right < start){
            return 0;
        }
        
        if(left <= start && right >= end){
            return tree[node];
        }
        
        int mid = (start+end)/2;
        int leftSum = getSum(2*node+1, start, mid, left, right);
        int rightSum = getSum(2*node+2, mid+1, end, left, right);
        return leftSum+rightSum;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8};
        RangeSumQuery_Immutable r = new RangeSumQuery_Immutable(nums);
        System.out.println(r.sumRange(1, 3));
    }
    
}
