package HackerRankProblems;

import java.util.*;


public class StringLengthAddFirstLetterCapital {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two Strings : ");
            String A = sc.next();
            String B = sc.next();


            int sumOfLengths = addLengthOfStrings(A, B);
            System.out.println("Addition of of lengths : " + sumOfLengths);

            String lexicographicallyResult = lexicographicallyCheck(A, B);
            System.out.println(lexicographicallyResult);

            String capitalizedS1 = capitalizeFirstLetter(A);
            String capitalizedS2 = capitalizeFirstLetter(B);
            System.out.print("First letter of both String are Now Capital : ");
            System.out.print(capitalizedS1 + " " + capitalizedS2);
        }

        public static int addLengthOfStrings(String A, String B){
            return A.length() + B.length();
        }


        public static String lexicographicallyCheck(String A, String B){
            if(A.compareTo(B) > 0){
                return "Is A lexicographically larger than B? : "+"Yes";
            }else if(A.compareTo(B)==0){
                return "Both Strings are Equal";
            }else {
                return "Is A lexicographically larger than B? : "+"No";
            }
        }

        public static String capitalizeFirstLetter(String s) {
            return Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }

    }
