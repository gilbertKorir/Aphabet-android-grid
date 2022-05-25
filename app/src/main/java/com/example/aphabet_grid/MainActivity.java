package com.example.aphabet_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] letters = new String[]{
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.baseGridView);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/calvino/Calvino-Book-trial.ttf"); //change this to your own font if you downloaded a differently named font
        gridView.setAdapter(new AlphabetAdapter(this, letters, typeface));
    }
}