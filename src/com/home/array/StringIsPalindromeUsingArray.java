package com.home.array;

public class StringIsPalindromeUsingArray {

    public boolean isPalindrome(String valueToCheck){
        System.out.println("Given String: " + valueToCheck);
        char[] charArray = valueToCheck.toCharArray();
        int start = 0;
        int end = valueToCheck.length()-1;
        while(start < end){
            if(charArray[start] != charArray[end])
                return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringIsPalindromeUsingArray stringIsPalindromeUsingArray = new StringIsPalindromeUsingArray();
        boolean result = stringIsPalindromeUsingArray.isPalindrome("madam");
        if(result)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }
}
