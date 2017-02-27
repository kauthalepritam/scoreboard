package com.example.pritam.label;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by pritam on 18/2/17.
 */

public class SecondPage extends Activity {

    TextView textView,textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);
        textView=(TextView)findViewById(R.id.Label1);
        textView1=(TextView)findViewById(R.id.Number);
        Bundle bundle = getIntent().getExtras();
        String aar[]=bundle.getStringArray("label");
        String num[]=bundle.getStringArray("Number");
        for (int i=0;i<aar.length;i++)
        {
            textView.setText(aar[i]);
            Toast.makeText(this,aar[i],Toast.LENGTH_LONG).show();
        }
        for (int i=0;i<num.length;i++)
        {
            textView1.setText(num[i]);
            Toast.makeText(this,num[i],Toast.LENGTH_LONG).show();
        }

    }
}
