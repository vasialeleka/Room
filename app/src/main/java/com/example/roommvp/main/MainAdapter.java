package com.example.roommvp.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.roommvp.R;
import com.example.roommvp.model.Pet;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.VH> {
    List<Pet> list;
    public MainAdapter(List<Pet> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout, viewGroup, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH vh, int i) {
        Pet pet = list.get(i);
        vh.textName.setText(pet.name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView textName;
        public VH(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.petName);
        }
    }
}
