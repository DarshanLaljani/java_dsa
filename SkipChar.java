public class SkipChar {
    public static void main(String[] args) {
        skip("","baccadh");
    }
    static void skip(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch = unproc.charAt(0);
        if (ch == 'a'){
            skip(proc,unproc.substring(1));
        }else {
            skip(proc+ch,unproc.substring(1));
        }
    }
}
