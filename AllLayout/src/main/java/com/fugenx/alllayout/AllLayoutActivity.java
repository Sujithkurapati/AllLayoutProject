package com.fugenx.alllayout;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class AllLayoutActivity extends ListActivity {

    static final String[] layout = new String[] {"LinearLayoutVertical","LinearLayoutHorizontal","RelativeLayout",
            "FrameLayout","TableLayout","AbsoluteLayout","GridLayout","GridView","WebView","Grid1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_all);
        setListAdapter(new ListArrayAdapter(this, layout));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        //get selected items
        String selectedValue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

        if(position == 0){
            Intent intent0 = new Intent(getApplicationContext(),LinearVertical.class);
            startActivity(intent0);
        }
        if(position == 1){
            Intent intent1 = new Intent(getApplicationContext(),LinearHorizontal.class);
            startActivity(intent1);
        }
        if (position == 2){
            Intent intent2 = new Intent(getApplicationContext(),RelativeActivity.class);
            startActivity(intent2);
        }
        if(position == 3){
            Intent intent3 = new Intent(getApplicationContext(),FrameActivity.class);
            startActivity(intent3);
        }
        if(position == 4){
            Intent intent4 = new Intent(getApplicationContext(),TableActivity.class);
            startActivity(intent4);
        }
        if (position == 5){
            Intent intent5 = new Intent(getApplicationContext(),AbsoluteActivity.class);
            startActivity(intent5);
        }
        if (position == 6){
            Intent intent6 = new Intent(getApplicationContext(),GridActivity.class);
            startActivity(intent6);
        }
        if (position == 7){
            Intent intent7 = new Intent(getApplicationContext(),GridViewActivity.class);
            startActivity(intent7);
        }
        if (position == 8){
            Intent intent8 = new Intent(getApplicationContext(),WebViewActivity.class);
            startActivity(intent8);
        }
        if (position == 9){
            Intent intent9 = new Intent(getApplicationContext(),Grid1.class);
            startActivity(intent9);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.all_layout, menu);
        return true;
    }
    
}
