package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> wordList = new ArrayList<>();

    public void addWordsToList(){
        System.out.println("Please provide 5 words to the array");
        while (wordList.size()< 5){
            wordList.add(sc.nextLine());
        }
    }

    public ArrayList<String> sortTheList(){
        Collections.sort(wordList);
        return wordList;
    }

    public String wordlistToString(){
        String finalString = "";

        for (String s : wordList){
            finalString += s+ " ";
        }
        return finalString.trim();
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.addWordsToList();
        sorting.sortTheList();
        System.out.println(sorting.wordlistToString());

    }
}
