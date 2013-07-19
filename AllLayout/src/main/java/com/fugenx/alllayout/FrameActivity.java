package com.fugenx.alllayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by admin on 7/5/13.
 */
public class FrameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);
        Toast.makeText(getApplicationContext(), "Frame Activity", 200).show();
    }
}
