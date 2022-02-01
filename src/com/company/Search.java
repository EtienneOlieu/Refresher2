package com.company;
import java.util.ArrayList;

public class Search {

    public int search(ArrayList<String> list, String s) {
        try {
            if (list.contains(s)) {
                return list.indexOf(s);
            }else {
                throw new StringNotFoundException();
            }
        } catch (StringNotFoundException e) {
            System.out.println("String " + s + " was not found" );
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("fløde");
        list.add("makrel");
        list.add("yoghurt");

        Search search = new Search();
        System.out.println(search.search(list,"yoghurt"));

        System.out.println(search.search(list,"hattemager"));
    }
}
