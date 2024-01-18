import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        path("",3,3);
        System.out.println(retPath("",3,3));
    }

    static int count(int r , int c){
        if (r==1 || c==1){
            return 1;
        }
        int down = count(r-1,c);
        int right = count(r,c-1);
        return down+right;
    }
    static void path(String p , int r , int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p+'D',r-1,c);
        }
        if (c>1){
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> retPath(String p , int r , int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1){
            list.addAll(retPath(p+'D',r-1,c));
        }
        if (c>1){
          list.addAll(retPath(p+'R',r,c-1));
        }
        return list;
    }
}
