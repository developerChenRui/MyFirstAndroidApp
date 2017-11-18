package com.example.chenrui.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.chenrui.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent_inuyasha = new Intent(this, DisplayMessageActivity.class);
        Intent intent_qi = new Intent(this,DisplayQiActivity.class);
        Intent intent_frag = new Intent(this,FragmentActivity.class);
        Intent intent_firebase = new Intent(this,FireBaseActivity.class);


        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        if(message.equals("inuyasha")){
            intent_inuyasha.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent_inuyasha);}

        if(message.equals("qibao")){
            intent_qi.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent_qi);
        }

        if(message.equals("fragmentdemo")){
            intent_frag.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent_frag);
        }

        if(message.equals("firebase")){
            startActivity(intent_firebase);
        }
    }
}
