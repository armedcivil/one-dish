package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class OrderActivity extends ActionBarActivity {

    /**
     * レイアウト管理用定数
     */
    private final static int GENRE = 100;
    public final static int RECIPT = 200;
    public final static int DETAIL = 300;

    private ActionBar actionBar;
    OrderDetailFragment orderDetailFragment = new OrderDetailFragment();
    OrderGenreListFragment orderGenreListFragment = new OrderGenreListFragment();
    OrderReciptListFragment orderReciptListFragment = new OrderReciptListFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);

        actionBar = getSupportActionBar();
        setFragment(GENRE, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        actionBar.setDisplayHomeAsUpEnabled(true);
        getMenuInflater().inflate(R.menu.menu_cook, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * フラグメント選択、セット
     */
    public void setFragment(int num, int menuId) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (num) {
            case GENRE:
                transaction.addToBackStack(null);
                transaction.add(R.id.fragment_container, orderGenreListFragment);
                break;
            case RECIPT:
                transaction.addToBackStack(null);
                transaction.add(R.id.fragment_container, orderReciptListFragment);
                break;
            case DETAIL:
                transaction.addToBackStack(null);
                transaction.add(R.id.fragment_container, orderDetailFragment);
                break;
            default:
        }
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().findFragmentById(R.id.fragment_container) == orderGenreListFragment){
            finish();
        }
        else {
            getSupportFragmentManager().popBackStack();
            invalidateOptionsMenu();
        }
    }
}