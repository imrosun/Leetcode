package org.example.practice;

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int n=5;

        int k;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                k = (i+j)-1;
                if(k>n){
                    k-=n;
                }
                System.out.print(k + " ");
            }
            System.out.println();
        }

        int count = 11;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                if (count > 15) {
                    count -= n;
                    count++;
                }
                System.out.print(count + " ");
                count++;
            }
              System.out.println();
        }
    }
}
