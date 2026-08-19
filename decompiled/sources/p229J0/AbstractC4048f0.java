package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import p302M0.AbstractC5261m;
import p302M0.AbstractC5271w;
import p349O0.C6021p;
import p774h1.C14365u;
import p911o0.C17767k0;

/* JADX INFO: renamed from: J0.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4048f0 {

    /* JADX INFO: renamed from: a */
    public static final C17767k0 f12769a;

    /* JADX INFO: renamed from: b */
    public static final C17767k0 f12770b;

    /* JADX INFO: renamed from: c */
    public static final float f12771c;

    /* JADX INFO: renamed from: d */
    public static final float f12772d;

    static {
        float f10 = 24;
        float f11 = 8;
        f12769a = new C17767k0(f10, f11, f10, f11);
        float f12 = 16;
        AbstractC10842a.m11224b(f12, f11, f10, f11);
        float f13 = 12;
        f12770b = new C17767k0(f13, f11, f13, f11);
        AbstractC10842a.m11224b(f13, f11, f12, f11);
        f12771c = 58;
        f12772d = 40;
        float f14 = AbstractC5261m.f17227a;
    }

    /* JADX INFO: renamed from: a */
    public static C4042e0 m4732a(C6021p c6021p) {
        return m4734c((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a));
    }

    /* JADX INFO: renamed from: b */
    public static C4042e0 m4733b(long j10, long j11, C6021p c6021p, int i10) {
        if ((i10 & 2) != 0) {
            j11 = C14365u.f45060j;
        }
        long j12 = j11;
        long j13 = C14365u.f45060j;
        return m4734c((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).m4731a(j10, j12, j13, j13);
    }

    /* JADX INFO: renamed from: c */
    public static C4042e0 m4734c(C3949M0 c3949m0) {
        C4042e0 c4042e0 = c3949m0.f12197K;
        if (c4042e0 != null) {
            return c4042e0;
        }
        float f10 = AbstractC5261m.f17227a;
        C4042e0 c4042e1 = new C4042e0(AbstractC3959O0.m4661c(c3949m0, 26), AbstractC3959O0.m4661c(c3949m0, AbstractC5261m.f17234h), C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, AbstractC5261m.f17229c)), C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, AbstractC5261m.f17231e)));
        c3949m0.f12197K = c4042e1;
        return c4042e1;
    }

    /* JADX INFO: renamed from: d */
    public static C4042e0 m4735d(C3949M0 c3949m0) {
        C4042e0 c4042e0 = c3949m0.f12200N;
        if (c4042e0 != null) {
            return c4042e0;
        }
        long j10 = C14365u.f45059i;
        C4042e0 c4042e1 = new C4042e0(j10, AbstractC3959O0.m4661c(c3949m0, 26), j10, C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)));
        c3949m0.f12200N = c4042e1;
        return c4042e1;
    }

    /* JADX INFO: renamed from: e */
    public static C4042e0 m4736e(C6021p c6021p) {
        C3949M0 c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
        C4042e0 c4042e0 = c3949m0.f12199M;
        if (c4042e0 != null) {
            return c4042e0;
        }
        long j10 = C14365u.f45059i;
        float f10 = AbstractC5271w.f17295a;
        C4042e0 c4042e1 = new C4042e0(j10, AbstractC3959O0.m4661c(c3949m0, 26), j10, C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18)));
        c3949m0.f12199M = c4042e1;
        return c4042e1;
    }

    /* JADX INFO: renamed from: f */
    public static C4042e0 m4737f(long j10, C6021p c6021p) {
        long j11 = C14365u.f45060j;
        return m4735d((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).m4731a(j11, j10, j11, j11);
    }
}
