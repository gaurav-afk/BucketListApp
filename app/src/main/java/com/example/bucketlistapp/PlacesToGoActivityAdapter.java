package com.example.bucketlistapp;

import static android.system.Os.bind;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivityAdapter extends RecyclerView.Adapter<PlacesToGoActivityAdapter.PlaceViewHolder> {

   private String[] places;
   public PlacesToGoActivityAdapter(String[] places){
       this.places = places;
   }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_to_do_item, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        holder.bind(places[position]);
    }

    @Override
    public int getItemCount() {
        return places.length;
    }

    static class PlaceViewHolder extends RecyclerView.ViewHolder{
        TextView place;
        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            place = itemView.findViewById(R.id.tv_name);
        }
        public void bind(String p){
            place.setText(p);
        }
    }
}
