package com.fugenx.alllayout;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by admin on 7/5/13.
 */
public class FrameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);
        Toast.makeText(getApplicationcontext,"Frame Activity",200).show();
    }
}
