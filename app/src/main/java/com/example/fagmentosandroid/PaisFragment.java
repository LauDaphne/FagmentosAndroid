package com.example.fagmentosandroid;


import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.ArrayRes;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaisFragment extends Fragment {

    ListView listaPaisDes;
    String [] lista = new String[10];

    public PaisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        listaPaisDes = getActivity().findViewById(R.id.listaPaises);
        Resources res = getResources();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pais, container, false);
    }

}
