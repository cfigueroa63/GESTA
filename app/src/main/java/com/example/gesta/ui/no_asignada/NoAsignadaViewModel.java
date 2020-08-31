package com.example.gesta.ui.no_asignada;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NoAsignadaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NoAsignadaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tareas no Asignadas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}