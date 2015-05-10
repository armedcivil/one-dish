package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OrderActivity extends ActionBarActivity {

    /**
     * レイアウト管理用定数
     */
    private final static int GENRE = 100;
    public final static int RECIPT = 200;
    public final static int DETAIL = 300;
    private int menuType = 0;

    private ActionBar actionBar;
    OrderGenreListFragment orderGenreListFragment = new OrderGenreListFragment();
    OrderReciptListFragment orderReciptListFragment = new OrderReciptListFragment();
    OrderDetailFragment orderDetailFragment = new OrderDetailFragment();

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
        if(menuType == 0){
            actionBar.setTitle("食材を買う");
            getMenuInflater().inflate(R.menu.menu_order_no_item, menu);
        }
        else if(menuType == 1){
            actionBar.setTitle("お肉");
            getMenuInflater().inflate(R.menu.menu_order_no_item, menu);
        }
        else if(menuType == 2){
            actionBar.setTitle("お家で簡単　野菜炒め");
            getMenuInflater().inflate(R.menu.menu_order, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.action_cart:
                Toast.makeText(this, "購入しました", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().popBackStack();
                getSupportFragmentManager().popBackStack();
                menuType=0;
                return true;
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
                menuType = 0;
                transaction.add(R.id.fragment_container, orderGenreListFragment);
                invalidateOptionsMenu();
                break;
            case RECIPT:
                transaction.addToBackStack(null);
                menuType = 1;
                transaction.add(R.id.fragment_container, orderReciptListFragment);
                invalidateOptionsMenu();
                break;
            case DETAIL:
                transaction.addToBackStack(null);
                menuType = 2;
                transaction.add(R.id.fragment_container, orderDetailFragment);
                invalidateOptionsMenu();
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
            if(menuType!=0){
                menuType--;
            }
            invalidateOptionsMenu();
        }
    }
}