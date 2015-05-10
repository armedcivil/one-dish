package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class OrderReciptListFragment extends Fragment {

    OrderActivity order;

    public OrderReciptListFragment() {
    }

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup group , Bundle savedInstanceState ){

        View view =  inflater.inflate( R.layout.fragment_order_recipt_grid , null );
        GridView grid = ( GridView ) view.findViewById( R.id.order_recipt_grid );
        OrderReciptListAdapter adapter = new OrderReciptListAdapter( getActivity().getBaseContext() , R.layout.order_recipt_grid_item , 0 , null );
        grid.setAdapter( adapter );

        order = ( OrderActivity ) getActivity();

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:

                        order.setFragment(OrderActivity.DETAIL, 0);
                        break;

                }
            }
        });

        return view;
    }

    @Override
    public void onViewCreated( View view , Bundle savedInstanceState ){
        super.onViewCreated( view , savedInstanceState );
    }

}
