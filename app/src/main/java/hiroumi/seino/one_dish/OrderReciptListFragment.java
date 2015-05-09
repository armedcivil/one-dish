package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class OrderReciptListFragment extends ListFragment {

    public static OrderReciptListFragment newInstance(String param1, String param2) {
        OrderReciptListFragment fragment = new OrderReciptListFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    public OrderReciptListFragment() {
    }

    @Override
    public void onActivityCreated( Bundle saved ){
        super.onActivityCreated( saved );



    }

}
