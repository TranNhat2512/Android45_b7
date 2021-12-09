package com.android45.android45_b7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android45.android45_b7.databinding.FavoritesFragmentBinding;

public class FavoritesFragment extends Fragment {

    FavoritesFragmentBinding binding;

    public static FavoritesFragment newInstance() {

        Bundle args = new Bundle();

        FavoritesFragment fragment = new FavoritesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.favorites_fragment, container, false);



        return binding.getRoot();
    }
}