package sample;

import java.util.ArrayList;

public class StringProcess {
    public static void main(String []args){
        String word="the";

        for(int i=0;i<word.length()-1;i++){
            System.out.print(charToGroup(word.charAt(i))+"-"+ charToGroup(word.charAt(i+1))+ " ");
        }
    }

    //Char to corresponding t9 letter
    public static int charToGroup(char a){
        int group=0;
        if(a<112){
            group= ((a-'a')/3) +2;
        }
        else if(a<116){
            group = 7;
        }
        else{
            group= (a < 'w') ? 8 : 9;
        }
        return group;
    }

    public static ArrayList<Integer[]> stringToGroups(String str){
        ArrayList<Integer[]> mappings = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            Integer[] current = new Integer[2];
            current[0]=charToGroup(str.charAt(i));
            current[1]=charToGroup(str.charAt(i+1));
            mappings.add(current);
        }
        return mappings;
    }
}
