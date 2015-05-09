package hiroumi.seino.one_dish;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CookListAdapter extends ArrayAdapter {

    private LayoutInflater inflater;
    private String name = "ハンバーグ";
    private String cal = "20kCal.";

    public CookListAdapter(Context context) {
        super(context, android.R.layout.simple_list_item_1);
        inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_cook, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(name);
        holder.cal.setText(cal);

        holder.icon.setImageResource(R.drawable.ic_launcher);

        return convertView;
    }

    private class ViewHolder {
        TextView name;
        TextView cal;
        ImageView icon;

        public ViewHolder(View view) {
            this.name = (TextView) view.findViewById(R.id.name);
            this.cal = (TextView) view.findViewById(R.id.cal);
            this.icon = (ImageView) view.findViewById(R.id.icon);
        }
    }
}
