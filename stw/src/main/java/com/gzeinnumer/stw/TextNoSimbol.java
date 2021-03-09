package com.gzeinnumer.stw;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextNoSimbol implements TextWatcher {
    private final EditText editText;
    private TextInputLayout textInputLayout;
    private String finalPermitedSymbol;

    public TextNoSimbol(EditText editText) {
        this.editText = editText;
    }

    public TextNoSimbol(TextInputLayout textInputLayout, EditText editText) {
        this.textInputLayout = textInputLayout;
        this.editText = editText;
    }

    public TextNoSimbol(TextInputLayout textInputLayout, EditText editText, String permitedSymbol) {
        this.textInputLayout = textInputLayout;
        this.editText = editText;
        this.finalPermitedSymbol = permitedSymbol;
    }

    public static boolean isValidNoSymbol(String s, String finalPermitedSymbol) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }
        Pattern p;
        Matcher m;
        if (finalPermitedSymbol == null) {
            p = Pattern.compile("[^A-Za-z0-9]");
        } else {
            p = Pattern.compile("[^A-Za-z0-9" + finalPermitedSymbol + "]");
        }
        m = p.matcher(s);
        return m.find();
    }

    public static boolean isValidNoSymbol(String s) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }
        Pattern p;
        Matcher m;
        p = Pattern.compile("[^A-Za-z0-9]");
        m = p.matcher(s);
        return m.find();
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        Log.d(getClass().getSimpleName(), "afterTextChanged: " + isValidNoSymbol(editText.getText().toString(), finalPermitedSymbol) + "_" + (textInputLayout == null));

        if (isValidNoSymbol(editText.getText().toString(), finalPermitedSymbol)) {
            if (textInputLayout == null) {
                editText.setError("No Simbol");
            } else {
                textInputLayout.setError("No Simbol");
            }
        } else {
            if (textInputLayout == null) {
                editText.setError(null);
            } else {
                textInputLayout.setError(null);
            }
        }
    }
}
