package com.example.sushastho;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BookAppoinmentActivity extends AppCompatActivity {

    EditText editTextFullname, editTextAddress, editTextFees, editTextContactNum;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book_appoinment);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView = findViewById(R.id.textViewAppTitle);
        editTextFullname = findViewById(R.id.editTextFullname);
        editTextAddress = findViewById(R.id.editTextAdress);
        editTextContactNum = findViewById(R.id.editTextNumber);
        editTextFees = findViewById(R.id.editTextFees);

        editTextFullname.setKeyListener(null);
        editTextAddress.setKeyListener(null);
        editTextContactNum.setKeyListener(null);
        editTextFees.setKeyListener(null);

        Intent intent = new Intent();
        String title = intent.getStringExtra("text1");
        String fullName = intent.getStringExtra("text2");
        String address = intent.getStringExtra("text3");
        String contactNum = intent.getStringExtra("text4");
        String fees = intent.getStringExtra("text5");

        textView.setText(title);
        editTextFullname.setText(fullName);
        editTextAddress.setText(address);
        editTextContactNum.setText(contactNum);
        editTextFees.setText("Cons Fees: "+fees+" BDT");
    }
}