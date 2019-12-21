package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b;
    String getName,getRoll,getAdmn,getCollege;
    StudentModel studentmodel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentmodel=new StudentModel();


        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.roll);
        e3=(EditText)findViewById(R.id.ad);
        e4=(EditText)findViewById(R.id.college);
        b=(Button)findViewById(R.id.btn);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getName=e1.getText().toString().trim();
                getRoll=e2.getText().toString().trim();
                getAdmn=e3.getText().toString().trim();
                getCollege=e4.getText().toString().trim();


                studentmodel.setName(getName);
                studentmodel.setRollno(getRoll);
                studentmodel.setAdmno(getAdmn);
                studentmodel.setCollege(getCollege);


                String getname=studentmodel.getName();
                String getroll=studentmodel.getRollno();
                String getadmn=studentmodel.getAdmno();
                String getcollege=studentmodel.getCollege();

                Toast.makeText(getApplicationContext(),getname,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getroll,Toast.LENGTH_LONG).show();


            }
        });
    }
}
