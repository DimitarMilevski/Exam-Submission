package problems;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "dimitar";
        String str2 = "mitidar";
        System.out.println(anagramCheck(str1, str2));
    }

    public static boolean anagramCheck(String str1, String str2) {
        char[] charString1 = str1.toCharArray();
        StringBuilder sb = new StringBuilder(str2);
        for (char c : charString1) {
            int index = sb.indexOf(String.valueOf(c));
            if (index != -1) {
                sb.deleteCharAt(index);
            }
            else {
                return false;
            }
        }
        return sb.length() == 0;
    }

}



