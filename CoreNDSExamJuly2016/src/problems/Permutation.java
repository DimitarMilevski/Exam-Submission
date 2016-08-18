package problems;

/**
 * Created by mrahman on 4/9/16.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        String str = "abc";
        int n = str.length();
        permute(str.toCharArray(), 0, n - 1);
    }

    public static void permute(char[] str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        }

        for (int i = l; i <= r; i++) {
            swap(str, l, i);
            permute(str, l + 1, r);
            swap(str, l, i);
        }
    }

    public static void swap(char[] str, int i, int j) {
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }


}
