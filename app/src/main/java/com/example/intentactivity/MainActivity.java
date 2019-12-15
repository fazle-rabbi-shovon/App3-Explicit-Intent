package com.example.intentactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etText;
    Button btnAct2 , btnAct3;
    TextView txResult;
    final int ACTIVITY3 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        btnAct2 = findViewById(R.id.btnAct2);
        btnAct3 = findViewById(R.id.btnAct3);
        txResult = findViewById(R.id.txResult);

        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "PLease input all fields!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = etText.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this,
                            com.example.intentactivity.Activity2.class);
                    intent.putExtra("name",name);

                    startActivity(intent);

                }

            }
        });

        btnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,com.example.intentactivity.Activity3.class);
                startActivityForResult(intent, ACTIVITY3);


            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==ACTIVITY3){
            if(resultCode==RESULT_OK){
                txResult.setText(data.getStringExtra("surname"));
                etText.setVisibility(View.GONE);
            }
            if(resultCode==RESULT_CANCELED){
                txResult.setText("No value back");
            }

        }
    }
}
