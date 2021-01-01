package com.example.android.oop_udacitty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Scroll extends AppCompatActivity {
    public int viewNo = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll);
    }

    public void f(View view) {
//        LinearLayout rv = (LinearLayout) findViewById(R.id.parent);
//        TextView addendum = new TextView(this);
//        addendum.setText("View no: " + (++viewNo));
//        rv.addView(addendum);
//        Toast t =  new Toast(this);
//        t.setText("View no: " + (++viewNo));
//        t.setDuration(Toast.LENGTH_LONG);
//        t.show();
//        ((TextView)findViewById(R.id.leader)).setText("View no: " + (++viewNo));
//        ((TextView)findViewById(R.id.leader)).setText("View no + (++viewNo)");
        Log.d("capyuring text", "Message captured: " + "before");
        TextView input = (TextView) findViewById(R.id.input_text);
        String message =  input.getText().toString();
        ((TextView) findViewById(R.id.entered_text)).setText(message);
        Log.d("capyuring text", "Message captured: " + message);
    }
}