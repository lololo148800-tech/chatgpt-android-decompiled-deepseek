package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: com.google.android.material.timepicker.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC12071i implements View.OnTouchListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ GestureDetector f36827Y;

    public ViewOnTouchListenerC12071i(GestureDetector gestureDetector) {
        this.f36827Y = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f36827Y.onTouchEvent(motionEvent);
        }
        return false;
    }
}
