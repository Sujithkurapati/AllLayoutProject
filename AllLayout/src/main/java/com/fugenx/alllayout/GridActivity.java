package com.fugenx.alllayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by admin on 7/5/13.
 */
public class GridActivity extends Activity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);

        editText = (EditText)findViewById(R.id.edit1);
        textView = (TextView) findViewById(R.id.textview);
        Button button = (Button)findViewById(R.id.gridbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=editText.getText().toString();
                textView.setText(s1);
            }
        });

    }
}
