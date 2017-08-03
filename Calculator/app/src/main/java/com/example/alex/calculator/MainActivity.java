package com.example.alex.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public String operator ="";
    public Double temp1;
    public Double temp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Numerical Buttons on calculator
        Button buttonZero = (Button)findViewById(R.id.buttonZero);
        Button buttonOne = (Button)findViewById(R.id.buttonOne);
        Button buttonTwo = (Button)findViewById(R.id.buttonTwo);
        Button buttonThree = (Button)findViewById(R.id.buttonThree);
        Button buttonFour = (Button)findViewById(R.id.buttonFour);
        Button buttonFive = (Button)findViewById(R.id.buttonFive);
        Button buttonSix = (Button)findViewById(R.id.buttonSix);
        Button buttonSeven = (Button)findViewById(R.id.buttonSeven);
        Button buttonEight = (Button)findViewById(R.id.buttonEight);
        Button buttonNine = (Button)findViewById(R.id.buttonNine);

        //Operator buttons on calculator
        Button buttonEqual = (Button)findViewById(R.id.buttonEqual);
        Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button)findViewById(R.id.buttonMinus);
        Button buttonMultiply = (Button)findViewById(R.id.buttonMultiply);
        Button buttonDivide = (Button)findViewById(R.id.buttonDivide);

        //Other buttons
        Button buttonDecimal = (Button)findViewById(R.id.buttonDecimal);
        Button buttonPlusMinus = (Button)findViewById(R.id.buttonPlusMinus);
        Button buttonDelete = (Button)findViewById(R.id.buttonDelete);
        Button buttonPower = (Button)findViewById((R.id.buttonPower));

        //Button Zero event
        buttonZero.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //ButtonZero Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("0");
                    }
                }
        );

        buttonOne.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //ButtonOne Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("1");
                    }
                }
        );

        buttonTwo.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //ButtonTwo Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("2");
                    }
                }
        );

        buttonThree.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //ButtonThree Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("3");
                    }
                }
        );

        buttonFour.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonFour Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("4");
                    }
                }
        );

        buttonFive.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonFive Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("5");
                    }
                }
        );

        buttonSix.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonSix Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("6");
                    }
                }
        );

        buttonSeven.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonSeven Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("7");
                    }
                }
        );

        buttonEight.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonEight Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("8");
                    }
                }
        );

        buttonNine.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonNine Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("9");
                    }
                }
        );

        buttonDecimal.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonDecimal Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append(".");
                    }
                }
        );


        buttonDelete.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //ButtonOne Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.setText("");
                    }
                }
        );

        buttonPlus.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonPlus Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "+";
                    }
                }
        );
        buttonMinus.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonMinus Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "-";
                    }
                }
        );
        buttonMultiply.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonMultiply Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "*";
                    }
                }
        );
        buttonDivide.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttondivide Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "/";
                    }
                }
        );
        buttonPlusMinus.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonPlusMinus Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        output.append("-");
                    }
                }
        );
        buttonPower.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttonPower Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        temp1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "^";
                    }
                }
        );






        buttonEqual.setOnClickListener(
                //Interface
                new Button.OnClickListener()
                {
                    //buttondivide Method
                    public void onClick(View v){
                        TextView output = (TextView)findViewById(R.id.display);
                        temp2 = Double.parseDouble(output.getText().toString());
                        if (operator =="+"){
                            output.setText(Double.toString((temp1) + (temp2)));
                        }
                        else if (operator == "-"){
                            output.setText(Double.toString((temp1) - (temp2)));
                        }
                        else if(operator == "*"){
                            output.setText(Double.toString((temp1) * (temp2)));

                        }
                        else if(operator == "/"){
                            if(temp2 == 0){
                                output.setText("Divsion Error");
                            }
                            else{
                                output.setText(Double.toString((temp1) / (temp2)));
                            }
                        }
                        if (operator =="^"){
                            output.setText(Double.toString(Math.pow((temp1),(temp2))));
                        }
                        operator = "=";
                    }
                }
        );
    }


}
