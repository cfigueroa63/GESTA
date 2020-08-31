package com.example.gesta.ui.pendientes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PendienteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PendienteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tareas Pendientes");
    }

    public LiveData<String> getText() {
        return mText;
    }
}