package hiroumi.seino.one_dish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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

            convertView = inflater.inflate( R.layout.order_recipt_grid_item , null );

        }

        ImageView image = ( ImageView ) convertView.findViewById( R.id.order_recipt_grid_item_image );
        View view = convertView.findViewById(R.id.order_recipt_grid_item_text_layout);
        TextView title = ( TextView ) view.findViewById( R.id.order_recipt_grid_item_text_title );
        View inner = view.findViewById( R.id.order_recipt_grid_item_text_inner );
        TextView price = ( TextView ) inner.findViewById( R.id.order_recipt_grid_item_text_price);
        TextView cal = ( TextView ) inner.findViewById( R.id.order_recipt_grid_item_text_cal );

        switch( position ){
            case 0:
                image.setImageResource( R.drawable.taihuuyakitori );
                title.setText( "タイ風焼き鳥" );
                price.setText( "400円" );
                cal.setText( "367kcal" );
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }

        return convertView;
    }

}