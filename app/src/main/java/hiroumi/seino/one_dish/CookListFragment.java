package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class CookListFragment extends ListFragment {

    private CookListAdapter cookListAdapter;
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cook_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView = getListView();
        cookListAdapter = new CookListAdapter(getActivity());
        setListAdapter(cookListAdapter);
        int i=0;
        while (i<=10) {
            cookListAdapter.add(null);
            i++;
        }
        listView.setSelection(0);
    }
}
