package com.example.my_project.info_add;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.my_project.MainActivity;
import com.example.my_project.R;

public class info_add_id extends AppCompatActivity {
    ImageButton back_btn;
    Button next_btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_add_id);
        next_btn = findViewById(R.id.next_btn);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_back_main = new Intent(info_add_id.this, MainActivity.class);
                startActivity(go_back_main);
                finish();
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(info_add_id.this, info_add_password.class);
                startActivity(next);
                finish();
            }
        });



    }
}