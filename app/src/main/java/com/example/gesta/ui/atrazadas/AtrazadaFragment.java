package com.example.gesta.ui.atrazadas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gesta.R;

public class AtrazadaFragment extends Fragment {

    private AtrazadaViewModel atrazadaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        atrazadaViewModel =
                ViewModelProviders.of(this).get(AtrazadaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_atrazada, container, false);
        final TextView textView = root.findViewById(R.id.text_atrazada);
        atrazadaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}