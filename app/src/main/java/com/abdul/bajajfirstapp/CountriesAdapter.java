package com.abdul.bajajfirstapp;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//step 1 -- implemented the methods
//step 2 - created a class CountriesViewHolder [import]
//step 3 - extend CountriesViewHolder with  RecyclerView.ViewHolder
//4 -- create constructor for CountriesViewHolder

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {


    
    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class  CountriesViewHolder extends RecyclerView.ViewHolder{

        public CountriesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
