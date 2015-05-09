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

        GridView view = new GridView( getActivity().getBaseContext() );
        //Todo:OrderReciptListAdapter adapter = new OrderReciptListAdapter( getActivity().getBaseContext() ,  );

        return view;
    }

    @Override
    public void onViewCreated( View view , Bundle savedInstanceState ){
        super.onViewCreated( view , savedInstanceState );


    }

}
