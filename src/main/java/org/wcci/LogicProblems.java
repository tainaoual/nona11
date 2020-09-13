package org.wcci;

public class LogicProblems {
    /*
     * squirrelPlay()
     * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between
     * 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature
     * and a boolean isSummer, return true if the squirrels play and false otherwise.
     *
     * Examples:
     * - squirrelPlay(70, false) → true
     * - squirrelPlay(95, false) → false
     * - squirrelPlay(95, true) → true
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer && temp <= 100 && temp >= 60)
            return true;
        if (!(isSummer) && temp <= 90 && temp >=60)
            return true;
        else
        return false;

    }

    /*
     * nearTen()
     * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
     * remainder of dividing a by b, so (7 % 5) is 2.
     *
     * Examples:
     * - nearTen(12) → true
     * - nearTen(17) → false
     * - nearTen(19) → true
     */
    public boolean nearTen(int num) {
        if (num % 10 == 9 || num % 10 == 8 || num % 10 == 0){
            return true;
        }else if (num % 10 == 1 || num % 10 == 2 || num % 10 == 0) {
            return true;

        }

        return false;
    }

}

