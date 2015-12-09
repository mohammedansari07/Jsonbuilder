package com.example.awesomefat.jsonbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class GenerateJSONActivity extends AppCompatActivity
{
    private EditText theJSONET;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_json);
        this.theJSONET = (EditText)this.findViewById(R.id.theJSONET);
        this.theJSONET.setText(BuilderCore.theJSON);
    }
}
