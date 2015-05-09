package hiroumi.seino.one_dish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class OrderGenreListAdapter extends ArrayAdapter {
    private static final String TAG = OrderGenreListAdapter.class.getSimpleName();
    private LayoutInflater inflater;

    public OrderGenreListAdapter(Context context, int resource, int textViewResourceId, List objects) {
        super(context, resource, textViewResourceId, objects);
        inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
    }

    @Override
    public int getCount(  ){


        return 5;
    }
///*
    @Override
    public View getView( int position , View convert , ViewGroup group ){
        if( convert == null ){
            convert = inflater.inflate( R.layout.order_recipt_list_item, group );
        }

        View inner = convert.findViewById( R.id.order_genre_list_item_inner_layout );
        TextView text = ( TextView ) inner.findViewById( R.id.order_genre_list_item_inner_text );
        ImageView image = ( ImageView ) inner.findViewById( R.id.order_genre_list_item_inner_image );

        switch( position ){
            case 0:
                text.setText( "お肉" );
                image.setImageResource( R.drawable.ic_launcher );
                break;

            case 1:
                text.setText( "お魚" );
                image.setImageResource( R.drawable.ic_launcher );
                break;

            case 2:
                text.setText( "野菜" );
                image.setImageResource( R.drawable.ic_launcher );
                break;

            case 3:
                text.setText( "たまご" );
                image.setImageResource( R.drawable.ic_launcher );
                break;

            case 4:
                text.setText( "汁物・スープ" );
                image.setImageResource( R.drawable.ic_launcher );
                break;
        }

        return convert;
    }
//*/
}