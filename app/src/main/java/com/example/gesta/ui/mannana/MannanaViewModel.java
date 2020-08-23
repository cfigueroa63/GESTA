package com.example.gesta.ui.mannana;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MannanaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MannanaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mañana fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}