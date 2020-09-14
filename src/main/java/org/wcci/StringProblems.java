package org.wcci;

import com.sun.jdi.connect.Connector;

import javax.print.DocFlavor;
import java.lang.invoke.StringConcatException;

public class StringProblems<lenStringA, lenStringB> {
    private Object StringA;
    private String StringC;


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

    public String smallestStringSorter(String stringA, String stringB) {


        int StringA = stringA.length();
        int StringB = stringB.length();
        int StringC = (StringB + StringA);
        if (StringA < StringB) ;
        {

            return StringA();


        }
        if (StringB == StringA) ;
        {

            return StringC();
        }
        if ((StringA & StringB) == 0) ;
        {
            return stringB();

        }


    }

    private String stringB() {
    }

    private String StringC() {
    }

    private String StringA() {
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
        if (a == 0) ;
        {
            return str.toUpperCase();

        }
        if (a < 0) ;
        {
            return str.toLowerCase();
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

        public String left String StringB;StringA(StringA , StringB){

            String stringA;
            String sttrngB;
            System.out.println("StringA + StringB");
            StringC = StringA + StringB;

            return StringC.substring(stringA.length() + StringB.length()) + StringC.substring();

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

        public String left2 (String str){
            return str.substring(2) + str.substring(0, 2);
        }
    }

    private void StringA(Object stringA, String stringB) {
    }

