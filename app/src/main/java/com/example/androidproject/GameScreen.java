package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class GameScreen extends AppCompatActivity {
    int score=0;
int oneTime;
Button buttonB4Last;
Button lastButtonClicked;
String oldButton;
String oldText="";
TextView displayScore;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    Button b18;
    Button b19;
    Button b20;
    Button bTryAgain;
    EditText inputText;
    Button numbers;
    Button bEndGame;
    Button bNewGame;

    public void createBoard(){
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        b10.setVisibility(View.VISIBLE);
        b11.setVisibility(View.VISIBLE);
        b12.setVisibility(View.VISIBLE);
        b13.setVisibility(View.VISIBLE);
        b14.setVisibility(View.VISIBLE);
        b15.setVisibility(View.VISIBLE);
        b16.setVisibility(View.VISIBLE);
        b17.setVisibility(View.VISIBLE);
        b18.setVisibility(View.VISIBLE);
        b19.setVisibility(View.VISIBLE);
        b20.setVisibility(View.VISIBLE);






        String x = inputText.getText().toString();
        if(x.equals("4")){
        b5.setVisibility(View.INVISIBLE);
        b6.setVisibility(View.INVISIBLE);
            b7.setVisibility(View.INVISIBLE);
            b8.setVisibility(View.INVISIBLE);
            b9.setVisibility(View.INVISIBLE);
            b10.setVisibility(View.INVISIBLE);
            b11.setVisibility(View.INVISIBLE);
            b12.setVisibility(View.INVISIBLE);
            b13.setVisibility(View.INVISIBLE);
            b14.setVisibility(View.INVISIBLE);
            b15.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
        }
        if(x.equals("6")){
            b7.setVisibility(View.INVISIBLE);
            b8.setVisibility(View.INVISIBLE);
            b9.setVisibility(View.INVISIBLE);
            b10.setVisibility(View.INVISIBLE);
            b11.setVisibility(View.INVISIBLE);
            b12.setVisibility(View.INVISIBLE);
            b13.setVisibility(View.INVISIBLE);
            b14.setVisibility(View.INVISIBLE);
            b15.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
        }
        if(x.equals("8")){
            b9.setVisibility(View.INVISIBLE);
            b10.setVisibility(View.INVISIBLE);
            b11.setVisibility(View.INVISIBLE);
            b12.setVisibility(View.INVISIBLE);
            b13.setVisibility(View.INVISIBLE);
            b14.setVisibility(View.INVISIBLE);
            b15.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
        }
        if(x.equals("10")){
            b11.setVisibility(View.INVISIBLE);
            b12.setVisibility(View.INVISIBLE);
            b13.setVisibility(View.INVISIBLE);
            b14.setVisibility(View.INVISIBLE);
            b15.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
        }
        if(x.equals("12")){
            b13.setVisibility(View.INVISIBLE);
            b14.setVisibility(View.INVISIBLE);
            b15.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
        }
        if(x.equals("14")){
            b15.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
        }
        if(x.equals("16")){
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
        }
        if(x.equals("18")){
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
        }
    }

    //this method will be used to see if the user guessed incorrectly twice in a row
    public void tryAgain(Button b){
        System.out.println("The old text is " + oldText);
        String currentText = b.getText().toString();
        System.out.println("The current Text is = " + currentText);
        if(!(oldText.equals(currentText)) && (oneTime>=1)){
            System.out.println("These two are not the same, you must try again");
            if((oneTime%2==1)) {
                Toast.makeText(getApplicationContext(), "You guessed incorrectly twice in a row, try again", Toast.LENGTH_LONG).show();
                if (score > 1)
                    score--;
                System.out.println("The current score is " + score);

                displayScore.setText(""+score);
            }
        } else {
            System.out.println("They are the same");
            if(oneTime>=1)
                score+=2;
                System.out.println("The current score is " + score);
                displayScore.setText(""+score);
        }
        oldText = currentText;
        oneTime++;


    }
    //this method gets the last two buttons pressed
    public void buttons(Button b){
        if(oneTime>1){
        buttonB4Last = lastButtonClicked;
        }
        lastButtonClicked = b;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        displayScore= findViewById(R.id.textView2);
        inputText = (EditText) findViewById(R.id.inputText);
        numbers=findViewById(R.id.button23);
        bEndGame=findViewById(R.id.button25);
        bNewGame=findViewById(R.id.button24);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        b14=findViewById(R.id.b14);
        b15=findViewById(R.id.b15);
        b16=findViewById(R.id.b16);
        b17=findViewById(R.id.b17);
        b18=findViewById(R.id.b18);
        b19=findViewById(R.id.b19);
        b20=findViewById(R.id.b20);
        bTryAgain = findViewById(R.id.button22);

        bEndGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
                b7.setVisibility(View.VISIBLE);
                b8.setVisibility(View.VISIBLE);
                b9.setVisibility(View.VISIBLE);
                b10.setVisibility(View.VISIBLE);
                b11.setVisibility(View.VISIBLE);
                b12.setVisibility(View.VISIBLE);
                b13.setVisibility(View.VISIBLE);
                b14.setVisibility(View.VISIBLE);
                b15.setVisibility(View.VISIBLE);
                b16.setVisibility(View.VISIBLE);
                b17.setVisibility(View.VISIBLE);
                b18.setVisibility(View.VISIBLE);
                b19.setVisibility(View.VISIBLE);
                b20.setVisibility(View.VISIBLE);
                b1.setBackgroundColor(Color.WHITE);
                b2.setBackgroundColor(Color.WHITE);
                b3.setBackgroundColor(Color.WHITE);
                b4.setBackgroundColor(Color.WHITE);
                b5.setBackgroundColor(Color.WHITE);
                b6.setBackgroundColor(Color.WHITE);
                b7.setBackgroundColor(Color.WHITE);
                b8.setBackgroundColor(Color.WHITE);
                b9.setBackgroundColor(Color.WHITE);
                b10.setBackgroundColor(Color.WHITE);
                b11.setBackgroundColor(Color.WHITE);
                b12.setBackgroundColor(Color.WHITE);
                b13.setBackgroundColor(Color.WHITE);
                b14.setBackgroundColor(Color.WHITE);
                b15.setBackgroundColor(Color.WHITE);
                b16.setBackgroundColor(Color.WHITE);
                b17.setBackgroundColor(Color.WHITE);
                b18.setBackgroundColor(Color.WHITE);
                b19.setBackgroundColor(Color.WHITE);
                b20.setBackgroundColor(Color.WHITE);




            }
        });
        bNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayScore.setText("score");
                b1.setBackgroundResource(View.VISIBLE);
                b2.setBackgroundResource(View.VISIBLE);
                b3.setBackgroundResource(View.VISIBLE);
                b4.setBackgroundResource(View.VISIBLE);
                b5.setBackgroundResource(View.VISIBLE);
                b6.setBackgroundResource(View.VISIBLE);
                b7.setBackgroundResource(View.VISIBLE);
                b8.setBackgroundResource(View.VISIBLE);
                b9.setBackgroundResource(View.VISIBLE);
                b10.setBackgroundResource(View.VISIBLE);
                b11.setBackgroundResource(View.VISIBLE);
                b12.setBackgroundResource(View.VISIBLE);
                b13.setBackgroundResource(View.VISIBLE);
                b14.setBackgroundResource(View.VISIBLE);
                b15.setBackgroundResource(View.VISIBLE);
                b16.setBackgroundResource(View.VISIBLE);
                b17.setBackgroundResource(View.VISIBLE);
                b18.setBackgroundResource(View.VISIBLE);
                b19.setBackgroundResource(View.VISIBLE);
                b20.setBackgroundResource(View.VISIBLE);
                b1.setBackgroundResource(R.drawable.th);
                b2.setBackgroundResource(R.drawable.th);
                b3.setBackgroundResource(R.drawable.th);
                b4.setBackgroundResource(R.drawable.th);
                b5.setBackgroundResource(R.drawable.th);
                b6.setBackgroundResource(R.drawable.th);
                b7.setBackgroundResource(R.drawable.th);
                b8.setBackgroundResource(R.drawable.th);
                b9.setBackgroundResource(R.drawable.th);
                b10.setBackgroundResource(R.drawable.th);
                b11.setBackgroundResource(R.drawable.th);
                b12.setBackgroundResource(R.drawable.th);
                b13.setBackgroundResource(R.drawable.th);
                b14.setBackgroundResource(R.drawable.th);
                b15.setBackgroundResource(R.drawable.th);
                b16.setBackgroundResource(R.drawable.th);
                b17.setBackgroundResource(R.drawable.th);
                b18.setBackgroundResource(R.drawable.th);
                b19.setBackgroundResource(R.drawable.th);
                b20.setBackgroundResource(R.drawable.th);
                //Toast.makeText(getApplicationContext(),"Please select an even number of tile 4-20 again", Toast.LENGTH_LONG).show();
                score=0;
                oldText="";

            }
        });
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                createBoard();
            }
        });
        bTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oneTime=0;
                lastButtonClicked.setBackgroundResource(R.drawable.th);
                buttonB4Last.setBackgroundResource(R.drawable.th);

            }
        });

