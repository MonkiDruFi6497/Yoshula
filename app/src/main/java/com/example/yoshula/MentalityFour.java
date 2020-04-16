package com.example.yoshula;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MentalityFour extends AppCompatActivity {

    private TextView tvFour, tvResult;
    private Button btFour;
    private ImageView imgReturn;
    private RadioGroup rgLeftFour, rgRightFout;
    private RadioButton  rgLeftKnife, rgLeftPyramid, rgLeftSugar, rgLeftTortoise,
                         rgRightPencil,  rgRightUniverse, rgRightKennel, rgRightTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentality_four);
        setTitle("準到可怕心理測驗");

        tvFour    = findViewById(R.id.tvFour);
        tvResult  = findViewById(R.id.tvResult);
        btFour    = findViewById(R.id.btFour);
        imgReturn = findViewById(R.id.imgReturn);

        rgLeftFour  = findViewById(R.id.rgLeftFour);
        rgRightFout = findViewById(R.id.rgRightFout);

        rgLeftKnife    = findViewById(R.id.rgLeftKnife);
        rgLeftPyramid  = findViewById(R.id.rgLeftPyramid);
        rgLeftSugar    = findViewById(R.id.rgLeftSugar);
        rgLeftTortoise = findViewById(R.id.rgLeftTortoise);

        rgRightPencil   = findViewById(R.id.rgRightPencil);
        rgRightUniverse = findViewById(R.id.rgRightUniverse);
        rgRightKennel   = findViewById(R.id.rgRightKennel);
        rgRightTable    = findViewById(R.id.rgRightTable);

        btFour.setOnClickListener(new BtFourClick());
        imgReturn.setOnClickListener(new ImgReturnClick());



    }


    private class BtFourClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            tvResult.setTextSize(20.0f);
            tvResult.setTextColor(Color.rgb(0,134,139));
            tvResult.setText("猜您選的是 \"砂糖\" 對吧!\n" +
                    "如果您是特別的人,那你應該是選擇\"桌子\"\n" +
                    "選擇砂糖的人適合天使版,因為代表你\n" +
                    "天真,單純和傻B\n" +
                    "選擇桌子的人,代表有點壞壞,特立獨行你\n" +
                    "適合惡魔版囉\n" +
                    "\n");

        }
    }


    private class ImgReturnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MentalityFour.this, SeetingFragment.class);
            startActivity(intent);
            MentalityFour.this.finish();

        }
    }
}
