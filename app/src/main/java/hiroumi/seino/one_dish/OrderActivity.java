package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class OrderActivity extends ActionBarActivity {
    private static final String TAG = OrderActivity.class.getSimpleName();
    public static final int GENRE = 100;
    public static final int RECIPT = 200;
    public static final int DETAIL = 300;
    public static final int CART = 400;
    Menu menu;

    OrderGenreListFragment genre = new OrderGenreListFragment();
    OrderReciptListFragment recipt = new OrderReciptListFragment();
    OrderDetailFragment detail = new OrderDetailFragment();
    ActionBar actionBar;

    @Override
    public void onCreate( Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_cook);
        actionBar = getSupportActionBar();
        setFragment(GENRE ,0);
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        actionBar.setDisplayHomeAsUpEnabled(true);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.menu = menu;
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
                transaction.add(R.id.fragment_container, genre);
                break;
            case RECIPT:
                transaction.addToBackStack(null);
                transaction.add(R.id.fragment_container, recipt);
                break;
            case DETAIL:
                transaction.addToBackStack(null);
                transaction.add(R.id.fragment_container, detail);
                menu.clear();
                getMenuInflater().inflate( R.menu.menu_order , menu );
                break;
            default:
        }
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().findFragmentById(R.id.fragment_container) == genre){
            finish();
        }
        else {
            getSupportFragmentManager().popBackStack();
            invalidateOptionsMenu();
        }
    }

}