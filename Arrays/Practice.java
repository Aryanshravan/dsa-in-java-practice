package Arrays;

import java.util.Scanner;

public class Practice {

    public static boolean charOrDigit(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {

        String s = "racecar";
        char[] a = s.toCharArray();
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            while (l < r && !charOrDigit(a[l])) {
                l++;
            }
            while (l < r && !charOrDigit(a[r])) {
                r--;
            }
            if (Character.toLowerCase(a[l]) != Character.toLowerCase(a[r])) {
                System.out.println("Not Palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Palindrome");
    }
}