package com.example.bookapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class SetsAdapter extends RecyclerView.Adapter<SetsAdapter.viewHolder> {

    ArrayList<SetsModel>List;
    Context context;

    public SetsAdapter(ArrayList<SetsModel> list, Context context) {
        List = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_sets,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final SetsModel model = List.get(position);

        holder.setName.setText(model.getSetName());

    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView setName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            setName = itemView.findViewById(R.id.setName);

        }
    }

}
