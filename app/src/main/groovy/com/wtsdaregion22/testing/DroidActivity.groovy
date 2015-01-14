package com.wtsdaregion22.testing;

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import groovy.transform.CompileStatic

import static android.view.View.GONE
import static android.view.View.VISIBLE

@CompileStatic
public class DroidActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        String messageText = "Hello Groovy! Is this thing on?"
        TextView message = (TextView) findViewById(R.id.message)
        message.setText(messageText)
    }

}