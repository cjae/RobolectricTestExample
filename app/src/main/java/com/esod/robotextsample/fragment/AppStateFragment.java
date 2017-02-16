package com.esod.robotextsample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.esod.robotextsample.MainActivity;
import com.esod.robotextsample.R;

/**
 * Created by Jedidiah on 16/02/2017.
 */

public class AppStateFragment extends Fragment{

    private MainActivity parentActivity;

    public static AppStateFragment newInstance(){
        return new AppStateFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        parentActivity = (MainActivity) getActivity();
        openFragment(GuestListFragment.newInstance(), "Guest List");
    }

    private void openFragment(Fragment fragment, String screenTitle){

        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
        parentActivity.getSupportActionBar().setTitle(screenTitle);
    }
}
