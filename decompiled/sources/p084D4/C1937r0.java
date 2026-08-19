package p084D4;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p030B2.C0747b;
import p056C2.C1512f;

/* JADX INFO: renamed from: D4.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1937r0 extends C0747b {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f5717d;

    /* JADX INFO: renamed from: e */
    public final C1935q0 f5718e;

    public C1937r0(RecyclerView recyclerView) {
        this.f5717d = recyclerView;
        C1935q0 c1935q0 = this.f5718e;
        if (c1935q0 != null) {
            this.f5718e = c1935q0;
        } else {
            this.f5718e = new C1935q0(this);
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: c */
    public final void mo1590c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1590c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f5717d.m12265O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo2936R(accessibilityEvent);
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: d */
    public final void mo862d(View view, C1512f c1512f) {
        this.f2118a.onInitializeAccessibilityNodeInfo(view, c1512f.f4042a);
        RecyclerView recyclerView = this.f5717d;
        if (recyclerView.m12265O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC1900Y layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f5543b;
        layoutManager.mo2937S(recyclerView2.f33644q0, recyclerView2.f33647r1, c1512f);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[PHI: r7
      0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: g */
    public final boolean mo1593g(View view, int i10, Bundle bundle) {
        int iM2927E;
        int iM2925C;
        if (super.mo1593g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5717d;
        if (recyclerView.m12265O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC1900Y layoutManager = recyclerView.getLayoutManager();
        C1911e0 c1911e0 = layoutManager.f5543b.f33644q0;
        int iHeight = layoutManager.f5556o;
        int iWidth = layoutManager.f5555n;
        Rect rect = new Rect();
        if (layoutManager.f5543b.getMatrix().isIdentity() && layoutManager.f5543b.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i10 == 4096) {
            iM2927E = layoutManager.f5543b.canScrollVertically(1) ? (iHeight - layoutManager.m2927E()) - layoutManager.m2924B() : 0;
            if (layoutManager.f5543b.canScrollHorizontally(1)) {
                iM2925C = (iWidth - layoutManager.m2925C()) - layoutManager.m2926D();
            } else {
                iM2925C = 0;
            }
        } else if (i10 != 8192) {
            iM2927E = 0;
            iM2925C = 0;
        } else {
            iM2927E = layoutManager.f5543b.canScrollVertically(-1) ? -((iHeight - layoutManager.m2927E()) - layoutManager.m2924B()) : 0;
            if (layoutManager.f5543b.canScrollHorizontally(-1)) {
                iM2925C = -((iWidth - layoutManager.m2925C()) - layoutManager.m2926D());
            } else {
                iM2925C = 0;
            }
        }
        if (iM2927E == 0 && iM2925C == 0) {
            return false;
        }
        layoutManager.f5543b.m12287i0(iM2925C, iM2927E, true);
        return true;
    }
}
