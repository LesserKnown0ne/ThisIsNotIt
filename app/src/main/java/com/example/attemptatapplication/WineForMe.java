package com.example.attemptatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class WineForMe extends AppCompatActivity {
    Cart cart = new Cart();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wineforme);
    }

    protected void passionButtonClicked(View view){
        Wine selectedWine;
        String name = "Passionfruit Wine";
        String size;

        RadioGroup sizeGroup =  (RadioGroup) findViewById(R.id.radio_passion);
        int id = sizeGroup.getCheckedRadioButtonId();

        switch (id){
            case R.id.radioBP1:
                size = "1 L";
                break;
            case R.id.radioBP2:
                size = "750 mL";
                break;
            case R.id.radioBP3:
                size = "500 mL";
                break;
        }


    }
}