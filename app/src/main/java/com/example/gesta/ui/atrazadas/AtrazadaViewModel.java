package com.example.gesta.ui.atrazadas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AtrazadaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AtrazadaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is atrazada fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}