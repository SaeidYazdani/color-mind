package com.embedonix.colormind.engine;

import android.widget.Button;

import com.embedonix.colormind.GameActivity;

import java.util.List;

/**
 * Created by saeid on 18.11.15.
 */
public class GameEngine {

    private GameColors mColors;
    private List<Button> mButtonList;
    private GameActivity mGameActivity;

    public GameEngine(List<Button> buttonList, GameActivity gameActivity) {
        mButtonList = buttonList;
        mGameActivity = gameActivity;
        mColors = new GameColors();
    }

    public void startGame() {
        List<Integer> colors = mColors.getUniqueRandomColors(mButtonList.size());
        for(int i = 0; i < colors.size(); i++) {
            mButtonList.get(i).setBackgroundColor(colors.get(i));
        }
    }
}
