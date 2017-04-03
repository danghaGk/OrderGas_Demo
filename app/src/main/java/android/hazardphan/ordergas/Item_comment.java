package android.hazardphan.ordergas;

/**
 * Created by VanCuong on 01/04/2017.
 */

public class Item_comment {
    String name;
    String text;

    public Item_comment(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public Item_comment() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
