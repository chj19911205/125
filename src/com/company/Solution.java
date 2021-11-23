package com.company;

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        boolean flag = true;
        if(str.length() <= 1)
            return true;
        int l = 0, r = str.length() - 1;
        char lchar = ' ', rchar = ' ';
        while (l < r){
            lchar = str.charAt(l);
            rchar = str.charAt(r);
            while(l < r && !((lchar <= 'z' && lchar >= 'a' )|| (lchar <= '9' && lchar >= '0'))){
                l++;
                lchar = str.charAt(l);
            }

            while(l < r && !((rchar <= 'z' && rchar >= 'a' )|| (rchar <= '9' && rchar >= '0'))){
                r--;
                rchar = str.charAt(r);
            }

            if(lchar != rchar)
                return false;
            else{
                l++;
                r--;
            }

        }
        return flag;
    }
}
