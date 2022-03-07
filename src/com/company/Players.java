package com.company;

import java.util.ArrayList;

public class Players {
    private int score;
    private String name;
    private ArrayList<String> dominoes;

    public Players(int score, String name, ArrayList<String> dominoes) {
        this.score = score;
        this.name = name;
        this.dominoes = dominoes;
    }

    public ArrayList<String> getDominoes() {
        return dominoes;
    }

    public void setDominoes(String dominoes) {
        this.dominoes.add(dominoes);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Players{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", dominoes=" + dominoes +
                '}';
    }
}
