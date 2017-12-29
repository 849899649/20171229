package com.example.test.first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by fumin on 2017/12/15.
 */

public class BaseActivity extends AppCompatActivity {
    private void log(String name){
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
//        Toast.makeText(BaseActivity.this, methodName, Toast.LENGTH_SHORT).show();
        Log.d("tag_ba", stackTrace[1].getMethodName() + stackTrace[2].getMethodName() + stackTrace[3].getMethodName());
    }
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        log("onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        log("onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        log("onPause");

    }


    @Override
    protected void onResume() {
        super.onResume();
        log("onResume");

    }
}
