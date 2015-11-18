package com.embedonix.colormind.engine;

import android.graphics.Color;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * Created by saeid on 18.11.15.
 */
public class GameColors {

    private List<Integer> mColors = new ArrayList<Integer>();

    public GameColors() {
        mColors.clear();

        mColors.add(Color.BLACK);
        mColors.add(Color.BLUE);
        mColors.add(Color.CYAN);
        mColors.add(Color.GREEN);
        mColors.add(Color.MAGENTA);
        mColors.add(Color.WHITE);
        mColors.add(Color.rgb(255, 105, 180)); //pink
        mColors.add(Color.rgb(255, 165, 0)); //orange
        mColors.add(Color.rgb(255, 255, 0)); //yellow
    }

    /**
     * Shuffles an array of integers
     * @param ar an array of integers with any length!
     */
    private static int[] shuffleArray(int[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random(10293847);
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }

        return ar;
    }

    /**
     * Get a list of unique colors from defined colors
     * @param count how many colors to return?
     * @return List of uinque colors (Integer, RGB)
     * @throws IllegalArgumentException if count is bigger than color repository!
     */
    public List<Integer> getUniqueRandomColors(int count) {

        if(count > mColors.size()) { //check if we can satisfy the request
            throw new IllegalArgumentException("count '" + count + "' is larger than number of" +
                    "avilable colors '" + mColors.size() +"'");
        }

        Collections.shuffle(mColors); //shuffle the elements of mColors

        return new ArrayList<>(mColors.subList(0, count));
    }
}
