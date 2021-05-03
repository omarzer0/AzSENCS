package com.example.azsencs.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.azsencs.R;
import com.example.azsencs.adapter.recycler.ItemAdapter;
import com.example.azsencs.data.Item;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private ArrayList<Item> itemArrayList = new ArrayList<>();

    // private constructor as we do not want to make instance directly
    private HomeFragment(List<Item> items) {
        itemArrayList.addAll(items);
    }

    public static HomeFragment newInstance(List<Item> items) {
        return new HomeFragment(items);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecyclerView(view);

    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.rv_home_fragment);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        recyclerView.hasFixedSize();
        ItemAdapter adapter = new ItemAdapter();
        adapter.submitList(itemArrayList);
        recyclerView.setAdapter(adapter);
    }
}
