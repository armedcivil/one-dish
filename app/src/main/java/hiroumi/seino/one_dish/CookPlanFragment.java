package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CookPlanFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cook_plan, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ViewPager viewPager = (ViewPager) getActivity().findViewById(R.id.viewpager);
        PagerAdapter pagerAdapter = new CookPlanPagerAdapter(getActivity());
        viewPager.setAdapter(pagerAdapter);
    }
}
