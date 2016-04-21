package com.sprinter.ronin.fizzbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_submit = (Button)findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final EditText text_input = (EditText)findViewById(R.id.text_input);
        final TextView text_result = (TextView)findViewById(R.id.text_result);

        FizzBuzz fizzbuzz = new FizzBuzz();

        try {
            String data_text_input = text_input.getText().toString();
            String answer;
            if(data_text_input.matches("-?\\d+(.\\d+)?")) {
                Long input_number = Long.parseLong(data_text_input);
                answer = fizzbuzz.show(input_number);
            }else {
                answer = "กรุณากรอกตัวเลขด้วยเด้อ!";
            }
            text_result.setText(answer);
        }catch (NumberFormatException errors){
            text_result.setText("กรอกแต่พองามนะ!");
        }
    }
}