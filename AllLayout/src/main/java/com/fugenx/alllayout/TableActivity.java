package com.fugenx.alllayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by admin on 7/5/13.
 */
public class TableActivity extends Activity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);

        editText = (EditText)findViewById(R.id.TabEditText01);
        textView = (TextView) findViewById(R.id.TabtextView);
        Button button = (Button)findViewById(R.id.TabButton01);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=editText.getText().toString();
                textView.setText(s1);
            }
        });

        ((Button)findViewById(R.id.TabButton02)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AllLayoutActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("Exit me", true);
                startActivity(intent);
                finish();
            }
        });
    }
}
