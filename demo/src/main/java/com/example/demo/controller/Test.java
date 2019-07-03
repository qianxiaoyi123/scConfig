package com.example.demo.controller;


import java.util.HashSet;
import java.util.Set;

public class Test {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = nums.length-1; j >i ; j--) {
             if (target==nums[i]+nums[j]){
                 int[] re={i,j};
                 return re;
             }

            }

        }
        return null;

    }

    public int lengthOfLongestSubstring(String s) {

        Set<String> set1=new HashSet<>();
        Set<String>set2=new HashSet<>();
        int result=0;
        if (s.length()==0||s==""){
          return 0;
        }
        if (s.equals(" ")){
            return 1;
        }
        if (s.length()==1){
            return 1;
        }
        for (int i = 0; i <s.length() ; i++) {
            set1.add(String.valueOf(s.charAt(i)));
            set2.add(String.valueOf(s.charAt(i)));
            for (int j = i+1; j < s.length(); j++) {
                set2.add(String.valueOf(s.charAt(j)));
                if(set2.size()!=set1.size()){
                    set1.add(String.valueOf(s.charAt(j)));
                    System.out.println(set1);
                    if (set2.size()>=result) {
                        result = set2.size();
                    }

                }else{
                    if (set2.size()>=result) {
                        result = set2.size();
                        set1.clear();
                        set2.clear();
                        break;
                    }


                };

            }




        }
        return result;
    }


    public static void main(String[] args) {
        Test test=new Test();
       int result= test.lengthOfLongestSubstring("c");
        System.out.println(result);
    }
}
