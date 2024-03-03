package com.example.demo003;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SetButtonMove();

    }

    public void SetButtonMove() {
        Button button = findViewById(R.id.MOVE_button_id);
        button.setOnClickListener(v -> {
            Intent intent1 = new Intent(this, TriedAtivity.class);
            startActivities(intent1);
        });
    }
}

