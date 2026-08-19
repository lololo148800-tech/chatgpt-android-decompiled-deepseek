package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p1079wa.InterfaceC20853a;
import p311Ma.ViewTreeObserverOnPreDrawListenerC5313a;
import p862l2.AbstractC16803b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC16803b {

    /* JADX INFO: renamed from: a */
    public int f36828a = 0;

    public ExpandableBehavior() {
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: b */
    public abstract boolean mo13577b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: d */
    public final boolean mo13578d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (InterfaceC20853a) view2;
        boolean z6 = ((FloatingActionButton) obj).f36643C0.f22495b;
        if (z6) {
            int i10 = this.f36828a;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f36828a != 1) {
            return false;
        }
        this.f36828a = z6 ? 1 : 2;
        mo13690r((View) obj, view, z6, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: g */
    public final boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        InterfaceC20853a interfaceC20853a;
        boolean z6;
        int i11;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM11373j = coordinatorLayout.m11373j(view);
            int size = arrayListM11373j.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    interfaceC20853a = null;
                    break;
                }
                View view2 = (View) arrayListM11373j.get(i12);
                if (mo13577b(view, view2)) {
                    interfaceC20853a = (InterfaceC20853a) view2;
                    break;
                }
                i12++;
            }
            if (interfaceC20853a != null && (!(z6 = ((FloatingActionButton) interfaceC20853a).f36643C0.f22495b) ? this.f36828a == 1 : !((i11 = this.f36828a) != 0 && i11 != 2))) {
                int i13 = z6 ? 1 : 2;
                this.f36828a = i13;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC5313a(this, view, i13, interfaceC20853a));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo13690r(View view, View view2, boolean z6, boolean z10);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
