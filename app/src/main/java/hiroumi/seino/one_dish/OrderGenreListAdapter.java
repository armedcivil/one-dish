package hiroumi.seino.one_dish;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderGenreListAdapter extends ArrayAdapter {

    private LayoutInflater inflater;

    public OrderGenreListAdapter(Context context) {
        super(context, android.R.layout.simple_list_item_1);
        inflater = (LayoutInflater) context.getSystemService( Activity.LAYOUT_INFLATER_SERVICE );
    }

//    @Override
//    public int getCount(  ){
//
//        return 5;
//    }
///*
    @Override
    public View getView( int position , View convert , ViewGroup group ){
        if( convert == null ){
            convert = inflater.inflate( R.layout.order_genre_list_item, null );
        }

        TextView text = ( TextView ) convert.findViewById( R.id.order_genre_list_item_inner_text );
        ImageView image = ( ImageView ) convert.findViewById( R.id.order_genre_list_item_inner_image );

        switch( position ){
            case 0:
                text.setText( "お肉" );
                image.setImageResource( R.drawable.ic_bone_72 );
                break;

            case 1:
                text.setText( "お魚" );
                image.setImageResource( R.drawable.ic_fish_72 );
                break;

            case 2:
                text.setText( "野菜" );
                image.setImageResource( R.drawable.ic_carrot_72 );
                break;

            case 3:
                text.setText( "たまご" );
                image.setImageResource( R.drawable.ic_egg_72 );
                break;

            case 4:
                text.setText( "汁物・スープ" );
                image.setImageResource( R.drawable.ic_jpy_72 );
                break;
        }
        return convert;
    }
//*/
}