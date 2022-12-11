package com.example.androidproject;
//good button is 7
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

import java.util.Random;

public class GameScreen extends AppCompatActivity {
    String b1Text="";
    String b2Text="";
    String b3Text="";
    String b4Text="";
    String b5Text="";
    String b6Text="";
    String b7Text="";
    String b8Text="";
    String b9Text="";
    String b10Text="";
    String b11Text="";
    String b12Text="";
    String b13Text="";
    String b14Text="";
    String b15Text="";
    String b16Text="";
    String b17Text="";
    String b18Text="";
    String b19Text="";
    String b20Text="";




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
            b1Text="yellow";//
            b2Text="blue";//
            b3Text="blue";//
            b4Text="yellow";//
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
            b1Text="red";//
            b2Text="blue";//
            b3Text="red";//
            b4Text="blue";//
            b5Text="orange";//
            b6Text="orange";//
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
            b1Text="green";//
            b2Text="red";//
            b3Text="red";//
            b4Text="purple";//
            b5Text="orange";//
            b6Text="orange";//
            b7Text="purple";//
            b8Text="green";//
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
            b1Text="green";//
            b2Text="yellow";
            b3Text="red";//
            b4Text="yellow";
            b5Text="orange";//
            b6Text="orange";//
            b7Text="purple";//
            b8Text="green";//
            b9Text="red";//
            b10Text="purple";//

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
            b1Text="green";//
            b2Text="blue";//
            b3Text="red";//
            b4Text="yellow";//
            b5Text="orange";//
            b6Text="orange";//
            b7Text="purple";//
            b8Text="green";//
            b9Text="red";//
            b10Text="purple";//
            b11Text="yellow";//
            b12Text="blue";//

        }
        if(x.equals("14")){
            b15.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
            b1Text="green"; //
            b2Text="blue";//
            b3Text="red";//
            b4Text="yellow";//
            b5Text="orange";//
            b6Text="orange";//
            b7Text="purple";//
            b8Text="green";//
            b9Text="red";//
            b10Text="purple";//
            b11Text="yellow";//
            b12Text="white";//
            b13Text="blue";//
            b14Text="white";//
        }
        if(x.equals("16")){
            b17.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
            b1Text="green"; //
            b2Text="blue";//
            b3Text="red";//
            b4Text="yellow";//
            b5Text="orange";//
            b6Text="orange";//
            b7Text="purple";//
            b8Text="green"; //
            b9Text="red"; //
            b10Text="purple";//
            b11Text="yellow";//
            b12Text="white";//
            b13Text="blue";//
            b14Text="silver";//
            b15Text="white";//
            b16Text="black";//
        }
        if(x.equals("18")){
            b19.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
            b1Text="green"; //
            b2Text="blue";//
            b3Text="red";//
            b4Text="yellow";//
            b5Text="orange";//
            b6Text="orange";//
            b7Text="purple";//
            b8Text="green"; //
            b9Text="red"; //
            b10Text="purple";//
            b11Text="yellow";//
            b12Text="white";//
            b13Text="blue";//
            b14Text="silver";//
            b15Text="white";//
            b16Text="black";//
            b17Text="silver";//
            b18Text="black";//

        }if(x.equals("20")){
            b1Text="green";
            b2Text="blue";
            b3Text="red";
            b4Text="yellow";
            b5Text="orange";
            b6Text="orange";
            b7Text="purple";
            b8Text="green";
            b9Text="red";
            b10Text="purple";
            b11Text="yellow";
            b12Text="white";
            b13Text="blue";
            b14Text="silver";
            b15Text="white";
            b16Text="black";
            b17Text="grey";
            b18Text="black";
            b19Text="grey";
            b20Text="silver";
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
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");
        b16.setText("");
        b17.setText("");
        b18.setText("");
        b19.setText("");
        b20.setText("");

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
                b1.setText(b1Text);
                b2.setText(b2Text);
                b3.setText(b3Text);
                b4.setText(b4Text);
                b5.setText(b5Text);
                b6.setText(b6Text);
                b7.setText(b7Text);
                b8.setText(b8Text);
                b9.setText(b9Text);
                b10.setText(b10Text);
                b11.setText(b11Text);
                b12.setText(b12Text);
                b13.setText(b13Text);
                b14.setText(b14Text);
                b15.setText(b15Text);
                b16.setText(b16Text);
                b17.setText(b17Text);
                b18.setText(b18Text);
                b19.setText(b19Text);
                b20.setText(b20Text);



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
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                b10.setText("");
                b11.setText("");
                b12.setText("");
                b13.setText("");
                b14.setText("");
                b15.setText("");
                b16.setText("");
                b17.setText("");
                b18.setText("");
                b19.setText("");
                b20.setText("");

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
                lastButtonClicked.setText("");
                buttonB4Last.setText("");


            }
        });

//keeping the card pics just in case
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String b1Text = "green";
                System.out.println("The button was clicked");
                b1.setText(b1Text);
                b1.setBackgroundResource(R.drawable.purple);
                b1.setBackgroundColor(Color.WHITE);
                tryAgain(b1);
                buttons(b1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String b2Text = "blue";
                b2.setText(b2Text);
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
                //String bText = "red";
                b3.setText(b3Text);
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
                //String bText = "yellow";
                b4.setText(b4Text);
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
                //String bText = "orange";
                b5.setText(b5Text);
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
                //String bText = "orange";
                b6.setText(b6Text);
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
                //String bText = "purple";
                b7.setText(b7Text);
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
                //String bText = "green";
                b8.setText(b8Text);
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
                //String bText = "red";
                b9.setText(b9Text);
                System.out.println("The button was clicked");
                //b9.setBackgroundResource(R.drawable.th9);
                b9.setBackgroundColor(Color.WHITE);
                tryAgain(b9);
                buttons(b9);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String bText = "purple";
                b10.setText(b10Text);
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
                //String bText = "yellow";
                b11.setText(b11Text);
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
                //String bText = "white";
                b12.setText(b12Text);
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
                //String bText = "blue";
                b13.setText(b13Text);
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
                //String bText = "silver";
                b14.setText(b14Text);
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
                //String bText = "white";
                b15.setText(b15Text);
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
                //String bText = "black";
                b16.setText(b16Text);
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
                //String bText = "grey";
                b17.setText(b17Text);
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
                //String bText = "black";
                b18.setText(b18Text);
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
                //String bText = "grey";
                b19.setText(b19Text);
                System.out.println("The button was clicked");
                //b19.setBackgroundResource(R.drawable.th9);
                b19.setBackgroundColor(Color.WHITE);
                tryAgain(b19);
                buttons(b19);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String bText = "silver";
                b20.setText(b20Text);
                System.out.println("The button was clicked");
                b20.setBackgroundResource(R.drawable.th2);
                b20.setBackgroundColor(Color.WHITE);
                tryAgain(b20);
                buttons(b20);
            }
        });
    }
}