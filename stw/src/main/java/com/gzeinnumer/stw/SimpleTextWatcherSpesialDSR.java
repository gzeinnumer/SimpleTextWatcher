package com.gzeinnumer.stw;

import android.text.Editable;
import android.text.TextWatcher;

import com.gzeinnumer.stw.interfaceCallBack.AfterTextChanged;
import com.gzeinnumer.stw.interfaceCallBack.AfterTextChangedSpesialDSR;
import com.gzeinnumer.stw.interfaceCallBack.BeforeTextChanged;
import com.gzeinnumer.stw.interfaceCallBack.OnTextChanged;

public class SimpleTextWatcherSpesialDSR implements TextWatcher {

    private BeforeTextChanged _callBackBTC;
    private OnTextChanged _callBackOTC;
    private AfterTextChangedSpesialDSR _callBackATC;

    public SimpleTextWatcherSpesialDSR(BeforeTextChanged callBack) {
        this._callBackBTC = callBack;
    }

    public SimpleTextWatcherSpesialDSR(OnTextChanged callBack) {
        this._callBackOTC = callBack;
    }

    public SimpleTextWatcherSpesialDSR(AfterTextChangedSpesialDSR callBack) {
        this._callBackATC = callBack;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (_callBackBTC != null)
            _callBackBTC.beforeTextChanged(s, start, count, after);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (_callBackOTC != null)
            _callBackOTC.onTextChanged(s, start, before, count);
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (_callBackATC != null) {
            if (s.toString().length() > 0) {
                _callBackATC.afterTextChanged(s.toString());
            } else {
                _callBackATC.afterTextChanged("");
            }
        }
    }
}
