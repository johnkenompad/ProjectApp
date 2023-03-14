package com.example.myprojectfinal;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView resultTextView;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonDecimal, buttonEquals, buttonClear;

    private String currentNumber = "";
    private String currentOperator = "";
    private double firstNumber = 0;
    private double secondNumber = 0;
    private double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultTextView = findViewById(R.id.resultTextView);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonDecimal = findViewById(R.id.buttonDecimal);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonClear = findViewById(R.id.buttonClear);


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonClear.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                currentNumber += "0";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button1:
                currentNumber += "1";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button2:
                currentNumber += "2";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button3:
                currentNumber += "3";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button4:
                currentNumber += "4";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button5:
                currentNumber += "5";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button6:
                currentNumber += "6";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button7:
                currentNumber += "7";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button8:
                currentNumber += "8";
                resultTextView.setText(currentNumber);
                break;

            case R.id.button9:
                currentNumber += "9";
                resultTextView.setText(currentNumber);
                break;

            case R.id.buttonAdd:
                if (!currentNumber.equals("")) {
                    firstNumber = Double.parseDouble(currentNumber);
                    currentOperator = "+";
                    currentNumber = "";
                    resultTextView.setText("+");
                }
                break;

            case R.id.buttonSubtract:
                if (!currentNumber.equals("")) {
                    firstNumber = Double.parseDouble(currentNumber);
                    currentOperator = "-";
                    currentNumber = "";
                    resultTextView.setText("-");
                }
                break;

            case R.id.buttonMultiply:
                if (!currentNumber.equals("")) {
                    firstNumber = Double.parseDouble(currentNumber);
                    currentOperator = "*";
                    currentNumber = "";
                    resultTextView.setText("*");
                }
                break;

            case R.id.buttonDivide:
                if (!currentNumber.equals("")) {
                    firstNumber = Double.parseDouble(currentNumber);
                    currentOperator = "/";
                    currentNumber = "";
                    resultTextView.setText("/");
                }
                break;

            case R.id.buttonDecimal:
                if (!currentNumber.contains(".")) {
                    currentNumber += ".";
                    resultTextView.setText(currentNumber);
                }
                break;

            case R.id.buttonEquals:
                if (!currentNumber.equals("")) {
                    secondNumber = Double.parseDouble(currentNumber);

                    switch (currentOperator) {
                        case "+":
                            result = firstNumber + secondNumber;
                            break;

                        case "-":
                            result = firstNumber - secondNumber;
                            break;

                        case "*":
                            result = firstNumber * secondNumber;
                            break;

                        case "/":
                            result = firstNumber / secondNumber;
                            break;
                    }

                    currentNumber = Double.toString(result);
                    resultTextView.setText(currentNumber);
                    break;

                }
            case R.id.buttonClear:
                currentNumber = "";
                currentOperator = "";
                firstNumber = 0;
                secondNumber = 0;
                result = 0;
                resultTextView.setText("");
                break;

        }
    }
        }

