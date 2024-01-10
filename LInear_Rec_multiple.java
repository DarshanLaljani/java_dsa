import java.util.ArrayList;

public class LInear_Rec_multiple {
    // instead of
    public static void main(String[] args) {
        int [] arr = { 1, 2 , 3,3 ,55,2};

        System.out.println(findAllindex2(arr,3,0));

    }
  //  static ArrayList<Integer> list = new ArrayList<>();
//static ArrayList<Integer> findAllindex(int [] arr , int target , int index){
//        if(index == arr.length){
//            return null;
//        }
//        if(arr[index]== target){
//            list.add(index);
//        }
//findAllindex(arr,target,index+1);
//    return null;
//}
    static ArrayList<Integer> findAllindex2(int [] arr , int target , int index){
    ArrayList<Integer> list2 = new ArrayList<>();
    if(index == arr.length){
            return list2;
        }

    // this will contain ans only
        if(arr[index]== target){
            list2.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllindex2(arr,target,index+1);
    list2.addAll(ansFromBelowCalls);
    return list2;
    }
    }

