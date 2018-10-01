package com.moneyteam.rockpaperscissors;

import android.content.Context;
import android.util.AttributeSet;

public class RockButton extends HandButton {

    public RockButton(Context context) {
        super(context);
    }

    public RockButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    String getHandText() {
        return "Rock";
    }

    @Override
    Hand getHand() {
        return Hand.ROCK;
    }
}

