package com.mogujie.yundi.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * 题目给定a1,a2...an，这样一个长度为n的序列，现在你可以给其中一些元素加上一个值x（只能加一次），然后可以给另外一些值减上一个值x（只能减一次），剩下的元素不能再进行操作。问最后有没有可能找到一个值x使所有元素的值相等。

输入描述:
输入第一行为一个整数k，代表有k个序列(k<100)，接下来有2*k行:
偶数行为一个整数n，代表给定序列的长度(1<=n<=100,000)
奇数行包含n个元素，a1,a2...an，代表序列中的元素(0<=ai<=100,000)


输出描述:
输出k行，每行一个YES或者NO

输入例子1:
1
5
1 3 3 2 1

输出例子1:
YES
 * @author yundi
 *
 */

public class Wangyi3 {
	
	 public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        int k=in.nextInt();
	        int[] nums=new int[k];
	        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
	        for(int i=0;i<k;i++){
	            nums[i]=in.nextInt();
	            ArrayList<Integer> line=new ArrayList<Integer>();
	            for(int j=0;j<nums[i];j++){
	                line.add(in.nextInt());
	            }
	            list.add(line);
	        }
	        
	        for(List<Integer> line:list){
	           System.out.println(func(line));
	        }
	        
	    }
	    
	    public static boolean func(List<Integer> line){
	    	Collections.sort(line);
	     
	        int low=line.get(0);
	        int high=line.get(line.size()-1);
	        int mid=0;
	        if(high==low){
	            return true;
	        }
	        for(int i=0;i<line.size();i++){
	            if(line.get(i)!=low){
	                mid=line.get(i);
	                for(int j=i+1;j<line.size();j++) {
	                	if(line.get(j)!=mid) {
	                		if(line.get(j)!=high)
	                			return false;
	                		else
	                			break;
	                	}
	                }
	                break;
	            }
	        }
	        if(mid==high) {
	        	return true;
	        }else {
		        if(((high-low)/2+low)==mid){
		            return true;
		        }
	        }
	        return false;
	    }

}
