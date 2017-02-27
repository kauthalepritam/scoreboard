package com.example.pritam.label;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {
/*
    EditText textIn;
    Button buttonAdd;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textIn = (EditText)findViewById(R.id.textin);
        buttonAdd = (Button)findViewById(R.id.add);
        container = (LinearLayout)findViewById(R.id.container);

        buttonAdd.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater =
                        (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.row, null);
                TextView textOut = (TextView)addView.findViewById(R.id.textout);
                textOut.setText(textIn.getText().toString());
                Button buttonRemove = (Button)addView.findViewById(R.id.remove);
                buttonRemove.setOnClickListener(new OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        ((LinearLayout)addView.getParent()).removeView(addView);
                    }});

                container.addView(addView);
            }});

    }

    public void Signin(View view)
    {
        String arr[]=new String[4];
        arr[0]="label 1";
        arr[1]="label 2";
        arr[2]="label 3";
        arr[3]="label 4";
        Toast.makeText(this,"in SEnd",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,SecondPage.class);
        intent.putExtra("label",arr);
        this.startActivity ( intent );
    }*/

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    private static ListAdapter adapter;
    private static ArrayList<String> planetList = new ArrayList<String>();
    private  Button addItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.labelcontent);
        addItem=(Button)findViewById(R.id.addLabel);
        /*addItem.setOnClickListener(this);*/
        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.listview);
        planetList.add("Label 1");
        planetList.add("Label 2");
        planetList.add("Label 3");
        adapter= new ListAdapter(planetList,getApplicationContext());
        mainListView.setAdapter(adapter);
    }
    public void Signin(View view)
    {
        String arr[]=new String[4];
        arr[0]="label 1";
        arr[1]="label 2";
        arr[2]="label 3";
        arr[3]="label 4";
        String num[]=new String[4];
        num[0]="4";
        num[1]="8";
        num[2]="5";
        num[3]="8";
        Toast.makeText(this,"in SEnd",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,SecondPage.class);
        intent.putExtra("label",arr);
        intent.putExtra("Number",num);
        this.startActivity ( intent );
    }
    public void AddElement(View view)
    {
        int count=planetList.size()+1;
        Log.d("Count=",count+"");
        planetList.add("Label "+count);
        adapter= new ListAdapter(planetList,getApplicationContext());
        mainListView.setAdapter(adapter);
    }

}