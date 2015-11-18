package com.embedonix.colormind;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.embedonix.colormind.engine.GameEngine;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends Activity {

    GameEngine mEngine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button b0 = (Button) findViewById(R.id.button_0);
        Button b1 = (Button) findViewById(R.id.button_1);
        Button b2 = (Button) findViewById(R.id.button_2);
        Button b3 = (Button) findViewById(R.id.button_3);
        Button b4 = (Button) findViewById(R.id.button_4);

        List<Button> buttons = new ArrayList<>();
        buttons.add(b0);
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);

        mEngine = new GameEngine(buttons, this);
        mEngine.startGame();
    }
}
