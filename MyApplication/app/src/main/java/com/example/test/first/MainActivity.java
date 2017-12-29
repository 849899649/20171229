package com.example.test.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.test.R;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userEt = (EditText) findViewById(R.id.et_user);
        final EditText pwdEt = (EditText) findViewById(R.id.et_pwd);
        Button submitBtn = (Button) findViewById(R.id.btn_submit);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = userEt.getText().toString();
                String pwd = pwdEt.getText().toString();
                Toast.makeText(MainActivity.this, username + pwd + "ok", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,HomeActivity.class));
                startActivity(new Intent(MainActivity.this,MusicActivity.class));
            }
        });


    }



}
