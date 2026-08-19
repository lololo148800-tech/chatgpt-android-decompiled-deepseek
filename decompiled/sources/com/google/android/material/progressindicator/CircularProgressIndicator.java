package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p038Ba.AbstractC0854d;
import p038Ba.C0855e;
import p038Ba.C0858h;
import p038Ba.C0859i;
import p038Ba.C0861k;
import p038Ba.C0866p;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicator extends AbstractC0854d {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        C0859i c0859i = this.f2370o0;
        C0855e c0855e = new C0855e(c0859i);
        C0858h c0858h = new C0858h(c0859i);
        C0866p c0866p = new C0866p(context2, c0859i);
        c0866p.f2434x0 = c0855e;
        c0855e.f2430b = c0866p;
        c0866p.f2435y0 = c0858h;
        c0858h.f2431a = c0866p;
        setIndeterminateDrawable(c0866p);
        setProgressDrawable(new C0861k(getContext(), c0859i, new C0855e(c0859i)));
    }

    public int getIndicatorDirection() {
        return this.f2370o0.f2409i;
    }

    public int getIndicatorInset() {
        return this.f2370o0.f2408h;
    }

    public int getIndicatorSize() {
        return this.f2370o0.f2407g;
    }

    public void setIndicatorDirection(int i10) {
        this.f2370o0.f2409i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        C0859i c0859i = this.f2370o0;
        if (c0859i.f2408h != i10) {
            c0859i.f2408h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        C0859i c0859i = this.f2370o0;
        if (c0859i.f2407g != iMax) {
            c0859i.f2407g = iMax;
            c0859i.getClass();
            invalidate();
        }
    }

    @Override // p038Ba.AbstractC0854d
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        this.f2370o0.getClass();
    }
}
