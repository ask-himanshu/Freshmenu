package com.example.freshmenu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.freshmenu.R;

import java.util.ArrayList;

/**
 * Created by hp on 28-Jul-16.
 */
public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {

    private ArrayList<DataModel> dataSet;

    public CardViewAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }
    @Override
    public CardViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewAdapter.ViewHolder holder, int position) {

        ImageView imageView = holder.imageViewIcon;
        TextView name = holder.name;

        imageView.setImageResource(dataSet.get(position).getImage());
        name.setText(dataSet.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewIcon;
        TextView name;
        public ViewHolder(View itemView) {
            super(itemView);

            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageview);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
