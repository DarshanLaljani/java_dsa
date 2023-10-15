import java.util.Arrays;

public class StringCom {
    public static void main(String[] args) {
       String str1 = "rat";
        String str2 = "car";
        System.out.println( Compare(str1,str2));

    }

    private static boolean Compare(String str1, String str2) {
        String string1 = sort(str1);
        String string2 = sort(str2);
        if(string1.equals(string2)){
            return true;
        }
        return false;
    }
    static String sort(String str){
        char[] charArray = str.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Create a new string from the sorted character array
        String sortedString = new String(charArray);

        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedString);
        return sortedString;
    }
}
