package com.fugenx.alllayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by admin on 7/5/13.
 */
public class ListArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public ListArrayAdapter(Context context, String[] values) {
        super(context, R.layout.activity_all, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_all, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.textview);
        textView.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);
        return rowView;
    }
}
