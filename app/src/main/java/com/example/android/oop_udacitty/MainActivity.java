package com.example.android.oop_udacitty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll);
        Log.d("MainActivity.java", "Scroll inflated");
    }

    public void f(View view) {
//        TextView elder = (TextView) findViewById(R.id.loomba);
//        elder.setTextSize(64);
//        TextView tv = new TextView(this);
//        Log.wtf("EnterpriseActivity.java", "Captain's Log, Stardate 43125.8. We have entered a spectacular binary star system in the Kavis Alpha sector on a most critical mission of astrophysical research.");
//        if(((CheckBox) findViewById(R.id.checkbox)).isChecked())
////            ((TextView)findViewById(R.id.textv)).setText("Clicked");
//        {
//            CheckBox cb = (CheckBox) findViewById(R.id.radio_option);
//////            if(cb.isChecked()) {
//            TextView tv = (TextView) findViewById(R.id.textv);
//            tv.setText(cb);
////            }
//        }

//        Log.d("capyuring text", "Message captured: " + "before");
//        EditText input = (EditText) findViewById(R.id.input_text);
//        String message = input.getText().toString();
//        ((TextView) findViewById(R.id.entered_text)).setText(message);
//        Log.d("capyuring text", "Message captured: " + message);

//        Intent it = new Intent(Intent.ACTION_DIAL);
        Intent it = new Intent();
//        it.setAction(Intent.ACTION_CAMERA_BUTTON);
        it.setAction(Intent.ACTION_DIAL);
        it.setData(Uri.parse("tel:1234567890"));
//        it.setData(Uri.parse("tel:47.6, -122.3"));
        if (it.resolveActivity(getPackageManager()) != null)
            startActivity(it);
    }
}