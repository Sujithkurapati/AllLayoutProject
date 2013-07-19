package com.fugenx.alllayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

/**
 * Created by admin on 7/8/13.
 */
public class GridViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        GridView gridView = (GridView)findViewById(R.id.gridview);

        gridView.setAdapter(new ImageAdapter(this));
        System.out.println();
    }
}
