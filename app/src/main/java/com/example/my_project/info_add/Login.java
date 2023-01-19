package com.example.my_project.info_add;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.my_project.MainActivity;
import com.example.my_project.R;

public class Login extends AppCompatActivity {

    ImageButton back_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_back_home = new Intent(Login.this, MainActivity.class);
                startActivity(go_back_home);
                finish();
            }
        });


    }
}