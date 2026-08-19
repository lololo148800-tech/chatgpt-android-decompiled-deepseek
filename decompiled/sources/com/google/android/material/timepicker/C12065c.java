package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.openai.chatgpt.R;
import p030B2.C0747b;
import p056C2.C1511e;
import p056C2.C1512f;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12065c extends C0747b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f36820d;

    public C12065c(ClockFaceView clockFaceView) {
        this.f36820d = clockFaceView;
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: d */
    public final void mo862d(View view, C1512f c1512f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2118a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f36820d.f36792N0.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c1512f.m2213b(C1511e.f4025e);
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: g */
    public final boolean mo1593g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.mo1593g(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f36820d;
        view.getHitRect(clockFaceView.f36789K0);
        float fCenterX = clockFaceView.f36789K0.centerX();
        float fCenterY = clockFaceView.f36789K0.centerY();
        clockFaceView.f36788J0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f36788J0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
