package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(CheckPallindromeNumber(141));

    }
    public static String CheckPallindromeNumber(int x){
        String str = Integer.toString(x);
        String res = "";
        StringBuilder sb;
        String rev;
        sb = new StringBuilder(str);
        //return String.valueOf(sb.reverse());
        rev = String.valueOf(sb.reverse());

        if(rev.equals(str)){
            res += x+" is a palindrome number";
        }else{
            res += x+" is not a palindrome number";
        }
        return res;

    }
}
