package com.embedonix.colormind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnNewGame;
    private Button mBtnOptions;
    private Button mBtnTopMinds;
    private Button mBtnAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnNewGame = (Button) findViewById(R.id.buttonNewGame);
        mBtnOptions = (Button) findViewById(R.id.buttonOptions);
        mBtnTopMinds = (Button) findViewById(R.id.buttonTopMinds);
        mBtnAbout = (Button) findViewById(R.id.buttonAbout);

        mBtnNewGame.setOnClickListener(this);
        mBtnOptions.setOnClickListener(this);
        mBtnTopMinds.setOnClickListener(this);
        mBtnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonNewGame:
                Intent newGameIntent = new Intent(this, GameActivity.class);
                this.startActivity(newGameIntent);
                break;
            case R.id.buttonOptions:
                break;
            case R.id.buttonTopMinds:
                break;
            case R.id.buttonAbout:
                break;
            default:
                Log.v("MainActivity", "No click handler available for " + v.getId());
        }
    }
}
