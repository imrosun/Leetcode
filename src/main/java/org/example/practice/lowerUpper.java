package org.example.practice;

public class lowerUpper {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(checker(ch));
    }
    static String checker(char c){
        if(c == ' ') {
            return null;
        }
        else if( c >= 'a' && c <= 'z'){
            System.out.println("Lowercase"); 
        }
        else {
            System.out.println("Uppercase");
        }
        return null;
    }
}
