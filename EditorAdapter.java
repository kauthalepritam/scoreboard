import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pritam.label.R;

import java.util.ArrayList;
import java.util.HashMap;

public class EditorAdapter extends BaseAdapter {

    Context context;
    ArrayList<HashMap<String, String>> data;

    public EditorAdapter(Context context, ArrayList<HashMap<String, String>> data) {

        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int pos) {
        return data.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.listviewcontent, null, false);
            holder.editPropertyValue = (EditText) convertView.findViewById(R.id.labelValue);
            holder.propertyName = (TextView) convertView.findViewById(R.id.label);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.propertyName.setText(data.get(position).get("name"));
        holder.editPropertyValue.setText(data.get(position).get("value"));

        convertView.setTag(holder);
        return convertView;
    }
}

    class ViewHolder {
        EditText editPropertyValue;
        TextView propertyName;
    }
