package com.example.awesomefat.jsonbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateNameValueActivity extends AppCompatActivity
{
    private EditText nameET;
    private EditText valueET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_name_value);

        this.nameET = (EditText)this.findViewById(R.id.nameET);
        this.valueET = (EditText)this.findViewById(R.id.valueET);
    }

    public void saveButtonPressed(View v)
    {
        BuilderCore.currentBuildJSONObjectActivity.addNameValuePair(this.nameET.getText().toString(), this.valueET.getText().toString());
        this.onBackPressed();
    }
}
