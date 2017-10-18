package com.example.sonasi.greenit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sonasi on 11/10/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private String[][] content;

    ListAdapter(String[][] content) {
        this.content = content;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new ViewHolder(itemView);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(content[position][1]);
        if (holder.img != null) {
            new ImageDownloader(holder.img).execute(content[position][0]);
        }
    }

    @Override
    public int getItemCount() {
        return content.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView title;

        ViewHolder(View view) {
            super(view);

            img = view.findViewById(R.id.img);
            title = view.findViewById(R.id.title);
        }
    }
}
