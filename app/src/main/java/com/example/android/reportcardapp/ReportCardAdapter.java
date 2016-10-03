package com.example.android.reportcardapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//Custom adapter class the inherits features from the ReportCard class
public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    //ReportCardAdapter class constructor
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> report) {
        super(context, 0, report);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ReportCard currentReportCard = getItem(position);

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentReportCard.getImageResourceId());

        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.subject_name);
        subjectTextView.setText(currentReportCard.getSubjectName());

        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.assigned_grade);
        gradeTextView.setText(currentReportCard.getAssignedGrade());


        return listItemView;
    }


}