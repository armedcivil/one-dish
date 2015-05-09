package hiroumi.seino.one_dish;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class CookActivity extends ActionBarActivity {

    /**
     * レイアウト管理用定数
     */
    private final static int LIST = 100;
    public final static int PLAN = 200;

    private ActionBar actionBar;

    CookSelectListFragment cookSelectListFragment = new CookSelectListFragment();
    CookPlanFragment cookPlanFragment = new CookPlanFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook);

        actionBar = getSupportActionBar();
        setFragment(LIST, 0);
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
            case LIST:
                transaction.addToBackStack(null);
                transaction.add(R.id.fragment_container, cookSelectListFragment);
                break;
            case PLAN:
                transaction.addToBackStack(null);
                transaction.add(R.id.fragment_container, cookPlanFragment);
                break;
            default:
        }
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().findFragmentById(R.id.fragment_container) == cookSelectListFragment){
            finish();
        }
        else {
            getSupportFragmentManager().popBackStack();
            invalidateOptionsMenu();
        }
    }
}
