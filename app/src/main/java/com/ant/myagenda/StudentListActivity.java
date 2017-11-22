package com.ant.myagenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        String[] students = {"Marcos", "John", "Peter", "Alfred", "Melinda", "Sonia", "Marc", "Paul", "Lana", "Caleb", "Diana"};
        ListView studentsList = (ListView) findViewById(R.id.students_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students);
        studentsList.setAdapter(adapter);

        Button newStudent = (Button) findViewById(R.id.students_add);
        newStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGotoForm = new Intent(StudentListActivity.this, FormActivity.class);
                startActivity(intentGotoForm);
            }
        });
    }
}
