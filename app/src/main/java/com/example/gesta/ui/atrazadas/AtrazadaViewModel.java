package com.example.gesta.ui.atrazadas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AtrazadaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AtrazadaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tareas atrazadas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}