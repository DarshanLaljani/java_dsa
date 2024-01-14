public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("apple is fruit"));
        System.out.println(skipAppNotApple("apple is fruit "));
        System.out.println(skipAppNotApple("appl is fruit "));
    }
    static String skipString(String Unproc){
        if (Unproc.isEmpty()){
            return "";
        }

        if (Unproc.contains("apple")){
           return skipString(Unproc.substring(5));

        }else {
            return Unproc.charAt(0)+skipString(Unproc.substring(1));
        }
    }
    static String skipAppNotApple(String Unproc){
        if (Unproc.isEmpty()){
            return "";
        }

        if (Unproc.contains("app")&& !Unproc.startsWith("apple")){
            return skipAppNotApple(Unproc.substring(3));

        }else {
            return Unproc.charAt(0)+skipAppNotApple(Unproc.substring(1));
        }
    }
}
