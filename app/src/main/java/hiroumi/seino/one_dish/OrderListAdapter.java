package hiroumi.seino.one_dish;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.List;

public class OrderListAdapter extends ArrayAdapter {
    private static final String TAG = OrderListAdapter.class.getSimpleName();
    private LayoutInflater inflater;

    public OrderListAdapter(Context context, int resource, int textViewResourceId, List objects) {
        super(context, resource, textViewResourceId, objects);
        inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
    }
/*
    @Override
    public View getView( int position , View convert , ViewGroup group ){



    }
//*/
}