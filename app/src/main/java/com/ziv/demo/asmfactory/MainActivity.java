package com.ziv.demo.asmfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ziv.demo.asmfactory.annotation.StaticFunction;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @StaticFunction
    public static void test() {
        Log.d(TAG, "ASM static function running.");
    }
}
