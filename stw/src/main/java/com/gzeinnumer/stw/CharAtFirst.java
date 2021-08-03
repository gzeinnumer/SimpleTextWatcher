package com.gzeinnumer.stw;

import android.widget.EditText;

public class CharAtFirst {
    public CharAtFirst() {
    }

    public void disableZero(EditText... views) {
        for (EditText view : views) {
            view.addTextChangedListener(new SimpleTextWatcher(s -> {
                if (s.length() > 0 && s.toString().charAt(0) == '0') {
                    final String newText = s.toString().substring(1);
                    view.setText(newText);
                    view.setSelection(newText.length());
                }
            }));
        }
    }

    public void disableSpace(EditText... views) {
        for (EditText view : views) {
            view.addTextChangedListener(new SimpleTextWatcher(s -> {
                if (s.length() > 0 && s.toString().charAt(0) == ' ') {
                    final String newText = s.toString().substring(1);
                    view.setText(newText);
                    view.setSelection(newText.length());
                }
            }));
        }
    }

    public void disableZeroSpace(EditText... views) {
        spaceZero(views);
    }

    public void disableSpaceZero(EditText... views) {
        spaceZero(views);
    }

    private void spaceZero(EditText... views) {
        for (EditText view : views) {
            view.addTextChangedListener(new SimpleTextWatcher(s -> {
                if (s.length() > 0 && (s.toString().charAt(0) == ' ' || s.toString().charAt(0) == '0')) {
                    final String newText = s.toString().substring(1);
                    view.setText(newText);
                    view.setSelection(newText.length());
                }
            }));
        }
    }
}
