package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
<<<<<<< HEAD
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class OrderGenreListFragment extends ListFragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_order_genre_list, container, false);
=======
import android.view.View;
import android.widget.AdapterView;

public class OrderGenreListFragment extends ListFragment {

    OrderActivity order;

    public static OrderGenreListFragment newInstance(String param1, String param2) {
            OrderGenreListFragment fragment = new OrderGenreListFragment();
            Bundle args = new Bundle();
        return fragment;
>>>>>>> 08a1f493f5a68c18a9a20de8bec8484d9daf1dbd
    }

//    public static OrderGenreListFragment newInstance(String param1, String param2) {
//        OrderGenreListFragment fragment = new OrderGenreListFragment();
//        Bundle args = new Bundle();
//        return fragment;
//    }

    public OrderGenreListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView = getListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // クリックされたアイテムを取得
                String item = (String) listView.getItemAtPosition(position);
                //~~
                int menuId = 0;
                //メニューのIDを渡す

                //~~
                OrderActivity orderActivity = (OrderActivity) getActivity();
                orderActivity.setFragment(OrderActivity.RECIPT, menuId);
            }
        });

<<<<<<< HEAD
        OrderGenreListAdapter orderGenreListAdapter = new OrderGenreListAdapter(getActivity());
        setListAdapter(orderGenreListAdapter);
        int i=0;
        while (i<5) {
            orderGenreListAdapter.add(null);
            i++;
        }
        listView.setSelection(0);
=======
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

>>>>>>> 08a1f493f5a68c18a9a20de8bec8484d9daf1dbd
    }
}
