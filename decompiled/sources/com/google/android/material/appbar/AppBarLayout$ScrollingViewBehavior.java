package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p523V9.AbstractC7925K4;
import p783ha.AbstractC14431a;
import p830ja.AbstractC16180a;
import p862l2.AbstractC16803b;
import p862l2.C16806e;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC16180a {

    /* JADX INFO: renamed from: b */
    public final int f36388b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* JADX INFO: renamed from: s */
    public static void m13576s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: b */
    public final boolean mo13577b(View view, View view2) {
        return false;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: d */
    public boolean mo13578d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC16803b abstractC16803b = ((C16806e) view2.getLayoutParams()).f53917a;
        if (abstractC16803b instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC16803b).getClass();
            int i10 = this.f36388b;
            int iM8214e = bottom - (i10 == 0 ? 0 : AbstractC7925K4.m8214e((int) (0.0f * i10), 0, i10));
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            view.offsetTopAndBottom(iM8214e);
        }
        return false;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: h */
    public final boolean mo13568h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int i13 = view.getLayoutParams().height;
        if (i13 != -1 && i13 != -2) {
            return false;
        }
        m13576s(coordinatorLayout.m11373j(view));
        return false;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: l */
    public final void mo13579l(CoordinatorLayout coordinatorLayout, View view) {
        m13576s(coordinatorLayout.m11373j(view));
    }

    @Override // p830ja.AbstractC16180a
    /* JADX INFO: renamed from: r */
    public final void mo13580r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        m13576s(coordinatorLayout.m11373j(view));
        coordinatorLayout.m11378q(view, i10);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45393z);
        this.f36388b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
