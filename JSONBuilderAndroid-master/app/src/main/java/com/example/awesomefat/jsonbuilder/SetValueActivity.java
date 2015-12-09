package com.example.awesomefat.jsonbuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SetValueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_value);
    }
    public void Objectpressed(View v){
      //  BuilderCore.currentBuildJSONObjectActivity ;
        Intent i=new Intent(this,CreateObjectValue.class);
        this.startActivity(i);

    }
    public void ArrayPressed(View v){
        Intent i=new Intent(this,CreateNameValueActivity.class);
        this.startActivity(i);

    }
}
