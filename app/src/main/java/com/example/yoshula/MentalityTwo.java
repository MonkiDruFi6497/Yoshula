package com.example.yoshula;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.yoshula.R.id.btTwo;
import static com.example.yoshula.R.id.rgLeftSharp;

public class MentalityTwo extends AppCompatActivity {

    private TextView tvTwo;
    private Button btTwo;
    private RadioGroup rgLeftTwo, rgRightTwo;
    private RadioButton  rgLeftSteep, rgLeftSharp, rgLeftWhite, rgLeftSquare,
                         rgRightDark, rgRightMuch, rgRightSweet, rgRightNarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentality_two);
        setTitle("準到可怕心理測驗");
        tvTwo = findViewById(R.id.tvTwo);
        btTwo = findViewById(R.id.btTwo);

        rgLeftTwo = findViewById(R.id.rgLeftTwo);
        rgRightTwo = findViewById(R.id.rgRightTwo);

        rgLeftSteep = findViewById(R.id.rgLeftSteep);
        rgLeftSharp = findViewById(R.id.rgLeftSharp);
        rgLeftWhite = findViewById(R.id.rgLeftWhite);
        rgLeftSquare = findViewById(R.id.rgLeftSquare);
        rgRightDark = findViewById(R.id.rgRightDark);
        rgRightMuch = findViewById(R.id.rgRightMuch);
        rgRightSweet = findViewById(R.id.rgRightSweet);
        rgRightNarrow = findViewById(R.id.rgRightNarrow);

        btTwo.setOnClickListener(new BtTwoClick());


    }


    private class BtTwoClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MentalityTwo.this, MentalityThree.class);
            startActivity(intent);
            MentalityTwo.this.finish();
        }
    }
}
