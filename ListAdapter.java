package com.example.pritam.label;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by pritam on 18/2/17.
 */

public class ListAdapter extends ArrayAdapter<String> {
    // View lookup cache
    private ArrayList<String> dataSet;
    Context mContext;
    private static class ViewHolder {
        TextView txtLabel;
    }

    public ListAdapter(ArrayList<String> data, Context context) {
        super(context, R.layout.listviewcontent, data);
        this.dataSet = data;
        this.mContext=context;

    }
    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public String getItem(int pos) {
        return dataSet.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        String dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.listviewcontent, parent, false);
            viewHolder.txtLabel = (TextView) convertView.findViewById(R.id.label);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }
        viewHolder.txtLabel.setText(dataModel);
        return convertView;
    }
}
