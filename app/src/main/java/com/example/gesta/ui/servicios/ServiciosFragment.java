package com.example.gesta.ui.servicios;

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

public class ServiciosFragment extends Fragment {

    private ServiciosViewModel serviciosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        serviciosViewModel =
                ViewModelProviders.of(this).get(ServiciosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_servicios, container, false);
        final TextView textView = root.findViewById(R.id.text_servicio);
        serviciosViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}