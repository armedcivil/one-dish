package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class OrderGenreListFragment extends ListFragment {

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
    }
//*
//*/
}
