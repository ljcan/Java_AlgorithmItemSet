/**

Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

*/

class Leetcode581 {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int begin=0,end=-1,max=nums[0];
        boolean frist=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                if(frist){
            		frist=false;
            		begin=i-1;
            	}
                int tmp=i,index=tmp;
                while(tmp>=0){
                    if(nums[i]<nums[tmp]){
                        index=tmp;
                    }
                    tmp--;
                }
                if(index<begin)
                    begin=index;
                end=i;
            }else{
                max=nums[i];
            }  
        }
        return end-begin+1;
    }
}
