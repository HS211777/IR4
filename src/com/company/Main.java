package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static ArrayList<Players> players = new ArrayList<>();
    private static ArrayList<String> dominoes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter player1's name");
        createplayer(inputString());
        System.out.println("Enter player2's name");
        createplayer(inputString());
        createdominoes();
        Collections.shuffle(dominoes);
        //System.out.println(dominoes);
        givedominoes(7,0);
        givedominoes(7,1);
        System.out.println(players.get(0).toString());
        System.out.println(players.get(1).toString());
        System.out.println(dominoes);
        boolean player1 = findtile("[6:6]",0);
        boolean player2 = findtile("[6:6}",1);
        if (player1){
            System.out.println("it is "+players.get(0)+"'s turn");
        }
        else if (player2){
            System.out.println("it is "+players.get(1)+"'s turn");
        }

    }
    public static void createplayer(String name){
        ArrayList<String> temp = new ArrayList<>();
        Players myPlayer = new Players(0, name,temp);
        players.add(myPlayer);
    }
    public static String inputString(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    public static void createdominoes(){
        for (int i = 0; i < 7; i++){
            for (int j = i; j < 7; j++){
                dominoes.add("["+i+":"+j+"]");
            }
        }
    }
    public static void givedominoes(int number, int player){
        Players myPlayer = players.get(player);
        for(int j = 0; j < number; j++){
            myPlayer.setDominoes(dominoes.get(0));
            dominoes.remove(0);
        }
    }
    public static boolean findtile(String tile, int player){
        Players myPlayer = players.get(player);
        boolean out = false;
        ArrayList<String> list = myPlayer.getDominoes();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(tile)){
                out = true;
            }
        }
        return out;
    }
}
