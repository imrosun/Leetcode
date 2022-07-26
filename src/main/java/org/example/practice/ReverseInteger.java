package org.example.practice;

public class ReverseInteger {
    public static void main(String[] args) {
        try{
            int a,b;
            b=0;
            a = 5/b;
            System.out.println("A");

        }
        catch(ArithmeticException e){
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        int v = 42;
        int v1 = ~v;
        System.out.println(v+""+v1);
        String obj = "Hello";
        String obj1 = new String(obj);
        String b ="HELLO";
        System.out.println(obj.equals(obj1) + "" + obj1.equals(b));
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
