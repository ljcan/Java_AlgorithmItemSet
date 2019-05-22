/**
You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

Find out how many ways to assign symbols to make sum of integers equal to target S.

Example 1:
Input: nums is [1, 1, 1, 1, 1], S is 3. 
Output: 5
Explanation: 

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

There are 5 ways to assign symbols to make the sum of nums be target 3.

*/

class Solution {
  //  static int[][] mark;
    public int findTargetSumWays(int[] nums, int S) {
       /**
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        mark=new int[nums.length][total+1];
        */
        return func(nums,0,0,S);
    }
    
    
    public int func(int[] nums,int index,int sum,int S){
        if(sum==S&&index==nums.length){
            return 1;
        }
        if(index>=nums.length){
            return 0;
        }
        /**
        if(index<nums.length&&sum>=0&&mark[index][sum]>0)
            return mark[index][sum];
        mark[index][sum]=func(nums,index+1,sum+nums[index],S)+
            func(nums,index+1,sum-nums[index],S);
            */
        
        return func(nums,index+1,sum+nums[index],S)+
            func(nums,index+1,sum-nums[index],S);
    }
    
    
    
    
    
}


