package com.example.walter.messenger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.content.Intent;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    //this is the name of the extra value we are passing in the intent
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        //get the intent using the getIntent method
        Intent intent = getIntent();
        /*get the value of the string message using getStringExtra() method and allocate
        memory to the message by assigning it to the variable messageText
         */
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        //create a reference to the TextView object
        TextView messageView = (TextView) findViewById(R.id.message);
        //set the text for the message TextView to the string from the intent
        messageView.setText(messageText);


    }

}
