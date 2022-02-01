package com.company;

public class Square {

    public String iMakeAGrid(int number, String s){
        String grid = "";
        String widthGrid = "";

        for (int i = 0; i < number; i++) {
            widthGrid += s + "  ";
        }

        for ( int i = 0; i < number; i++){
            grid += widthGrid + "\n";

        }

        return grid;
    }

    public static void main(String[] args) {
        Square square = new Square();

        System.out.println(square.iMakeAGrid(6,"<>"));
    }

}
