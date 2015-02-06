package com.mholtman.skeleton;

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import groovy.transform.CompileStatic

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

        Button revertButton = (Button) findViewById(R.id.revert_button)
        revertButton.setVisibility(View.VISIBLE)
    }
}