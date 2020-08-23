package com.example.gesta.ui.semana;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SemanaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SemanaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is semana fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}