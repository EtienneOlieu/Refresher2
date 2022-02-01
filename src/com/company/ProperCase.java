package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProperCase {

    public String caseMaster3000(String s) {
        String modifiedString = "";
        String[] words = s.split(" ");

        for (String string : words) {

            if (checkForUpperCase(string) == true) {
                modifiedString += string + " ";

            } else if (string.length() <= 3) {
                modifiedString += string.toLowerCase() + " ";

            } else if (string.length() > 3) {

                String firstLetter = string.substring(0,1).toUpperCase();
                String restOfWord = string.substring(1).toLowerCase();

                modifiedString += firstLetter + restOfWord + " ";
            }

        }

        return modifiedString.trim();
    }

    public boolean checkForUpperCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    ProperCase properCase = new ProperCase();

        System.out.println(properCase.caseMaster3000("Pants ARe rolling on the FLOOR of My AppArtmenT"));
    }
}
