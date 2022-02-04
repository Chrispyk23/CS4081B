package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<String> story;
    ArrayList<String> newStory = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        story = new ArrayList<>();
        story.add("you get knocked out");
        story.add("you go somewhere else");
        story.add("you find a dead man");
        story.add("you find a dead woman");
        story.add("you meet a buxom blonde");
        story.add("someone has searched the place");
        story.add("a crooked cop warns you");
        story.add("you are arrested");
        story.add("you find a gun");
        story.add("you find a knife");
        story.add("you find some bullets");
        story.add("you find a car");
        story.add("A wild animal chases after you");
        story.add("you find a flare gun");
        story.add("you call for help");
        story.add("you find a friend");
        story.add("you are being chased");
        story.add("you find some shoes");
        story.add("you look at the nearby river");
        story.add("you look for food");

    }

    Button button = (Button) findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // Do something in response to button click
            String getStory(){
            return story;

        }
    })


    }