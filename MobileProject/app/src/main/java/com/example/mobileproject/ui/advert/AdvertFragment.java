package com.example.mobileproject.ui.advert;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mobileproject.R;

public class AdvertFragment extends Fragment {

    private AdvertViewModel advertViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        advertViewModel =
                new ViewModelProvider(this).get(AdvertViewModel.class);
        View root = inflater.inflate(R.layout.fragment_advert, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        advertViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}