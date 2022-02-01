package com.company;

import java.util.Scanner;

public class GrassMowing {

    public int isItTimeToMowTheGrass(int currentGrassLength, int maximumGrassLength){
        int daysUntilMow = 0;

        for (int i = currentGrassLength; i <= maximumGrassLength; i+=8) {
            daysUntilMow ++;
        }

        return daysUntilMow;
    }

    public static void main(String[] args) {
        GrassMowing grassMowing = new GrassMowing();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvor højt er dit græs, udtrykt i milimeter?");
        int currentGrassLength = Integer.parseInt(sc.nextLine());
        System.out.println("Hvor højt må dit græs maksimalt blive, udtrykt i milimeter?");
        int maximumGrassLength = Integer.parseInt(sc.nextLine());
        System.out.println("Dit græs skal slås om " +grassMowing.isItTimeToMowTheGrass(currentGrassLength,maximumGrassLength) + " dage.");
    }
}
