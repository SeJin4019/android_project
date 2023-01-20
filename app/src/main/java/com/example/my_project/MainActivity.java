package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.my_project.info_add.Login;
import com.example.my_project.info_add.info_add_id;

import java.text.CollationElementIterator;

public class MainActivity extends AppCompatActivity {
    public CollationElementIterator birthday;
    Button info_add_btn;
    Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info_add_btn = findViewById(R.id.info_add_btn);
        login_btn = findViewById(R.id.login_btn);

        // 회원가입 버튼 입력시
        info_add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_info_add_id = new Intent(MainActivity.this, info_add_id.class);
                startActivity(go_info_add_id);
            }
        });
        
        // 로그인 버튼 입력시
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_login = new Intent(MainActivity.this, Login.class);
                startActivity(go_login);
            }
        });
    }
}