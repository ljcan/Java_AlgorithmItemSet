/**
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:

Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
 

Example 2:

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

*/

class Leetcode647{
  int count;
    static int[][] mark;
     public int countSubstrings(String s) {
         int len=s.length();
         mark=new int[len][len];
         func(s,0,0);
         return count;
     }
    
    public void func(String s,int begin,int end){
        if(begin>end||end>=s.length()||mark[begin][end]==1){
            return;
        }
        if(mark[begin][end]==0&&isPalindromic(s.substring(begin,end+1))){
            count++;
        }
        if(mark[begin][end]==0){
            mark[begin][end]=1;
        }
        func(s,begin+1,end+1);
        func(s,begin,end+1);
    }
    
    public boolean isPalindromic(String str){
        char[] c=str.toCharArray();
        int begin=0,end=c.length-1;
        while(begin<end){
            if(c[begin]!=c[end]){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }


}
