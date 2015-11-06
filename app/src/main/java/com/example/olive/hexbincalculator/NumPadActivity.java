package com.example.olive.hexbincalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class NumPadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_pad);
        Button btn_binary_mode = (Button) findViewById(R.id.btn_binary_mode);

        btn_binary_mode.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                setBinaryButtons();
                return true;
            }
        });
        setEditText();
    }

    private void setEditText(){
        EditText displayOperations = (EditText) findViewById(R.id.txt_operations);
        displayOperations.setInputType(InputType.TYPE_NULL);
        displayOperations.setBackground(null);
    }


    private void setBinaryButtons(){

        /************** Set letters buttons **********/

        Button btn_a = (Button) findViewById(R.id.btn_a);
        Button btn_b = (Button) findViewById(R.id.btn_b);
        Button btn_c = (Button) findViewById(R.id.btn_c);
        Button btn_d = (Button) findViewById(R.id.btn_d);
        Button btn_e = (Button) findViewById(R.id.btn_e);
        Button btn_f = (Button) findViewById(R.id.btn_f);

        /************** Set numeric buttons except 0 and 1 **********/

        Button btn_two = (Button) findViewById(R.id.btn_two);
        Button btn_three = (Button) findViewById(R.id.btn_three);
        Button btn_four = (Button) findViewById(R.id.btn_four);
        Button btn_five = (Button) findViewById(R.id.btn_five);
        Button btn_six = (Button) findViewById(R.id.btn_six);
        Button btn_seven = (Button) findViewById(R.id.btn_seven);
        Button btn_eight = (Button) findViewById(R.id.btn_eight);
        Button btn_nine = (Button) findViewById(R.id.btn_nine);

        btn_a.setEnabled(false);
        btn_b.setEnabled(false);
        btn_c.setEnabled(false);
        btn_d.setEnabled(false);
        btn_e.setEnabled(false);
        btn_f.setEnabled(false);
        btn_two.setEnabled(false);
        btn_three.setEnabled(false);
        btn_four.setEnabled(false);
        btn_five.setEnabled(false);
        btn_six.setEnabled(false);
        btn_seven.setEnabled(false);
        btn_eight.setEnabled(false);
        btn_nine.setEnabled(false);
    }
}
