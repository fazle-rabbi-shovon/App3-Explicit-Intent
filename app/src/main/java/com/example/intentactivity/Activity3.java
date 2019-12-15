package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    EditText edText;
    Button btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        edText = findViewById(R.id.edText);
        btnSub = findViewById(R.id.btnSub);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edText.getText().toString().isEmpty()){
                    Toast.makeText(Activity3.this, "Please fill up all fields!", Toast.LENGTH_SHORT).show();
                }
                else{
                    String name = edText.getText().toString().trim();
                    Intent intent = new Intent();
                    intent.putExtra("surname",name);
                    setResult(RESULT_OK,intent);
                    Activity3.this.finish();

                }




            }
        });
    }
}
