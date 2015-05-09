package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class OrderGenreListFragment extends Fragment {

    public static OrderGenreListFragment newInstance(String param1, String param2) {
        OrderGenreListFragment fragment = new OrderGenreListFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    public OrderGenreListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order_genre_list, container, false);

        ListView list = ( ListView ) view.findViewById( R.id.order_genre_list);
        OrderGenreListAdapter adapter = new OrderGenreListAdapter( getActivity().getBaseContext() , R.layout.order_genre_list_item , 0 , null );
        list.setAdapter( adapter );

        return view;
    }
//*
    @Override
    public void onViewCreated( View view, Bundle savedInstanceState ){



    }
//*/
}