//keeping the card pics just in case
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b1.setBackgroundResource(R.drawable.purple);
                b1.setBackgroundColor(Color.WHITE);
                tryAgain(b1);
                buttons(b1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b2.setBackgroundResource(R.drawable.th2);
                b2.setBackgroundColor(Color.WHITE);
                tryAgain(b2);
                buttons(b2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b3.setBackgroundResource(R.drawable.th3);
                b3.setBackgroundColor(Color.WHITE);
                tryAgain(b3);
                buttons(b3);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b4.setBackgroundResource(R.drawable.th4);
                b4.setBackgroundColor(Color.WHITE);
                tryAgain(b4);
                buttons(b4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b5.setBackgroundResource(R.drawable.th5);
                b5.setBackgroundColor(Color.WHITE);
                tryAgain(b5);
                buttons(b5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b6.setBackgroundResource(R.drawable.th6);
                b6.setBackgroundColor(Color.WHITE);
                tryAgain(b6);
                buttons(b6);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b7.setBackgroundResource(R.drawable.th7);
                b7.setBackgroundColor(Color.WHITE);
                tryAgain(b7);
                buttons(b7);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b8.setBackgroundResource(R.drawable.th8);
                b8.setBackgroundColor(Color.WHITE);
                tryAgain(b8);
                buttons(b8);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b9.setBackgroundResource(R.drawable.th9);
                b9.setBackgroundColor(Color.WHITE);
                tryAgain(b9);
                buttons(b9);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b10.setBackgroundResource(R.drawable.purple);
                b10.setBackgroundColor(Color.WHITE);
                tryAgain(b10);
                buttons(b10);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b11.setBackgroundResource(R.drawable.th3);
                b11.setBackgroundColor(Color.WHITE);
                tryAgain(b11);
                buttons(b11);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b12.setBackgroundResource(R.drawable.th2);
                b12.setBackgroundColor(Color.WHITE);
                tryAgain(b12);
                buttons(b12);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b13.setBackgroundResource(R.drawable.th3);
                b13.setBackgroundColor(Color.WHITE);
                tryAgain(b13);
                buttons(b13);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b14.setBackgroundResource(R.drawable.th4);
                b14.setBackgroundColor(Color.WHITE);
                tryAgain(b14);
                buttons(b14);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b15.setBackgroundResource(R.drawable.th5);
                b15.setBackgroundColor(Color.WHITE);
                tryAgain(b15);
                buttons(b15);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b16.setBackgroundResource(R.drawable.th6);
                b16.setBackgroundColor(Color.WHITE);
                tryAgain(b16);
                buttons(b16);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b17.setBackgroundResource(R.drawable.th7);
                b17.setBackgroundColor(Color.WHITE);
                tryAgain(b17);
                buttons(b17);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b18.setBackgroundResource(R.drawable.th8);
                b18.setBackgroundColor(Color.WHITE);
                tryAgain(b18);
                buttons(b18);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b19.setBackgroundResource(R.drawable.th9);
                b19.setBackgroundColor(Color.WHITE);
                tryAgain(b19);
                buttons(b19);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("The button was clicked");
                b20.setBackgroundResource(R.drawable.th2);
                b20.setBackgroundColor(Color.WHITE);
                tryAgain(b20);
                buttons(b20);
            }
        });
    }
}