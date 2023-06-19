package com.tgv.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BT1Activity extends AppCompatActivity {
    private Button btnHello, btnChao, btnClear;
    private EditText txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenOnButton();

    }

    public void addListenOnButton() {
        btnClear = (Button) findViewById(R.id.btnClearText);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName = (EditText) findViewById(R.id.txtName);
                txtName.setText("");
            }
        });
        btnChao = (Button) findViewById(R.id.btnChao);
        btnChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName = (EditText) findViewById(R.id.txtName);
                String result = "Chào " + txtName.getText();

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
        btnHello = (Button) findViewById(R.id.btnHello);
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName = (EditText) findViewById(R.id.txtName);
                String result = "Hello " + txtName.getText().toString();
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
    }
}