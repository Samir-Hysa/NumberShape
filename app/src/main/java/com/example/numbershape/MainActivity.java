package com.example.numbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    class Number {

        int number;

        public boolean SquareN() {

            double SquareRoot = Math.sqrt(number);

            if (SquareRoot == Math.floor(SquareRoot)) {

                return true;

            } else {

                return false;

            }

        }

        public boolean TriangularN() {

            int TriangularNumber = 1;
            int x = 1;

            while (TriangularNumber < number) {

                x++;
                TriangularNumber = TriangularNumber + x;

            }

            if (TriangularNumber == number) {

                return true;

            } else {

                return false;

            }
        }
    }

    public void Button (View view) {

        String message;
        String message_2;

        EditText NumberIn = (EditText) findViewById(R.id.NumberIN);
        int Value = Integer.parseInt(NumberIn.getText().toString());

        Number My_number = new Number();
        My_number.number = Value;

        TextView Text = (TextView) findViewById(R.id.TextD);

        if (My_number.TriangularN() == true) {

            message = ("the number is triangular");

        }else {

            message = ("is not triangular");

        }

        if (My_number.SquareN() == true) {

            message_2 = ("the number is a Square");

        }else {

            message_2 = ("is not Square");

        }


        Text.setText(message+" and "+message_2);



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


