package com.example.my_project.info_add;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.my_project.R;

public class info_add_password extends AppCompatActivity {
    Button next_btn;
    ImageButton back_btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_add_password);
        next_btn = findViewById(R.id.next_btn);
        back_btn = findViewById(R.id.back_btn);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(info_add_password.this, info_add_private.class);
                startActivity(next);
                finish();
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_next = new Intent(info_add_password.this, info_add_id.class);
                startActivity(back_next);
                finish();
            }
        });
    }
}