package com.nandathantsin.dialogboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nandathantsin.dialogboxlibrary.NandaDialogBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NandaDialogBox.build(MainActivity.this,"This is a test.");
    }
}
