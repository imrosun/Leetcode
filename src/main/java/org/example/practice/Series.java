package org.example.practice;

import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        int n, i, term, sum=0, s=137, avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        System.out.print("Series are.. ");
        for(i=0; i<n; i++){
            term = s-(2+i);
            System.out.print(term +" " );
            s = term;
            sum = sum + term;
            avg = sum / n;
        }
        System.out.print("\nSum is "+sum);
        System.out.print("\nAverage is "+avg);
    }
}
