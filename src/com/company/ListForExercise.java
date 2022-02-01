package com.company;

import java.util.ArrayList;

public class ListForExercise {

    public boolean doesArrayListContainString(ArrayList<String> list, String s){

        for (String string: list) {
            if (string.equals(s)){
                System.out.println("The String has been found");
                return true;
            }
        }
        list.add(s);
        return false;
    }

    /*public boolean doesArraylistContainString(ArrayList<String> list, String s){
        if (list.contains(s)){
            System.out.println("The String has been found");
            return true;
        }else {
         list.add(s);
        }
        return false;
    }*/

}
