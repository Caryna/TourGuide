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
public class RestaurantsFragment extends Fragment {

    public static final String NAME = "Restaurants";

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of locations
        final ArrayList<com.example.android.tourguide.Word> words = new ArrayList<com.example.android.tourguide.Word>();
        words.add(new com.example.android.tourguide.Word("Brasov Street, Bucharest","Cafeteria", R.drawable.cafeteria2));
        words.add(new com.example.android.tourguide.Word("Hora Street, Bucharest","Switch Eat", R.drawable.switch_eat));
        words.add(new com.example.android.tourguide.Word("Smardan Street, Bucharest","Van Gogh", R.drawable.van_gogh2));
        words.add(new com.example.android.tourguide.Word("Floreasca Way, Bucharest","Vivo", R.drawable.vivo));
        words.add(new com.example.android.tourguide.Word("Victoria Way, Bucharest","Za Lokal", R.drawable.za_lokal));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);

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

