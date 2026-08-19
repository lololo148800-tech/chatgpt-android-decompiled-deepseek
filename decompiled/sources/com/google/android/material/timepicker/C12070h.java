package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.google.android.material.timepicker.h */
/* JADX INFO: loaded from: classes.dex */
public final class C12070h extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TimePickerView f36826a;

    public C12070h(TimePickerView timePickerView) {
        this.f36826a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i10 = TimePickerView.f36816H0;
        this.f36826a.getClass();
        return false;
    }
}
