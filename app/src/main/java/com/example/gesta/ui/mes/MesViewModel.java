package com.example.gesta.ui.mes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mes fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}