package edu.fpt.se1603.group6.dinogame;

public class Score {
    private int score;
    private String name;

    public Score(String name, int score) {
        this.score = score;
        this.name = name;
    }

    public static Score parse(String nextLine) {
        String[] split = nextLine.split(": ");
        return new Score(split[0], Integer.parseInt(split[1]));
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
        return getName() + ": " + getScore();
    }
}
