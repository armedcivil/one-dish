package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.AdapterView;

public class OrderGenreListFragment extends ListFragment {

    OrderActivity order;

    public static OrderGenreListFragment newInstance(String param1, String param2) {
            OrderGenreListFragment fragment = new OrderGenreListFragment();
            Bundle args = new Bundle();
        return fragment;
    }

    public OrderGenreListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState ){
        super.onActivityCreated( savedInstanceState );

        OrderGenreListAdapter adapter = new OrderGenreListAdapter( getActivity().getBaseContext() , R.layout.order_genre_list_item , 0 , null );

        setListAdapter( adapter );

        order = ( OrderActivity ) getActivity();

        getListView().setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch( position ){

                    case 0:

                        order.setFragment( OrderActivity.RECIPT , 0);
                        break;

                }
            }
        });

    }
//*
//*/
}
