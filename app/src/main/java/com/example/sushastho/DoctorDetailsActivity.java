package com.example.sushastho;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor name: Dr. Jude Bellinghum", "Hospital address: 123 Main St, Anytown, USA", "Mobile number: 912-345-6789", "Time: 10:00 AM - 5:00 PM", "Fees: $50"},
                    {"Doctor name: Dr. Herry Kane", "Hospital address: 456 Elm St, Anytown, USA", "Mobile number: 987-654-3210", "Time: 9:00 AM - 6:00 PM", "Fees: $75"},
                    {"Doctor name: Dr. Jack Sparrow", "Hospital address: 789 Oak St, Anytown, USA", "Mobile number: 555-555-5555", "Time: 8:00 AM - 7:00 PM", "Fees: $100"},
                    {"Doctor name: Dr. Grealish", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $125"},
                    {"Doctor name: Dr. Alexander isak", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $"}
            };

    private String[][] doctor_details2 =
            {
                    {"Doctor name: Dr. Jude Bellinghum", "Hospital address: 123 Main St, Anytown, USA", "Mobile number: 912-345-6789", "Time: 10:00 AM - 5:00 PM", "Fees: $50"},
                    {"Doctor name: Dr. Herry Kane", "Hospital address: 456 Elm St, Anytown, USA", "Mobile number: 987-654-3210", "Time: 9:00 AM - 6:00 PM", "Fees: $75"},
                    {"Doctor name: Dr. Jack Sparrow", "Hospital address: 789 Oak St, Anytown, USA", "Mobile number: 555-555-5555", "Time: 8:00 AM - 7:00 PM", "Fees: $100"},
                    {"Doctor name: Dr. Grealish", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $125"},
                    {"Doctor name: Dr. Alexander isak", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $"}
            };

    private String[][] doctor_details3 =
            {
                    {"Doctor name: Dr. Jude Bellinghum", "Hospital address: 123 Main St, Anytown, USA", "Mobile number: 912-345-6789", "Time: 10:00 AM - 5:00 PM", "Fees: $50"},
                    {"Doctor name: Dr. Herry Kane", "Hospital address: 456 Elm St, Anytown, USA", "Mobile number: 987-654-3210", "Time: 9:00 AM - 6:00 PM", "Fees: $75"},
                    {"Doctor name: Dr. Jack Sparrow", "Hospital address: 789 Oak St, Anytown, USA", "Mobile number: 555-555-5555", "Time: 8:00 AM - 7:00 PM", "Fees: $100"},
                    {"Doctor name: Dr. Grealish", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $125"},
                    {"Doctor name: Dr. Alexander isak", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $"}
            };

    private String[][] doctor_details4 =
            {
                    {"Doctor name: Dr. Jude Bellinghum", "Hospital address: 123 Main St, Anytown, USA", "Mobile number: 912-345-6789", "Time: 10:00 AM - 5:00 PM", "Fees: $50"},
                    {"Doctor name: Dr. Herry Kane", "Hospital address: 456 Elm St, Anytown, USA", "Mobile number: 987-654-3210", "Time: 9:00 AM - 6:00 PM", "Fees: $75"},
                    {"Doctor name: Dr. Jack Sparrow", "Hospital address: 789 Oak St, Anytown, USA", "Mobile number: 555-555-5555", "Time: 8:00 AM - 7:00 PM", "Fees: $100"},
                    {"Doctor name: Dr. Grealish", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $125"},
                    {"Doctor name: Dr. Alexander isak", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $"}
            };

    private String[][] doctor_details5 =
            {
                    {"Doctor name: Dr. Jude Bellinghum", "Hospital address: 123 Main St, Anytown, USA", "Mobile number: 912-345-6789", "Time: 10:00 AM - 5:00 PM", "Fees: $50"},
                    {"Doctor name: Dr. Herry Kane", "Hospital address: 456 Elm St, Anytown, USA", "Mobile number: 987-654-3210", "Time: 9:00 AM - 6:00 PM", "Fees: $75"},
                    {"Doctor name: Dr. Jack Sparrow", "Hospital address: 789 Oak St, Anytown, USA", "Mobile number: 555-555-5555", "Time: 8:00 AM - 7:00 PM", "Fees: $100"},
                    {"Doctor name: Dr. Grealish", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $125"},
                    {"Doctor name: Dr. Alexander isak", "Hospital address: 234 Maple St, Anytown, USA", "Mobile number: 123-456-7890", "Time: 7:00 AM - 8:00 PM", "Fees: $"}
            };

    Button backButton, messageButton;
    TextView tv;
    String[][] doctor_details = {};
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setContentView(R.layout.activity_doctor_details);
        tv = findViewById(R.id.textViewDoctorDetailTitle);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Physician") == 0) {
            doctor_details = doctor_details1;
        }else if (title.compareTo("Dentist") == 0) {
            doctor_details = doctor_details2;
        } else if (title.compareTo("Surgeon") == 0) {
            doctor_details = doctor_details3;
        } else if (title.compareTo("Cardiologist") == 0) {
            doctor_details = doctor_details4;
        } else {
            doctor_details = doctor_details5;
        }

        list = new ArrayList();
        for (String[] doctorDetail : doctor_details) {
            item = new HashMap<String, String>();
            item.put("line1", doctorDetail[0]);
            item.put("line2", doctorDetail[1]);
            item.put("line3", doctorDetail[2]);
            item.put("line4", "Cons Fees :" + doctorDetail[4] + "/-");
            list.add(item);
        }
        simpleAdapter = new SimpleAdapter(this, list,R.layout.multi_lines, new String[]{"line1", "line2", "line3", "line4", "line5"}, new int []{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e});
        ListView listView = findViewById(R.id.listViewDoctorDetail);
        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()  {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DoctorDetailsActivity.this, BookAppoinmentActivity.class);
                intent.putExtra("text1", title);
                intent.putExtra("text2", doctor_details[i][0]);
                intent.putExtra("text3", doctor_details[i][1]);
                intent.putExtra("text4", doctor_details[i][2]);
                intent.putExtra("text5", doctor_details[i][4]);
                startActivity(intent);
            }
        });
    }
}