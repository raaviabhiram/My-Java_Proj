
import java.sql.SQLOutput;
import java.util.*;
public class StrngPrac {
    public static void main(String[] args) {

        To check String are Anagram or not
//        String x = "SILENT He Was At the hall";
//        String y = "hall he was the LISTEN At";
//
//        x=x.replace(" " , "");
//        y=y.replace(" " , "");
//
//        x=x.toLowerCase();
//        y=y.toLowerCase();
//
//        char a[] = x.toCharArray();
//        char b[] = y.toCharArray();
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        Boolean result = Arrays.equals(a,b);
//        if(result==true){
//            System.out.println("Strings are anagrams");
//        }
//        else{
//            System.out.println("Strings are not anagrams");
//        }

        To check if string only contains integers
//        String x = "423242";
//        int size = x.length();
//
//        int i =0;
//        while(i!=size){
//            if(x.charAt(i) >='0' && x.charAt(i)<='9'){
//                i++;
//            }
//            else{
//                System.out.println("Not a integer array");
//                System.exit(0);
//            }
//        }
//        System.out.println("Integer String");

        To count vowels consonents special charaacters
//        String x = "Raavi AbhiRAM's/////";
//        x=x.toLowerCase();
//
//        char y[] = x.toCharArray();
//        int size = x.length();
//
//        int vowel = 0;
//        int conso = 0;
//        int special = 0;
//
//        int i =0;
//        while(i!=size){
//            if(Character.isLetter(y[i])){
//                if(y[i] == 'a' ||y[i] == 'e' ||y[i] == 'i' ||y[i] == 'o' ||y[i] == 'u' ){
//                    vowel++;
//                }
//                else{
//                    conso++;
//                }
//            }
//            else{
//                special++;
//            }
//            i++;
//        }
//        System.out.println(vowel);
//        System.out.println(conso);
//        System.out.println(special);

        Convert first letter of all words to UpperCase
//        String x = "thi si a fsa gdhi jgdsjsi fsbufsanfi";
//
//        char y[] = x.toCharArray();
//        int size = x.length();
//
//        y[0] = (char)(y[0] - 32);
//        int i = 1 ;
//        while(i!=size){
//            if(y[i] == ' '){
//                y[i+1] = (char) (y[i+1] -32);
//            }
//            i++;
//        }
//        System.out.println(y);

        Palindrome of a string
//        String x = "abcdedcba";
//        x=x.replace(" " , "");
//        x=x.toLowerCase();
//
//        char y[] = x.toCharArray();
//        int size = x.length();
//        char a[] = new char[size];
//
//        int i =0;
//        while(i!=size){
//            a[size-i-1] = y[i];
//            i++;
//        }
//
//        i=0;
//        while(i!=size){
//            if(a[i]!=y[i]){
//                System.out.println("The string is not a palindrome");
//                System.exit(0);
//            }
//            else{
//                i++;
//                continue;
//            }
//        }
//        System.out.println("String is palindrome");

        String is panagram or not
        Contains all the letters of the alphabets
//        String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
//        if (isPangram(x)) {
//            System.out.println("The sentence is a pangram.");
//        } else {
//            System.out.println("The sentence is not a pangram.");
//        }

        Adding data into maps HASHMAP
//        String x = "ARADHYA";
//        char y[] = x.toCharArray();
//        int size = x.length();
//
//        Map<Character,Integer> map = new HashMap<>();
//        int i =0;
//        while(i!=size){
//            if(map.containsKey(y[i]) == false)
//            {
//                map.put(y[i] , 1);
//            }
//            else
//            {
//                int oldval = map.get(y[i]);
//                int newval = oldval+1;
//                map.put(y[i] , newval);
//            }
//            ++i;
//        }
//
//        Set<Map.Entry<Character , Integer>> hmap = map.entrySet();
//        for(Map.Entry<Character , Integer> data : hmap){
//            System.out.print(data.getKey());
//            System.out.println(data.getValue());
//        }

        Check if the string has all unique characters
//        String x = "abhiram";
//        char y[] = x.toCharArray();
//        int size = x.length();
//
//        Map<Character,Integer> map = new HashMap<>();
//        int i =0;
//        while(i!=size){
//            if(map.containsKey(y[i]) == false){
//                map.put(y[i] , 1);
//            }
//            else{
//                int oldval = map.get(y[i]);
//                int newval = oldval+1;
//                map.put(y[i] , newval);
//            }
//            i++;
//        }
//        Set<Map.Entry<Character , Integer>> hmap = map.entrySet();
//        for(Map.Entry<Character,Integer> data: hmap){
//            if(data.getValue() > 1){
//                System.out.println("Dosent contain unique values");
//                System.exit(0);
//            }
//        }
//        System.out.println("Contains all unique characters");


        Print all Non-Repeated Character in String
//        String x = "abhiram";
//        char y[] = x.toCharArray();
//        int size = x.length();
//
//        Map<Character , Integer> map = new HashMap<>();
//
//        int i =0;
//        while(i!=size){
//            if(map.containsKey(y[i]) == false){
//                map.put(y[i] , 1);
//            }
//            else{
//                int oldval = map.get(y[i]);
//                int newval = oldval+1;
//                map.put(y[i] , newval);
//            }
//            i++;
//        }
//
//        Set<Map.Entry<Character , Integer>> hmap = map.entrySet();
//        for(Map.Entry<Character , Integer> data : hmap)
//        if(data.getValue() == 1){
//            System.out.println(data.getKey());
//        }

        First non Repeated character in the string
//        String x = "abhiram";
//        char  y[] = x.toCharArray();
//        int size = x.length();
//
//        Map<Character , Integer> map = new LinkedHashMap<>();
//
//        int i =0;
//        while(i!=size){
//            if(map.containsKey(y[i]) == false){
//                map.put(y[i] , 1);
//            }
//            else{
//                int oldval = map.get(y[i]);
//                int newval = oldval+1;
//                map.put(y[i] , newval);
//            }
//            i++;
//        }
//
//        Set<Map.Entry<Character , Integer>> hmap = map.entrySet() ;
//        for(Map.Entry<Character , Integer> data : hmap){
//            if(data.getValue() == 1){
//                System.out.println(data.getKey());
//                System.exit(0);
//            }
//        }

        Maximum occuring character in a String
//        String x = "abhiram";
//        char y[] = x.toCharArray();
//        int size = x.length();
//
//        Map<Character , Integer> map = new LinkedHashMap<>();
//
//        int i =0;
//        while(i!=size){
//            if(map.containsKey(y[i]) == false){
//                map.put(y[i] , 1);
//            }
//            else{
//                int oldval = map.get(y[i]);
//                int newval = oldval+1;
//                map.put(y[i] , newval);
//            }
//            i++;
//        }
//        char maxkey = ' ';
//        int maxval = 0 ;
//        Set<Map.Entry<Character , Integer>> hmap = map.entrySet();
//        for(Map.Entry<Character , Integer> data : hmap){
//            if(data.getValue() > maxval){
//                maxval = data.getValue();
//                maxkey = data.getKey();
//            }
//        }
//        System.out.println(maxkey);
//        System.out.println(maxval);

        Print all duplicates in a String
//        String x = "SILLYSPIDERS";
//        char y[] = x.toCharArray();
//        int size = x.length();
//
//        Map<Character , Integer> map = new LinkedHashMap<>();
//
//        int i =0;
//        while(i!=size){
//            if(map.containsKey(y[i]) == false){
//                map.put(y[i] , 1);
//            }
//            else{
//                int oldval = map.get(y[i]);
//                int newval = oldval+1;
//                map.put(y[i] , newval);
//            }
//            i++;
//        }
//
//        Set<Map.Entry<Character , Integer>> hmap = map.entrySet();
//        for(Map.Entry<Character , Integer> data : hmap ){
//            if(data.getValue() > 1){
//                System.out.print(data.getKey() + " ");
//                System.out.println(data.getValue());
//            }
//        }

        Remove duplicate characters from a string
//        String x = "SILLYSPIDER";
//        char y[] = x.toCharArray();
//        int size = x.length();
//
//        Map<Character , Integer> map = new LinkedHashMap<>();
//
//        int i =0;
//        while(i!=size){
//            if(map.containsKey(y[i]) == false){
//                map.put(y[i] , 1);
//            }
//            else{
//                int oldval = map.get(y[i]);
//                int newval = oldval+1;
//                map.put(y[i] , newval);
//            }
//            i++;
//        }
//
//        Set<Map.Entry<Character , Integer>> hmap = map.entrySet();
//        String res = "";
//        for(Map.Entry<Character , Integer> data : hmap){
//            res = res + data.getKey();
//        }
//        System.out.println(res);

        Remove White Spaces from a String
//        String x = "afhu fffd g    ge g  g  s  dg d  gs   ds g  ds  gs g s   d";
//        x=x.replaceAll("\\s" , "");
//        System.out.println(x);

        count number of the words in a sentence
//        String x = "WE ARE PROUD INDIANS";
//        String y[] = x.split(" ");
//        System.out.println(y.length);

        Check if a string is rotational or not
//        String x = "maths";
//        String y = "thsma";
//
//        String newString = x.concat(x);
//
//        if(newString.contains(y)){
//            System.out.println("Rotational String");
//        }
//        else{
//            System.out.println("Not rotational String");
//        }

        Delete all occurances of a character
        // String x = "SPIDERSLIES";
        // char y[] = x.toCharArray();
        // int size = x.length();
        // char key = 'S';

        // String res = "";
        // int i =0;
        // while(i!=size){
        //     if(y[i] !=key){
        //         res = res + y[i];
        //     }
        //     i++;
        // }
        // System.out.println(res);







    }
//    public static boolean isPangram(String sentence) {
//        if (sentence == null || sentence.length() < 26) {
//            return false;
//        }
//        HashSet<Character> uniqueLetters = new HashSet<>();
//        sentence = sentence.toLowerCase();
//        for (char ch : sentence.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z') {
//                uniqueLetters.add(ch);
//            }
//        }
//        return uniqueLetters.size() == 26;
//    }
}
