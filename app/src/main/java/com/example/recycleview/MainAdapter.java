package com.example.recycleview;
import android.view.LayoutInflater;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<String >data;

    public MainAdapter(){
        data = new ArrayList<>();

    }
        @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) //будет создовать вю холдер
    {
        return new MainViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_holder_main,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(data.get(position));

    }

    @Override
    public int getItemCount()  {
        return data.size();
    }
    public void addText(String string){
        data.add(string);
    }
}
