package hiroumi.seino.one_dish;

public class OrderGenreListBean {
    private static final String TAG = OrderGenreListBean.class.getSimpleName();
    private int id = 0;
    private String title = "";
    public OrderGenreListBean( String title , int id ){
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}