import java.util.*;

public class Stringer {
    public static void main(String[] args) {
        //subSeqvod("" , "abc");

        //System.out.println(subSeq(" " , "abc"));

        /*int[] arr= {1,2,3};
        List<List<Integer>> ans = subSet(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }*/

        //permutation("" , "abc");

        //ArrayList<String> ans = permutationList("" , "abc");

        //System.out.println(ans);

        //phonepad("" , "12");

        //System.out.println(padphn("" , "12"));

        //System.out.println(dice("" , 4));
        
        //dicevoi("" ,  4);
    }
//Printing of all the substrings of given string
    public static void subSeqvod(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        subSeqvod(p,up.substring(1));
        subSeqvod(p+ch,up.substring(1));
    }
//Printing of subsequence using recursion [ abc,  ab,  ac,  a,  bc,  b,  c,  ] is the output for abc
    public static ArrayList<String> subSeq(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p + ch  , up.substring(1));
        ArrayList<String> right = subSeq(p , up.substring(1));

        left.addAll(right);
        return left ;

    }
//Printing of all the possible permutations of a string like abc,bca,cba,cab,acb etc.......
    public static void permutation(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0) ;
        for(int i =0;i<=p.length();i++){
            String s = p.substring(0, i);
            String f = p.substring(i,p.length());
            permutation(s + ch + f , up.substring(1));
        }
    }
//Printing of all the subsets for a given array of size n
    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer ;
    }

//Printing of permutations in a list
    public static ArrayList<String> permutationList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new  ArrayList<>();

        for(int i =0;i<=p.length();i++){
            String s = p.substring(0,i);
            String f= p.substring(i,p.length());
            ans.addAll(permutationList(s + ch + f , up.substring(1)));
        }
        return ans ;
    }
//Printing of digits as per the phone pad requirement where
// 1 contains letters abc
//2 contains letter def
//...........
    public static void phonepad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) -'0'  ;

        for(int i = (digit-1)*3 ; i< digit*3 ; i++){
            char ch = (char) ('a' + i);
            phonepad( p +ch , up.substring(1));
        }
    }
//Printing of the output of the phone dail pad in a arrayList fashion
    public static ArrayList<String> padphn(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit  = up.charAt(0) -'0' ;
        for(int i =(digit-1)*3 ; i<digit*3;i++){
            char ch = (char) ('a' + i);
            ans.addAll(padphn(p + ch , up.substring(1)));
        }
        return ans ;
    }
//Combination of all the possible values on a dice
//that sum up to the required target
//all the possible values are drawn in a arraylist foramt
    public static ArrayList<String> dice(String p , int up){
        if(up==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i =1;i<=6 && i<=up;i++){
            ans.addAll(dice(p+i , up-i));
        }
        return ans ;
    }
//Normal printing of the possible values of a dice
//with recursion calls
    public static void dicevoi(String p, int target){
        if(target ==0){
            System.out.println(p);
            return ;
        }

        for(int i =1;i<=6 && i<=target;i++){
            dicevoi(p+i,target-i);
        }
    }
}
