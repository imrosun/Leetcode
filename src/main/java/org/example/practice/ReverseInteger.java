package org.example.practice;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        int res = 0;
        while(x !=0)
        {
            int rem = x % 10;
            res = res * 10 + rem;
            x = (x-rem) / 10;

            if(res % 10 != rem) //exceed int range
            {
                return 0;
            }
        }
        return res;
    }
}
