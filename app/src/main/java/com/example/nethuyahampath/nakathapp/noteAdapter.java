package com.example.nethuyahampath.nakathapp;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;


public class noteAdapter extends ArrayAdapter<Note> {

    private Context mContext;
    private List<Note> noteList = new ArrayList<>();

    public noteAdapter(Context context, ArrayList<Note> list) {
        super(context, 0, list);
        mContext = context;
        noteList = list;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.notelayout, parent, false);

        Note currentContact = noteList.get(position);

        TextView topic = (TextView) listItem.findViewById(R.id.txtTopicName);
        topic.setText(currentContact.getTopic());


        TextView note = (TextView) listItem.findViewById(R.id.txtNote1);
        note.setText(currentContact.getNote());

        return listItem;
    }

    ;
}
