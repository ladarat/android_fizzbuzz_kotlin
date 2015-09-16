package com.sprinter.ronin.fizzbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_submmit = (Button)findViewById(R.id.btn_submit);
        btn_submmit.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        final EditText text_input = (EditText)findViewById(R.id.text_input);
        final TextView text_result = (TextView)findViewById(R.id.text_result);

        FizzBuzz fizzbuzz = new FizzBuzz();

        try {
            String data_text_input = text_input.getText().toString();
            int input_number = Integer.parseInt(data_text_input);
            String anwser = fizzbuzz.show(input_number);
            text_result.setText(anwser);
        }catch (NumberFormatException errors){
            text_result.setText("กรุณากรอกตัวเลขด้วยเด้อ!");
        }
    }
}