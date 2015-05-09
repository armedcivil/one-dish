package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class CookSelectListFragment extends ListFragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cook_list, container, false);
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
                int menuId=0;
                //メニューのIDを渡す

                //~~
                CookActivity cookActivity = (CookActivity) getActivity();
                cookActivity.setFragment(CookActivity.PLAN, menuId);
            }
        });

        CookSelectListAdapter cookSelectListAdapter = new CookSelectListAdapter(getActivity());
        setListAdapter(cookSelectListAdapter);
        int i=0;
        while (i<=10) {
            cookSelectListAdapter.add(null);
            i++;
        }
        listView.setSelection(0);
    }
}
