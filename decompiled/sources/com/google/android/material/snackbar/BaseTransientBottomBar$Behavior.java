package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p189Ha.AbstractC3275i;
import p189Ha.C3272f;
import p658b5.C11238i;
import p720e6.C13288c;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: i */
    public final C13288c f36698i;

    public BaseTransientBottomBar$Behavior() {
        C13288c c13288c = new C13288c();
        this.f36408f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f36409g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f36407e = 0;
        this.f36698i = c13288c;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p862l2.AbstractC16803b
    /* JADX INFO: renamed from: f */
    public final boolean mo13566f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C13288c c13288c = this.f36698i;
        c13288c.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C11238i.m12530k0().m12533B0((C3272f) c13288c.f42001Y);
            }
        } else if (coordinatorLayout.m11376o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C11238i.m12530k0().m12579x0((C3272f) c13288c.f42001Y);
        }
        return super.mo13566f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: r */
    public final boolean mo13582r(View view) {
        this.f36698i.getClass();
        return view instanceof AbstractC3275i;
    }
}
