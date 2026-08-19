package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p056C2.C1511e;
import p304M2.C5280c;
import p720e6.C13287b;
import p729ej.C13414e;
import p851ka.C16364a;
import p862l2.AbstractC16803b;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC16803b {

    /* JADX INFO: renamed from: a */
    public C5280c f36403a;

    /* JADX INFO: renamed from: b */
    public C13287b f36404b;

    /* JADX INFO: renamed from: c */
    public boolean f36405c;

    /* JADX INFO: renamed from: d */
    public boolean f36406d;

    /* JADX INFO: renamed from: e */
    public int f36407e = 2;

    /* JADX INFO: renamed from: f */
    public float f36408f = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f36409g = 0.5f;

    /* JADX INFO: renamed from: h */
    public final C16364a f36410h = new C16364a(this);

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: f */
    public boolean mo13566f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM11376o = this.f36405c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM11376o = coordinatorLayout.m11376o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f36405c = zM11376o;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f36405c = false;
        }
        if (!zM11376o) {
            return false;
        }
        if (this.f36403a == null) {
            this.f36403a = new C5280c(coordinatorLayout.getContext(), coordinatorLayout, this.f36410h);
        }
        return !this.f36406d && this.f36403a.m5821p(motionEvent);
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: g */
    public final boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0738T.m1581i(view, 1048576);
            AbstractC0738T.m1579g(view, 0);
            if (mo13582r(view)) {
                AbstractC0738T.m1582j(view, C1511e.f4032l, new C13414e(this));
            }
        }
        return false;
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: q */
    public final boolean mo13575q(View view, MotionEvent motionEvent) {
        if (this.f36403a == null) {
            return false;
        }
        if (this.f36406d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f36403a.m5815j(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo13582r(View view) {
        return true;
    }
}
