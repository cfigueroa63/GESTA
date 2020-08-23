package com.example.gesta.ui.no_asignada;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gesta.R;

public class NoAsignadaFragment extends Fragment {

    private NoAsignadaViewModel noAsignadaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        noAsignadaViewModel =
                ViewModelProviders.of(this).get(NoAsignadaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mes, container, false);
        final TextView textView = root.findViewById(R.id.text_mes);
        noAsignadaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}