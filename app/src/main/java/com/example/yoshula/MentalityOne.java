package com.example.yoshula;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import javax.security.auth.PrivateCredentialPermission;

public class MentalityOne extends AppCompatActivity {

    private TextView tvOne;
    private Button btOne;
    private RadioGroup rgLeft, rgRight;
    private RadioButton  rgLeftMouse, rgLeftSnot, rgLeftCup, rgLeftSPA,
                         rgRightTrash,  rgRightCoffice, rgRightWinter, rgRightRiceCake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentality_one);
        setTitle("準到可怕心理測驗");

        rgLeft  = findViewById(R.id.rgLeft);
        rgRight = findViewById(R.id.rgRight);

        rgLeftMouse = findViewById(R.id.rgLeftMouse);
        rgLeftSnot  = findViewById(R.id.rgLeftSnot);
        rgLeftCup   = findViewById(R.id.rgLeftCup);
        rgLeftSPA   = findViewById(R.id.rgLeftSPA);

        rgRightTrash    = findViewById(R.id.rgRightTrash);
        rgRightCoffice  = findViewById(R.id.rgRightCoffice);
        rgRightWinter   = findViewById(R.id.rgRightWinter);
        rgRightRiceCake = findViewById(R.id.rgRightRiceCake);


        tvOne = findViewById(R.id.tvOne);
        btOne = findViewById(R.id.btOne);
        btOne.setOnClickListener(new BtOneClick());


    }


    private class BtOneClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MentalityOne.this, MentalityTwo.class);
            startActivity(intent);
            MentalityOne.this.finish();

        }
    }
}
