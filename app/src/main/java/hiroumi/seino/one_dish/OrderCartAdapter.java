package hiroumi.seino.one_dish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class OrderCartAdapter extends ArrayAdapter {
    private static final String TAG = OrderCartAdapter.class.getSimpleName();
    LayoutInflater inflater;

    public OrderCartAdapter( Context context, int resource, int textViewResourceId, List objects ){
        super( context , resource , textViewResourceId , objects );

        inflater = ( LayoutInflater ) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );

    }

    @Override
    public int getCount(){


        return super.getCount() + 1;
    }

    @Override
    public View getView( int position , View view , ViewGroup group ){

        if( view == null ){

            view = inflater.inflate( R.layout.order_cart_list_item , null );

        }



        return view;
    }

}