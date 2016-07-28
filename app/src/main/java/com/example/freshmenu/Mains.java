package com.example.freshmenu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freshmenu.adapter.CardViewAdapter;
import com.example.freshmenu.adapter.DataModel;

import java.util.ArrayList;

/**
 * Created by hp on 28-Jul-16.
 */
public class Mains extends Fragment {
    Context context;
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mains, container, false);
        context = view.getContext();
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            data.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.drawableArray[i]
            ));
        }

        adapter = new CardViewAdapter(data);
        recyclerView.setAdapter(adapter);
        return view;
    }

    public static class MyData {

        static String[] nameArray = {"Chocolates", "Fruit Salad", "Grill Chicken", "Wrapper","Fried Chicken"};

        static Integer[] drawableArray = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
    }
}
