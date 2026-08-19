package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p030B2.AbstractC0738T;
import p189Ha.C3271e;
import p999s.C19380u;
import za.C21818a;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C19380u implements Checkable {

    /* JADX INFO: renamed from: u0 */
    public static final int[] f36658u0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: r0 */
    public boolean f36659r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f36660s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f36661t0;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.openai.chatgpt.R.attr.imageButtonStyle);
        this.f36660s0 = true;
        this.f36661t0 = true;
        AbstractC0738T.m1584l(this, new C3271e(this, 3));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36659r0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f36659r0 ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f36658u0) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C21818a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C21818a c21818a = (C21818a) parcelable;
        super.onRestoreInstanceState(c21818a.f16000Y);
        setChecked(c21818a.f69191o0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C21818a c21818a = new C21818a(super.onSaveInstanceState());
        c21818a.f69191o0 = this.f36659r0;
        return c21818a;
    }

    public void setCheckable(boolean z6) {
        if (this.f36660s0 != z6) {
            this.f36660s0 = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f36660s0 || this.f36659r0 == z6) {
            return;
        }
        this.f36659r0 = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z6) {
        this.f36661t0 = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f36661t0) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f36659r0);
    }
}
