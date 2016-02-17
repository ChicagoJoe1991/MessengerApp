package com.example.walter.messenger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.content.Intent;
//we need to import android.widget libraries for the required view
import android.widget.EditText;


public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //call onSendMessage() when the button is clicked
    public void onSendMessage(View view){
        //get a reference to the EditText view
        EditText messageView = (EditText) findViewById(R.id.message);
        // get the text from the EditText view, allocate memory for it and make it a string
        String messageText = messageView.getText().toString();
        //Create a new Intent
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        /*add extra information to the intent, in this case the string from the EditText view,
        Also, ReceiveMessageActivity.EXTRA_MESSAGE is a constant for the name of the exxtra
        information. We will add it to ReceiveMessageActivity next.*/
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        //send the activity to android for review
        startActivity(intent);

    }




}
