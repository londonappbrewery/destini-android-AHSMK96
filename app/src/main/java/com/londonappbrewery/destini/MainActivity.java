package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryText;
    private Button mFirstButton;
    private Button mSecondButton;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mFirstButton = (Button) findViewById(R.id.buttonTop);
        mSecondButton = (Button) findViewById(R.id.buttonBottom);





        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    mFirstButton.setText(R.string.T3_Ans1);
                    mSecondButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    mStoryText.setText(R.string.T6_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                }


            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    mStoryText.setText(R.string.T2_Story);
                    mFirstButton.setText(R.string.T2_Ans1);
                    mSecondButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStoryText.setText(R.string.T4_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);
                } else {
                    mStoryText.setText(R.string.T5_End);
                    mFirstButton.setVisibility(View.GONE);
                    mSecondButton.setVisibility(View.GONE);

                }
            }
        });




    }
}
