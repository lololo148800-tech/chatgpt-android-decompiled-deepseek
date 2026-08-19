package p851ka;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p001A.RunnableC0014H;
import p030B2.AbstractC0738T;
import p189Ha.AbstractC3276j;
import p544W9.AbstractC8752z3;
import p658b5.C11238i;
import p720e6.C13287b;

/* JADX INFO: renamed from: ka.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16364a extends AbstractC8752z3 {

    /* JADX INFO: renamed from: a */
    public int f50829a;

    /* JADX INFO: renamed from: b */
    public int f50830b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f50831c;

    public C16364a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f50831c = swipeDismissBehavior;
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: a */
    public final int mo3891a(View view, int i10) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        boolean z6 = view.getLayoutDirection() == 1;
        int i11 = this.f50831c.f36407e;
        if (i11 == 0) {
            if (z6) {
                width = this.f50829a - view.getWidth();
                width2 = this.f50829a;
            } else {
                width = this.f50829a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 != 1) {
            width = this.f50829a - view.getWidth();
            width2 = view.getWidth() + this.f50829a;
        } else if (z6) {
            width = this.f50829a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f50829a - view.getWidth();
            width2 = this.f50829a;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: b */
    public final int mo3892b(View view, int i10) {
        return view.getTop();
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: g */
    public final int mo3893g(View view) {
        return view.getWidth();
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: i */
    public final void mo9512i(View view, int i10) {
        this.f50830b = i10;
        this.f50829a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f50831c;
            swipeDismissBehavior.f36406d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f36406d = false;
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: j */
    public final void mo3895j(int i10) {
        C13287b c13287b = this.f50831c.f36404b;
        if (c13287b != null) {
            AbstractC3276j abstractC3276j = (AbstractC3276j) c13287b.f42000Z;
            if (i10 == 0) {
                C11238i.m12530k0().m12533B0(abstractC3276j.f9992w);
            } else if (i10 == 1 || i10 == 2) {
                C11238i.m12530k0().m12579x0(abstractC3276j.f9992w);
            }
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: k */
    public final void mo3896k(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f50831c;
        float f10 = width * swipeDismissBehavior.f36408f;
        float width2 = view.getWidth() * swipeDismissBehavior.f36409g;
        float fAbs = Math.abs(i10 - this.f50829a);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: l */
    public final void mo3897l(View view, float f10, float f11) {
        int i10;
        int left;
        int i11;
        C13287b c13287b;
        this.f50830b = -1;
        int width = view.getWidth();
        boolean z6 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f50831c;
        if (f10 != 0.0f) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = swipeDismissBehavior.f36407e;
            if (i12 != 2 && (i12 != 0 ? i12 != 1 || (!z10 ? f10 < 0.0f : f10 > 0.0f) : !z10 ? f10 > 0.0f : f10 < 0.0f)) {
                i10 = this.f50829a;
                z6 = false;
            } else if (f10 >= 0.0f) {
                left = view.getLeft();
                i11 = this.f50829a;
                if (left < i11) {
                    i10 = this.f50829a - width;
                } else {
                    i10 = i11 + width;
                }
            } else {
                i10 = this.f50829a - width;
            }
        } else {
            int left2 = view.getLeft() - this.f50829a;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
            if (Math.abs(left2) < Math.round(width2 * 0.5f)) {
                i10 = this.f50829a;
                z6 = false;
            } else if (f10 >= 0.0f) {
                left = view.getLeft();
                i11 = this.f50829a;
                if (left < i11) {
                    i10 = this.f50829a - width;
                } else {
                    i10 = i11 + width;
                }
            } else {
                i10 = this.f50829a - width;
            }
        }
        if (swipeDismissBehavior.f36403a.m5820o(i10, view.getTop())) {
            RunnableC0014H runnableC0014H = new RunnableC0014H(swipeDismissBehavior, view, z6);
            WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
            view.postOnAnimation(runnableC0014H);
        } else {
            if (!z6 || (c13287b = swipeDismissBehavior.f36404b) == null) {
                return;
            }
            c13287b.m14906n(view);
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: m */
    public final boolean mo3898m(View view, int i10) {
        int i11 = this.f50830b;
        return (i11 == -1 || i11 == i10) && this.f50831c.mo13582r(view);
    }
}
