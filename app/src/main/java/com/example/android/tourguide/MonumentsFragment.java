package com.example.android.tourguide;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.WordAdapter;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number landmarks.
 */
public class MonumentsFragment extends Fragment {

    public static final String NAME = "Monuments";

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of locations
        final ArrayList<com.example.android.tourguide.Word> words = new ArrayList<com.example.android.tourguide.Word>();
        words.add(new com.example.android.tourguide.Word("Connecting Nicolae Titulescu blvd. and Grozǎveşti Road","Basarab Bridge", R.drawable.bridge));
        words.add(new com.example.android.tourguide.Word("Open daily between 10:00 - 16:00","The Palace of the Parliament", R.drawable.casa_poporului));
        words.add(new com.example.android.tourguide.Word("Open daily between 8:00 - 20:00","Botanical Garden", R.drawable.garden2));
        words.add(new com.example.android.tourguide.Word("Old traditional restaurants&cafes","Old Town", R.drawable.old_town2));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_monuments);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}

