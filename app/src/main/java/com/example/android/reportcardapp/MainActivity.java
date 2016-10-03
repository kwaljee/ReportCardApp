package com.example.android.reportcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign values within an array list
        ArrayList<ReportCard> report = new ArrayList<ReportCard>();
        report.add(new ReportCard("Biology", "A", R.drawable.biology));
        report.add(new ReportCard("Computer Science", "B", R.drawable.compsci));
        report.add(new ReportCard("English", "B-", R.drawable.english));
        report.add(new ReportCard("Geography", "C", R.drawable.geography));
        report.add(new ReportCard("Mathematics", "C+", R.drawable.math));

        //Create an object for a custom Report Card Adapter
        ReportCardAdapter adapter = new ReportCardAdapter(this, report);

        //Create an object for a list view, and assign the custom adapter to the view
        ListView listView = (ListView) findViewById(R.id.listview_reportcard);
        listView.setAdapter(adapter);

        //Display a toast message to the user when an item on the list view is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
