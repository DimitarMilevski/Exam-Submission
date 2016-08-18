package problems;

import java.util.*;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


        Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
        for (String string : "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language".split(" ")) {
            if(unique.get(string) == null)
                unique.put(string, 1);
            else
                unique.put(string, unique.get(string) + 1);
        }
        String uniqueString = join(unique.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(unique.values());

        System.out.println("Output = " + uniqueString);
        System.out.println("Values = " + value);

        int average = 0;
        int count = 0;
        for (String word : st.split("\\s+")) {
            average += st.length();
            count++;
        }
        average = st.length()/count;


        System.out.println("Average word length = " + average);
    }





    public static String join(Collection<String> s, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }




}




