package com.esod.robotextsample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.esod.robotextsample.R;
import com.esod.robotextsample.adapter.GuestListAdapter;
import com.esod.robotextsample.data.SampleData;
import com.esod.robotextsample.model.Guest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jedidiah on 16/02/2017.
 */

public class GuestListFragment extends Fragment {

    private View mLayout;

    public static GuestListFragment newInstance() {
        return new GuestListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mLayout = inflater.inflate(R.layout.fragment_guest_list, container, false);
        initializeView();
        return mLayout;
    }

    private void initializeView() {
        ListView mListView = (ListView) mLayout.findViewById(R.id.guestListView);
        List<Guest> mGuests = SampleData.getSampleGuests();
        GuestListAdapter mAdapter = new GuestListAdapter(getContext(), mGuests);
        mListView.setAdapter(mAdapter);
    }
}
