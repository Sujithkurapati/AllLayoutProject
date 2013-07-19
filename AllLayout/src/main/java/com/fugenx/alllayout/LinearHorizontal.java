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
public class LinearHorizontal extends Activity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horizontallinear);

        editText = (EditText)findViewById(R.id.edittext1);
        textView = (TextView) findViewById(R.id.text1);
        Button button = (Button)findViewById(R.id.HorSubmit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=editText.getText().toString();
                textView.setText(s1);
            }
        });
    }

}
