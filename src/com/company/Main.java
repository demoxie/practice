package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Function is called here
        Scanner input = new Scanner(System.in);
        Integer strInput = input.nextInt();
        System.out.println(CheckPalindromeNumber(strInput));

    }
    //This function checks if a number is a palindrome number
    public static String CheckPalindromeNumber(int x){
        String str = Integer.toString(x);
        String res = "";
        StringBuilder sb;
        String rev;
        sb = new StringBuilder(str);
        //return String.valueOf(sb.reverse());
        rev = String.valueOf(sb.reverse());
//This is where the conditional test takes place
        if(rev.equals(str)){
            res += x+" is a palindrome number";
        }else{
            res += x+" is not a palindrome number";
        }
        return res;

    }
}
