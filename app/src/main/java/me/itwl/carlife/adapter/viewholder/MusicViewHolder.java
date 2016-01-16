package me.itwl.carlife.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import me.itwl.carlife.R;

/**
 * Created by Steven on 2016/01/16 0016.
 */
public class MusicViewHolder extends RecyclerView.ViewHolder{

    private TextView title;

    public MusicViewHolder(View itemView) {
        super(itemView);
        title = (TextView)itemView.findViewById(R.id.title);
    }

    public void update(String s) {
        title.setText(s);
    }
}