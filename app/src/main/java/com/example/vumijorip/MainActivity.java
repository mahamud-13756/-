package com.example.vumijorip;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView showDialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // popup layout
        showDialogButton = findViewById(R.id.amazonImage);

        showDialogButton.setOnClickListener(v -> {
            // Inflate the layout of the dialog
            LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View dialogView = inflater.inflate(R.layout.my_details, null);

            // Create and show the dialog
            Dialog dialog = new Dialog(MainActivity.this);
            dialog.setContentView(dialogView);
            dialog.setCancelable(true);  // Allows dismissing the dialog by clicking outside

            dialog.show();
        });






    }
}