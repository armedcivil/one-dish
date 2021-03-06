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
    private int menuType = 0;

    private ActionBar actionBar;

    CookSelectListFragment cookSelectListFragment = new CookSelectListFragment();
    CookPlanFragment cookPlanFragment = new CookPlanFragment();
    OrderDetailFragment orderDetailFragment = new OrderDetailFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook);

        actionBar = getSupportActionBar();
        setFragment(LIST, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        actionBar.setDisplayHomeAsUpEnabled(true);
        if(menuType == 0){
            actionBar.setTitle("料理する");
            getMenuInflater().inflate(R.menu.menu_cook, menu);
        }
        else if(menuType == 1){
            actionBar.setTitle("ジューシーチキン");
            getMenuInflater().inflate(R.menu.menu_cook_icon, menu);
        }
        else if(menuType == 2){
            actionBar.setTitle("ジューシーチキン");
            getMenuInflater().inflate(R.menu.menu_cook, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.action:
                setFragment(3,0);
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
            case LIST:
                transaction.addToBackStack(null);
                menuType=0;
                invalidateOptionsMenu();
                transaction.add(R.id.fragment_container, cookSelectListFragment);
                break;
            case PLAN:
                transaction.addToBackStack(null);
                menuType=1;
                invalidateOptionsMenu();
                transaction.add(R.id.fragment_container, orderDetailFragment);
                break;
            case 3:
                transaction.addToBackStack(null);
                menuType=1;
                invalidateOptionsMenu();
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
            if(menuType!=0){
                menuType--;
            }
            invalidateOptionsMenu();
        }
    }
}
