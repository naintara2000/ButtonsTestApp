package com.example.buttonstestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                final View layout = inflater.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.custom_toast_layout));
                Toast toast = new Toast(getApplicationContext());
                toast.setView(layout);
                toast.show();
            }
        });

        ToggleButton buttonToggle = findViewById(R.id.toggleButton);
        buttonToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();

                final View layout;

                boolean on = ((ToggleButton) v).isChecked();
                if (on) {
                    layout = inflater.inflate(R.layout.cystom_on,
                            (ViewGroup) findViewById(R.id.custom_toast_layout_on));
                } else {
                    layout = inflater.inflate(R.layout.custom_off,
                            (ViewGroup) findViewById(R.id.custom_toast_layout_off));
                }
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.setView(layout);
                toast.show();

            }
        });
    }

}