package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p783ha.AbstractC14431a;
import p862l2.AbstractC16803b;
import p862l2.C16806e;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* JADX INFO: loaded from: classes.dex */
public class C12062xe6e79f6<T> extends AbstractC16803b {
    public C12062xe6e79f6() {
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo13641a(Rect rect, View view) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: c */
    public final void mo13594c(C16806e c16806e) {
        if (c16806e.f53924h == 0) {
            c16806e.f53924h = 80;
        }
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: d */
    public final boolean mo13578d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: g */
    public final boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        throw new ClassCastException();
    }

    public C12062xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45375h);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
