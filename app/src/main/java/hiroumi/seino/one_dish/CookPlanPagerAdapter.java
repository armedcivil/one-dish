package hiroumi.seino.one_dish;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CookPlanPagerAdapter extends PagerAdapter {

    private final static int N = 5;
    private LayoutInflater inflater = null;

    public CookPlanPagerAdapter(Context context) {
        super();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.cook_page_item, null);

        ImageView img = (ImageView) layout.findViewById(R.id.img_scroll);
        TextView text = (TextView) layout.findViewById(R.id.text_scroll);
        int res[] = { R.drawable.img1, R.drawable.img2, R.drawable.img3,
                R.drawable.img4, R.drawable.img5 };

        String str[] = {"1. 水大さじ3、醤油大さじ3、酢大さじ3、砂糖は合わせて砂糖をよく溶かしておきます。"
        ,"2. 鶏肉は余分な黄色い脂を取り除き筋切りをして切り込みを入れて薄く開き厚さを均等にします。"
        ,"3. 塩コショウ少々、酒小さじ１、おろしにんにく１片分、おろしショウガ少々を揉み込んで１５分以上置きます。"
        ,"4. 片栗粉をたっぷり、しっかりまぶしつけます。中～高温の油でカラっと揚げます。"
        ,"5. 一口大に切って器に盛り熱いうちに①のタレをたっぷりかけ青ネギと炒りゴマを散らします。"};
        img.setImageResource(res[position]);
        text.setText(str[position]);
        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }

    @Override
    public int getCount() {
        return N;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}