package com.example.gesta.ui.semana;

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

public class SemanaFragment extends Fragment {

    private SemanaViewModel semanaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        semanaViewModel =
                ViewModelProviders.of(this).get(SemanaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_semana, container, false);
        final TextView textView = root.findViewById(R.id.text_semana);
        semanaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}