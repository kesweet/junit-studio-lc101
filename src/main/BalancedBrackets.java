package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
//    public static boolean hasBalancedBrackets(String str) {
//        int leftBrack = 0;
//        int rightBrack = 0;
//        int l = str.toCharArray().length;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                leftBrack++;
//                int k = 0;
//                for (int i = 0; i < str.toCharArray().length; i++) {
//                    if (str.toCharArray()[i] == ch) {
//                        k = i;
//                        break;
//                    }
//                }
//                Boolean booleanCondition = false;
//                for (int j = k; j < l; j++) {
//                    if (str.toCharArray()[j] == ']') {
//                        rightBrack++;
//                        l = j;
//                        booleanCondition = true;
//                        break;
//                    }
//                }
//                if (!booleanCondition) {
//                    return false;
//                }
//            }
//            if (ch == ']') {
//                rightBrack++;
//            }
//        }
//        return leftBrack == rightBrack;
//    }

//    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        for(int i=0; i<str.length(); i++)  {
//            if (str.charAt(i) == '['&& brackets == 0) {
//                brackets++;
//            } else if (str.charAt(i)==']') {
//                brackets--;
//            }
//        }
//        return brackets == 0;
//    }

//    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        char[] someChar = new char [str.length()];
//        someChar = str.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//            if (someChar[i] == '[') {
//                if (brackets == 0) {
//                    brackets++;
//                } else {
//                    return false;
//                }
//            } else if (someChar[i] == ']') {
//                if (brackets == 1) {
//                    brackets--;
//                } else {
//                    return false;
//                }
//            }
//        }
//        return brackets == 0;
//    }

    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
                if(brackets<0)
                    return false;
            }
        }
        return brackets == 0;
    }
}
