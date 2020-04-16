package com.example.yoshula;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MentalityThree extends AppCompatActivity {

    private TextView tvThree;
    private Button btThree;
    private RadioGroup rgLeftThree, rgRightThree;
    private RadioButton  rgLeftComputer, rgLeftNose, rgLeftNeedle, rgLeftNapkin,
                         rgRightRice,  rgRightSteamedBun, rgRightMilk, rgRightPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentality_three);
        setTitle("準到可怕心理測驗");
        tvThree  = findViewById(R.id.tvThree);
        btThree  = findViewById(R.id.btThree);

        rgLeftThree  = findViewById(R.id.rgLeftThree);
        rgRightThree = findViewById(R.id.rgRightThree);

        rgLeftComputer = findViewById(R.id.rgLeftComputer);
        rgLeftNose     = findViewById(R.id.rgLeftNose);
        rgLeftNeedle   = findViewById(R.id.rgLeftNeedle);
        rgLeftNapkin   = findViewById(R.id.rgLeftNapkin);

        rgRightRice       = findViewById(R.id.rgRightRice);
        rgRightSteamedBun = findViewById(R.id.rgRightSteamedBun);
        rgRightMilk       = findViewById(R.id.rgRightMilk);
        rgRightPhone      = findViewById(R.id.rgRightPhone);

        btThree.setOnClickListener(new BtThreeClick());




    }


    private class BtThreeClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MentalityThree.this, MentalityFour.class);
            startActivity(intent);
            MentalityThree.this.finish();
        }
    }
}
