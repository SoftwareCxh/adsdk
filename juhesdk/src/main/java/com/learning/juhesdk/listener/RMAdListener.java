package com.learning.juhesdk.listener;

public interface RMAdListener {
    void onAdLoadSuccess();
    void onAdLoadFail(int code, String msg);
    void onAdClicked();
    void onAdDismiss();
}
