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
 * {@link Fragment} that displays a list of landmarks.
 */
public class ClubsFragment extends Fragment {

    public static final String NAME = "Clubs";

    public ClubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of locations
        final ArrayList<com.example.android.tourguide.Word> words = new ArrayList<com.example.android.tourguide.Word>();
        words.add(new com.example.android.tourguide.Word("Montreal Square, Bucharest", "Player", R.drawable.player));
        words.add(new com.example.android.tourguide.Word("Caroteni Street, Bucharest", "Bamboo", R.drawable.bamboo));
        words.add(new com.example.android.tourguide.Word("32 Kiseleff Blvd, Bucharest", "BOA", R.drawable.boa2));
        words.add(new com.example.android.tourguide.Word("Str. Mille Constantin 4, Bucharest", "Control", R.drawable.control2));
        words.add(new com.example.android.tourguide.Word("Str. Gabroveni 14, Bucharest", "Mojo", R.drawable.mojo));
        words.add(new com.example.android.tourguide.Word("Str. Selari 17, Bucharest", "Shoteria", R.drawable.shoteria));
        words.add(new com.example.android.tourguide.Word("Calea Victoriei 17, Bucharest", "Interbelic", R.drawable.interbelic));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_clubs);

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

