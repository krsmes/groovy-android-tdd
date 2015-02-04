package com.wtsdaregion22.testing;

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
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

        TextView message = (TextView) findViewById(R.id.message)
        message.setText(R.string.hello_world_groovy)
    }

    public void onSpiffyButtonClick(View view)
    {
        TextView message = (TextView) findViewById(R.id.message)
        message.setText("SpiffyButton is spiffy!")
    }
}