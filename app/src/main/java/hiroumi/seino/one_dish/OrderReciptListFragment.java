package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class OrderReciptListFragment extends Fragment {

    public OrderReciptListFragment() {
    }

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup group , Bundle savedInstanceState ){

        View view =  inflater.inflate( R.layout.fragment_order_recipt_grid , null );
        GridView grid = ( GridView ) view.findViewById( R.id.order_recipt_grid );
        OrderReciptListAdapter adapter = new OrderReciptListAdapter( getActivity().getBaseContext() , R.layout.order_recipt_grid_item , 0 , null );
        grid.setAdapter( adapter );

        return view;
    }

    @Override
    public void onViewCreated( View view , Bundle savedInstanceState ){
        super.onViewCreated( view , savedInstanceState );


    }

}
