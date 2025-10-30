package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button drawButton = findViewById(R.id.drawButton);
        Button resetButton = findViewById(R.id.resetButton);

        ImageView cube1 = findViewById(R.id.cube1);
        ImageView cube2 = findViewById(R.id.cube2);
        ImageView cube3 = findViewById(R.id.cube3);
        ImageView cube4 = findViewById(R.id.cube4);
        ImageView cube5 = findViewById(R.id.cube5);

        TextView drawResult = findViewById(R.id.drawResult);
        TextView gameResult = findViewById(R.id.gameResult);

        drawButton.setOnClickListener(v -> {
            Random rand = new Random();

        });

    }
}