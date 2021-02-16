package com.gzeinnumer.stw;

import android.text.Editable;
import android.text.TextWatcher;

import com.gzeinnumer.mylibsimpletextwatcher.interfaceCallBack.AfterTextChanged;
import com.gzeinnumer.mylibsimpletextwatcher.interfaceCallBack.BeforeTextChanged;
import com.gzeinnumer.mylibsimpletextwatcher.interfaceCallBack.OnTextChanged;

public class SimpleTextWatcher implements TextWatcher {

    private BeforeTextChanged _callBackBTC;
    private OnTextChanged _callBackOTC;
    private AfterTextChanged _callBackATC;

    public SimpleTextWatcher(BeforeTextChanged callBack) {
        this._callBackBTC = callBack;
    }

    public SimpleTextWatcher(OnTextChanged callBack) {
        this._callBackOTC = callBack;
    }

    public SimpleTextWatcher(AfterTextChanged callBack) {
        this._callBackATC = callBack;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (_callBackBTC!=null)
            _callBackBTC.beforeTextChanged(s, start, count, after);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (_callBackOTC!=null)
            _callBackOTC.onTextChanged(s, start, before, count);
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (_callBackATC!=null)
            _callBackATC.afterTextChanged(s);
    }
}
