package com.sprinter.ronin.fizzbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FizzBuzz fizzbuzz = new FizzBuzz();

        Button btn_submmit = (Button) findViewById(R.id.btn_submit);
        final EditText text_input = (EditText) findViewById(R.id.text_input);
        final TextView text_result = (TextView) findViewById(R.id.text_result);

        View.OnClickListener oclBtnSubmit = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText(fizzbuzz.show(Integer.parseInt(text_input.getText().toString())));
            }
        };

        btn_submmit.setOnClickListener(oclBtnSubmit);

//        btn_submmit.setOnClickListener(
//                new Button.OnClickListener() {
//                    public void onClick(View v) {
//                        text_result.setText(fizzbuzz.show(Integer.parseInt(text_input.getText().toString())));
//                    }
//                }
//        );

        text_input.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    text_result.setText(fizzbuzz.show(Integer.parseInt(text_input.getText().toString())));
                    return true;
                }
                return false;
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}