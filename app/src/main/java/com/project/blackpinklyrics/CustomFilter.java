package com.project.blackpinklyrics;

import android.widget.Filter;

import com.project.blackpinklyrics.adapter.AdapterLyrics;
import com.project.blackpinklyrics.model.ModelLyrics;

import java.util.ArrayList;

public class CustomFilter extends Filter {

   ArrayList<ModelLyrics> filterList;
   AdapterLyrics adapter;

    public CustomFilter(ArrayList<ModelLyrics> filterList, AdapterLyrics adapter) {
        this.filterList = filterList;
        this.adapter = adapter;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {

        FilterResults results = new FilterResults();

        if(constraint != null && constraint.length() > 0) {

            constraint = constraint.toString().toUpperCase();
            ArrayList<ModelLyrics> filterModels = new ArrayList<>();

            for (int i = 0; i < filterList.size(); i++) {

                if (filterList.get(i).getTitle().toUpperCase().contains(constraint)){
                    filterModels.add(filterList.get(i));
                }
            }

            results.count = filterModels.size();
            results.values = filterModels;
        }

        else {
            results.count = filterList.size();
            results.values = filterList;
        }

        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

        adapter.modelLyrics = (ArrayList<ModelLyrics>) results.values;
        adapter.notifyDataSetChanged();

    }
}
