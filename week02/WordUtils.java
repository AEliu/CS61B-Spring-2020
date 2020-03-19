/**
 * WordUtils
 */
public class WordUtils {

    public static String longest(SLList<String> list) {
        String longestString = list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            if (longestString.length() < list.get(i).length()) {
                longestString = list.get(i);
            }
        }
        return longestString;
    }
}