package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.my_project.info_add.info_add_id;

public class MainActivity extends AppCompatActivity {
    Button info_add_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info_add_btn = findViewById(R.id.info_add_btn);

        info_add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_info_add_id = new Intent(MainActivity.this, info_add_id.class);
                startActivity(go_info_add_id);
            }
        });
    }
}