package p084D4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: D4.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1890N extends AbstractC1903a0 {

    /* JADX INFO: renamed from: a */
    public RecyclerView f5522a;

    /* JADX INFO: renamed from: b */
    public final C1939s0 f5523b = new C1939s0(this);

    /* JADX INFO: renamed from: c */
    public C1887K f5524c;

    /* JADX INFO: renamed from: d */
    public C1887K f5525d;

    /* JADX INFO: renamed from: b */
    public static int m2892b(View view, AbstractC1888L abstractC1888L) {
        return ((abstractC1888L.mo2877c(view) / 2) + abstractC1888L.mo2879e(view)) - ((abstractC1888L.mo2886l() / 2) + abstractC1888L.mo2885k());
    }

    /* JADX INFO: renamed from: c */
    public static View m2893c(AbstractC1900Y abstractC1900Y, AbstractC1888L abstractC1888L) {
        int iM2985v = abstractC1900Y.m2985v();
        View view = null;
        if (iM2985v == 0) {
            return null;
        }
        int iMo2886l = (abstractC1888L.mo2886l() / 2) + abstractC1888L.mo2885k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iM2985v; i11++) {
            View viewM2983u = abstractC1900Y.m2983u(i11);
            int iAbs = Math.abs(((abstractC1888L.mo2877c(viewM2983u) / 2) + abstractC1888L.mo2879e(viewM2983u)) - iMo2886l);
            if (iAbs < i10) {
                view = viewM2983u;
                i10 = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m2894a(AbstractC1900Y abstractC1900Y, View view) {
        int[] iArr = new int[2];
        if (abstractC1900Y.mo2950d()) {
            iArr[0] = m2892b(view, m2895d(abstractC1900Y));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1900Y.mo2952e()) {
            iArr[1] = m2892b(view, m2896e(abstractC1900Y));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1888L m2895d(AbstractC1900Y abstractC1900Y) {
        C1887K c1887k = this.f5525d;
        if (c1887k == null || ((AbstractC1900Y) c1887k.f5518b) != abstractC1900Y) {
            this.f5525d = new C1887K(abstractC1900Y, 0);
        }
        return this.f5525d;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC1888L m2896e(AbstractC1900Y abstractC1900Y) {
        C1887K c1887k = this.f5524c;
        if (c1887k == null || ((AbstractC1900Y) c1887k.f5518b) != abstractC1900Y) {
            this.f5524c = new C1887K(abstractC1900Y, 1);
        }
        return this.f5524c;
    }

    /* JADX INFO: renamed from: f */
    public final void m2897f() {
        AbstractC1900Y layoutManager;
        View viewM2893c;
        RecyclerView recyclerView = this.f5522a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.mo2952e()) {
            viewM2893c = m2893c(layoutManager, m2896e(layoutManager));
        } else {
            viewM2893c = layoutManager.mo2950d() ? m2893c(layoutManager, m2895d(layoutManager)) : null;
        }
        if (viewM2893c == null) {
            return;
        }
        int[] iArrM2894a = m2894a(layoutManager, viewM2893c);
        int i10 = iArrM2894a[0];
        if (i10 == 0 && iArrM2894a[1] == 0) {
            return;
        }
        this.f5522a.m12287i0(i10, iArrM2894a[1], false);
    }
}
