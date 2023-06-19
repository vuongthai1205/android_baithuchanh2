package com.tgv.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BT2Activity extends AppCompatActivity {
    private Button btnCong, btnTru, btnChia, btnNhan;
    private EditText inputA , inputB;
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt2);

        handleApp();
    }

    public void handleApp(){
        btnCong = (Button) findViewById(R.id.btnCong);
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputA = (EditText) findViewById(R.id.inputA);
                inputB = (EditText) findViewById(R.id.inputB);
                txtResult = (TextView) findViewById(R.id.txtResult);

                if (TextUtils.isEmpty(inputA.getText().toString()) || TextUtils.isEmpty(inputB.getText().toString()) ){
                    txtResult.setText("Please check your input!");
                }
                else {
                    float a = Float.parseFloat(inputA.getText().toString());
                    float b = Float.parseFloat(inputB.getText().toString());
                    float kq = a + b;
                    String result = "A + B = " + kq;

                    txtResult.setText(result);
                }

            }
        });
        btnTru = (Button) findViewById(R.id.btnTru);
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputA = (EditText) findViewById(R.id.inputA);
                inputB = (EditText) findViewById(R.id.inputB);
                txtResult = (TextView) findViewById(R.id.txtResult);

                if (TextUtils.isEmpty(inputA.getText().toString()) || TextUtils.isEmpty(inputB.getText().toString()) ){
                    txtResult.setText("Please check your input!");
                }
                else {
                    float a = Float.parseFloat(inputA.getText().toString());
                    float b = Float.parseFloat(inputB.getText().toString());
                    float kq = a - b;
                    String result = "A - B = " + kq;
                    txtResult.setText(result);
                }

            }
        });
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputA = (EditText) findViewById(R.id.inputA);
                inputB = (EditText) findViewById(R.id.inputB);
                txtResult = (TextView) findViewById(R.id.txtResult);
                if (TextUtils.isEmpty(inputA.getText().toString()) || TextUtils.isEmpty(inputB.getText().toString())){
                    txtResult.setText("Please check your input");
                }
                else{
                    float a = Float.parseFloat(inputA.getText().toString());
                    float b = Float.parseFloat(inputB.getText().toString());

                    float kq = a * b;

                    String result = "A * B = " + kq;

                    txtResult.setText(result);
                }
            }
        });
        btnChia = (Button) findViewById(R.id.btnChia);
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputA = (EditText) findViewById(R.id.inputA);
                inputB = (EditText) findViewById(R.id.inputB);
                txtResult = (TextView) findViewById(R.id.txtResult);
                if (TextUtils.isEmpty(inputA.getText().toString()) || TextUtils.isEmpty(inputB.getText().toString())){
                    txtResult.setText("Please check your input");
                }
                else{
                    float a = Float.parseFloat(inputA.getText().toString());
                    float b = Float.parseFloat(inputB.getText().toString());

                    float kq = a / b;

                    String result = "A * B = " + kq;

                    txtResult.setText(result);
                }
            }
        });
    }
}