package com.moneyteam.rockpaperscissors;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.widget.Button;

public abstract class HandButton extends AppCompatButton {

    /**
     * Playable count for this hand.
     */
    private int rest;

    public HandButton(Context context) {
        super(context);
        rest = 10;
        setText(getHandText());
    }

    public HandButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        rest = 10;
        setText(getHandText() + "\nrest: " + rest);
    }

    /**
     * Updates button text by means of {@link #getHandText()} and the rest count.
     */
    public void updateText() {
        setText(getHandText() + "\nrest: " + rest);
    }

    public int getRest() {
        return rest;
    }

    public void play() {
        --rest;
    }

    /**
     * Returns a hand name corresponding to this button.
     */
    abstract String getHandText();

    abstract Hand getHand();
}
