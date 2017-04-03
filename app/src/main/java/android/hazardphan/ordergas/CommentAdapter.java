package android.hazardphan.ordergas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by VanCuong on 01/04/2017.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.MyViewHolder> {
    private int position;
    Context context;
    private ArrayList<Item_comment> cmt=new ArrayList<>();
    public CommentAdapter(Context context, ArrayList<Item_comment> cmt) {
        this.context = context;
        this.cmt = cmt;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment, parent, false);
        return new CommentAdapter.MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(final MyViewHolder vh, final int position) {
        Item_comment c = cmt.get(position);
       vh.ed_name.setText(c.getName());
        vh.ed_text.setText(c.getText());

    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    @Override
    public int getItemCount() {
        return cmt.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ed_name,ed_text;
        public MyViewHolder(View itemView) {
            super(itemView);
           ed_name=(TextView)itemView.findViewById(R.id.tv_cmt_name);
            ed_text=(TextView)itemView.findViewById(R.id.tv_cmt_text);
        }

    }

}

