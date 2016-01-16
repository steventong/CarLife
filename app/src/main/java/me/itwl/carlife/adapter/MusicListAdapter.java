package me.itwl.carlife.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import me.itwl.carlife.R;
import me.itwl.carlife.adapter.viewholder.MusicViewHolder;

/**
 * Created by Steven on 2016/01/16 0016.
 */
public class MusicListAdapter extends RecyclerView.Adapter<MusicViewHolder> {

    private Context context;
    private List<String> songs;

    public MusicListAdapter(Context context) {
        this.context = context;
        songs = new ArrayList<>();
    }

    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MusicViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_music, parent, false));
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position) {
        holder.update(songs.get(position));
    }

    public void update(List<String> songs) {
        this.songs = songs;
        notifyDataSetChanged();
    }
}

