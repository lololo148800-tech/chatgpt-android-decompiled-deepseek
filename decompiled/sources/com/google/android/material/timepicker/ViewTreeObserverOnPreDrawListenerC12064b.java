package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC12064b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ ClockFaceView f36819Y;

    public ViewTreeObserverOnPreDrawListenerC12064b(ClockFaceView clockFaceView) {
        this.f36819Y = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f36819Y;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f36788J0.f36807r0) - clockFaceView.f36796R0;
        if (height != clockFaceView.f36822H0) {
            clockFaceView.f36822H0 = height;
            clockFaceView.mo13685l();
            int i10 = clockFaceView.f36822H0;
            ClockHandView clockHandView = clockFaceView.f36788J0;
            clockHandView.f36815z0 = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
