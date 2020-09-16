package org.wcci;

import java.io.Serializable;
import java.util.Locale;

public class StringProblems {



    /*
     * smallestStringSorter()
     *
     * Given two strings, stringA and stringB, return the smallest string, however, if one of the strings has a length
     * of 0, return the other string.  If both strings are the same length, return a new string mashing stringA and
     * stringB together.
     *
     * Examples:
     * - smallestStringSorter("two", "fifteen") -> "two"
     * - smallestStringSorter("", "tomorrow") -> "tomorrow"
     * - smallestStringSorter("zizzer", "zazzer") -> "zizzerzazzer"
     */

    public Serializable smallestStringSorter(String stringA, String stringB) {


        int StringA = stringA.length();
        int StringB = stringB.length();
        int StringC = (StringB + StringA);
        if (StringB > StringA) {

            return StringA;
        }
        if (StringB == StringA) {
            System.out.println(StringA == StringB);
        }
        if (StringA == 0) {
            return stringB;
        }
//        if (StringB == 0) {
        return StringA;

//        }

    }

    /*
     * evenUpperCaseOrOddLowerCase()
     *
     * Given a string, str, transform the string's characters to upper case characters if the length is even or lower
     * case if the length is odd.
     *
     * Examples:
     * - evenUpperCaseOrOddLowerCase("Hello") -> "hello"
     * - evenUpperCaseOrOddLowerCase("Zizzer Zazzer Zuzz") -> "ZIZZER ZAZZER ZUZZ"
     */
    public String evenUpperCaseOrOddLowerCase(String str) {

        int a = str.length() % 2;
        System.out.println("a is : " + a);
        if (a == 0) {
            str.toUpperCase();
        } else {
            str.toLowerCase();
        }
        return str;
    }
    /*
     * stringCombiner()
     *
     * Given two strings, stringA and stringB, return a new string that combines the two strings, but the strings should
     * be combined in ascending alphabetically order.
     *
     * Examples:
     * - stringCombiner("Hello", "There") -> "HelloThere"
     * - stringCombiner("Zizzer" "zazzer") -> "zazzerZizzer"
     */

    public String stringCombiner(String stringA, String stringB) {
        String c = "";
        char[] charA = stringA.toCharArray();
        char[] charB = stringB.toCharArray();
        for (int i = 0; i < charA.length; i++) {
            for (int j = 0; j < charB.length; j++) {
                if ((int) (charA[i]) > (int) (charB[j])) {
                    c = stringA + stringB;
                } else {
                    c = stringB + stringA;

                }
            }
        }
        return c;

    }
    /*
     * left2()
     * Given a string, str, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length
     * will be at least 2.
     *
     * Examples:
     * - left2("Hello") → "lloHe"
     * - left2("java") → "vaja"
     * - left2("Hi") → "Hi"

     */


    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

}