package com.example.nethuyahampath.nakathapp;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.LayoutInflater;

import android.view.View;

import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MoonActivity extends AppCompatActivity {


    private noteAdapter adapter;
    private ArrayList<Note> myList = new ArrayList();

    TextView moonBasic, moonDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon);


        moonBasic = (TextView) findViewById(R.id.txtMoonBasic);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/suanaraga.ttf");
        moonBasic.setTypeface(customFont);

        moonDescription = (TextView) findViewById(R.id.txtMoonBasic2);
        Typeface customFont2 = Typeface.createFromAsset(getAssets(), "fonts/suanaraga.ttf");
        moonDescription.setTypeface(customFont2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        adapter = new noteAdapter(this, myList);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                //Intent main = new Intent(MoonActivity.this,)
                inputNote();

            }
        });
    }

    protected void inputNote() {
        LayoutInflater layoutInflater = LayoutInflater.from(MoonActivity.this);
        View promptView = layoutInflater.inflate(R.layout.inputnote, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MoonActivity.this);
        alertDialogBuilder.setView(promptView);

        final EditText note = (EditText) promptView.findViewById(R.id.txtNote);
       final TextView topic = (TextView)promptView.findViewById(R.id.txtTopicNote);

         topic.setText("kj i| ne,Su");

        final Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/suanaraga.ttf");
        topic.setTypeface(customFont);


        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Add Note", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


                        String inputNoteMy = note.getText().toString().trim();

                              if (!inputNoteMy.isEmpty()) {

                           Toast.makeText(getApplicationContext(),"Note Added",Toast.LENGTH_LONG).show();

                        LayoutInflater layoutInflater = LayoutInflater.from(MoonActivity.this);
                        View promptView = layoutInflater.inflate(R.layout.activity_note_list, null);
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MoonActivity.this);
                        alertDialogBuilder.setView(promptView);
                        AlertDialog alert = alertDialogBuilder.create();

                        final ListView list = (ListView) promptView.findViewById(R.id.listV);
                        final Note note = new Note();

                            //note.setTopic(topic_layout);


                        note.setNote(inputNoteMy);


                        myList.add(note);
                        note.setTopic("Viewing The Old Moon");
                        list.setAdapter(adapter);

                        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                            @Override
                            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                                myList.remove(position);
                                adapter.notifyDataSetChanged();
                                Snackbar.make(view, "Note Deleted!!", Snackbar.LENGTH_LONG).show();
                                return true;
                            }
                        });
/*
                        Note note = new Note();
                        Log.d("NOTENOTENOTE", inputNoteMy);
                        note.setNote(inputNoteMy);
                        note.setTopic("jdfsdhjk");
                        myList.add(note);
                        list.setAdapter(adapter);*/

                        alert.show();

                        } else {
                            //note.setError("please Enter a Note");
                            note.setError("please Enter a Note");
                            Toast.makeText(getApplicationContext(), "Enter a Valid Note", Toast.LENGTH_LONG).show();
                        }
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }


}
