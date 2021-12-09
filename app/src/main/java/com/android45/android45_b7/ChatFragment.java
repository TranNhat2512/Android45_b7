package com.android45.android45_b7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android45.android45_b7.databinding.ChatFragmentBinding;

public class ChatFragment extends Fragment {
    ChatFragmentBinding binding;

    public static ChatFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ChatFragment fragment = new ChatFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.chat_fragment, container, false);

        binding.btnBackChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragment();
            }
        });
        return binding.getRoot();
    }
}