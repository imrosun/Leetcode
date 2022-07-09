package org.example.practice;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdd"));
    }

        public static int lengthOfLongestSubstring(String s) {
            int l = 0,  maxLen = 0;
            HashMap<Character,Integer> hm = new HashMap<Character, Integer>();

            for(int r=0; r<s.length(); r++){
                Character ch = s.charAt(r);

                if(hm.containsKey(ch) == false){//when ch is not present in hashmap
                    hm.put(ch, r);
                    maxLen = Math.max(r - l + 1, maxLen);
                }
                else{//when ch is present in hashmap
                    if(hm.get(ch) >= l)
                        l = hm.get(ch) + 1;
                    else//when index found outside our current range(left to right pointer)
                        maxLen = Math.max(r - l + 1, maxLen);
                    hm.put(ch, r); //inserts current occurance//then update index number
                }
            }
            return maxLen;
        }
    }

