package com.example.awesomefat.jsonbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class CreateObjectValue extends AppCompatActivity {


    private EditText nameET;
    private EditText valueET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_object_value);
        this.nameET = (EditText)this.findViewById(R.id.ObjText1);
        this.valueET = (EditText)this.findViewById(R.id.Objvalue1);
    }

    public void ButtonPressed(View v){
        String s=this.valueET.getText().toString();
        String[] parts = s.split(",");
        BuilderCore.currentBuildJSONObjectActivity.addObjectValue(this.nameET.getText().toString(), parts);
        this.onBackPressed();
    }
}
