package p084D4;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p030B2.C0747b;
import p056C2.C1512f;
import p960q9.C18655i;

/* JADX INFO: renamed from: D4.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1935q0 extends C0747b {

    /* JADX INFO: renamed from: d */
    public final C1937r0 f5712d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f5713e = new WeakHashMap();

    public C1935q0(C1937r0 c1937r0) {
        this.f5712d = c1937r0;
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: a */
    public final boolean mo1589a(View view, AccessibilityEvent accessibilityEvent) {
        C0747b c0747b = (C0747b) this.f5713e.get(view);
        return c0747b != null ? c0747b.mo1589a(view, accessibilityEvent) : this.f2118a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: b */
    public final C18655i mo636b(View view) {
        C0747b c0747b = (C0747b) this.f5713e.get(view);
        return c0747b != null ? c0747b.mo636b(view) : super.mo636b(view);
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: c */
    public final void mo1590c(View view, AccessibilityEvent accessibilityEvent) {
        C0747b c0747b = (C0747b) this.f5713e.get(view);
        if (c0747b != null) {
            c0747b.mo1590c(view, accessibilityEvent);
        } else {
            super.mo1590c(view, accessibilityEvent);
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: d */
    public final void mo862d(View view, C1512f c1512f) {
        C1937r0 c1937r0 = this.f5712d;
        boolean zM12265O = c1937r0.f5717d.m12265O();
        View.AccessibilityDelegate accessibilityDelegate = this.f2118a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
        if (!zM12265O) {
            RecyclerView recyclerView = c1937r0.f5717d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m2939U(view, c1512f);
                C0747b c0747b = (C0747b) this.f5713e.get(view);
                if (c0747b != null) {
                    c0747b.mo862d(view, c1512f);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: e */
    public final void mo1591e(View view, AccessibilityEvent accessibilityEvent) {
        C0747b c0747b = (C0747b) this.f5713e.get(view);
        if (c0747b != null) {
            c0747b.mo1591e(view, accessibilityEvent);
        } else {
            super.mo1591e(view, accessibilityEvent);
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: f */
    public final boolean mo1592f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0747b c0747b = (C0747b) this.f5713e.get(viewGroup);
        return c0747b != null ? c0747b.mo1592f(viewGroup, view, accessibilityEvent) : this.f2118a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: g */
    public final boolean mo1593g(View view, int i10, Bundle bundle) {
        C1937r0 c1937r0 = this.f5712d;
        if (!c1937r0.f5717d.m12265O()) {
            RecyclerView recyclerView = c1937r0.f5717d;
            if (recyclerView.getLayoutManager() != null) {
                C0747b c0747b = (C0747b) this.f5713e.get(view);
                if (c0747b != null) {
                    if (c0747b.mo1593g(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.mo1593g(view, i10, bundle)) {
                    return true;
                }
                C1911e0 c1911e0 = recyclerView.getLayoutManager().f5543b.f33644q0;
                return false;
            }
        }
        return super.mo1593g(view, i10, bundle);
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: h */
    public final void mo1594h(View view, int i10) {
        C0747b c0747b = (C0747b) this.f5713e.get(view);
        if (c0747b != null) {
            c0747b.mo1594h(view, i10);
        } else {
            super.mo1594h(view, i10);
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: i */
    public final void mo1595i(View view, AccessibilityEvent accessibilityEvent) {
        C0747b c0747b = (C0747b) this.f5713e.get(view);
        if (c0747b != null) {
            c0747b.mo1595i(view, accessibilityEvent);
        } else {
            super.mo1595i(view, accessibilityEvent);
        }
    }
}
