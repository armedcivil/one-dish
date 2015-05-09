package hiroumi.seino.one_dish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class OrderReciptListAdapter extends ArrayAdapter {
    private static final String TAG = OrderReciptListAdapter.class.getSimpleName();
    LayoutInflater inflater;

    public OrderReciptListAdapter( Context context , int res , int id , List object){
        super( context , res , id , object );

        inflater = ( LayoutInflater ) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );

    }

    @Override
    public int getCount(){
        return 6;
    }

    @Override
    public View getView( int position , View convertView , ViewGroup group ){

        if( convertView == null ){



        }

        return convertView;
    }

}