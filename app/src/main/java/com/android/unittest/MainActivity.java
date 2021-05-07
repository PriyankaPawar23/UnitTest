package com.android.unittest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button BtnSave;
    EditText EditNum,EditPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnSave=findViewById(R.id.BtnSave);
        EditNum=findViewById(R.id.EditNum);
        EditPass=findViewById(R.id.EditPass);
    }


}