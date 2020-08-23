package com.example.gesta.ui.hoy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HoyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HoyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is hoy fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}