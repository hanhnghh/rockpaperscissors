package com.moneyteam.rockpaperscissors;

import android.support.annotation.NonNull;

public class Hand implements Comparable<Hand>{
    public static final Hand ROCK = new Hand(0);
    public static final Hand PAPER = new Hand(1);
    public static final Hand SCISSORS = new Hand(2);

    private static final Hand[] HANDS = {
            ROCK, PAPER, SCISSORS
    };

    public static Hand fromInt(int i) {
        return HANDS[i % HANDS.length];
    }
    private final int handValue;

    private Hand(int handValue){
        this.handValue = handValue;
    }

    @Override
    public int compareTo(@NonNull Hand another) {
        if ((this == ROCK || this == SCISSORS) && (another == ROCK || another == SCISSORS)) {
            return handValue - another.handValue;
        }
        return -handValue + another.handValue;
    }

    public String getHandText(){
        if(this == ROCK){
            return "ROCK";
        } else if(this == SCISSORS){
            return "SCISSORS";
        } else {
            return "PAPER";
        }
    }
}
