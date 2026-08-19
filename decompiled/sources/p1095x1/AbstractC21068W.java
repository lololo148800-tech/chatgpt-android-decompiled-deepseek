package p1095x1;

import p049Bm.InterfaceC1436k;
import p1140z1.InterfaceC21673T;
import p492U1.C7543h;
import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;
import p843k1.C16308b;

/* JADX INFO: renamed from: x1.W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21068W {

    /* JADX INFO: renamed from: a */
    public boolean f66980a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m21535a(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X) {
        abstractC21068W.getClass();
        if (abstractC21069X instanceof InterfaceC21673T) {
            ((InterfaceC21673T) abstractC21069X).mo22084C(abstractC21068W.f66980a);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m21537f(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X, long j10) {
        abstractC21068W.getClass();
        m21535a(abstractC21068W, abstractC21069X);
        abstractC21069X.mo21551N(C7543h.m7882d(j10, abstractC21069X.f66985q0), 0.0f, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m21539i(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X, long j10) {
        if (abstractC21068W.mo21514b() == EnumC7546k.f23904Y || abstractC21068W.mo21515c() == 0) {
            m21535a(abstractC21068W, abstractC21069X);
            abstractC21069X.mo21551N(C7543h.m7882d(j10, abstractC21069X.f66985q0), 0.0f, null);
        } else {
            long jM9631a = AbstractC9101A4.m9631a((abstractC21068W.mo21515c() - abstractC21069X.f66981Y) - ((int) (j10 >> 32)), (int) (j10 & 4294967295L));
            m21535a(abstractC21068W, abstractC21069X);
            abstractC21069X.mo21551N(C7543h.m7882d(jM9631a, abstractC21069X.f66985q0), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m21540j(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X, int i10, int i11) {
        int i12 = AbstractC21070Y.f66987b;
        C21101v c21101v = C21101v.f67030o0;
        long jM9631a = AbstractC9101A4.m9631a(i10, i11);
        if (abstractC21068W.mo21514b() == EnumC7546k.f23904Y || abstractC21068W.mo21515c() == 0) {
            m21535a(abstractC21068W, abstractC21069X);
            abstractC21069X.mo21551N(C7543h.m7882d(jM9631a, abstractC21069X.f66985q0), 0.0f, c21101v);
        } else {
            long jM9631a2 = AbstractC9101A4.m9631a((abstractC21068W.mo21515c() - abstractC21069X.f66981Y) - ((int) (jM9631a >> 32)), (int) (jM9631a & 4294967295L));
            m21535a(abstractC21068W, abstractC21069X);
            abstractC21069X.mo21551N(C7543h.m7882d(jM9631a2, abstractC21069X.f66985q0), 0.0f, c21101v);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m21541k(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X, long j10) {
        int i10 = AbstractC21070Y.f66987b;
        C21101v c21101v = C21101v.f67030o0;
        if (abstractC21068W.mo21514b() == EnumC7546k.f23904Y || abstractC21068W.mo21515c() == 0) {
            m21535a(abstractC21068W, abstractC21069X);
            abstractC21069X.mo21551N(C7543h.m7882d(j10, abstractC21069X.f66985q0), 0.0f, c21101v);
        } else {
            long jM9631a = AbstractC9101A4.m9631a((abstractC21068W.mo21515c() - abstractC21069X.f66981Y) - ((int) (j10 >> 32)), (int) (j10 & 4294967295L));
            m21535a(abstractC21068W, abstractC21069X);
            abstractC21069X.mo21551N(C7543h.m7882d(jM9631a, abstractC21069X.f66985q0), 0.0f, c21101v);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m21542l(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X, long j10, C16308b c16308b) {
        if (abstractC21068W.mo21514b() == EnumC7546k.f23904Y || abstractC21068W.mo21515c() == 0) {
            m21535a(abstractC21068W, abstractC21069X);
            abstractC21069X.mo21552Q(C7543h.m7882d(j10, abstractC21069X.f66985q0), 0.0f, c16308b);
        } else {
            long jM9631a = AbstractC9101A4.m9631a((abstractC21068W.mo21515c() - abstractC21069X.f66981Y) - ((int) (j10 >> 32)), (int) (j10 & 4294967295L));
            m21535a(abstractC21068W, abstractC21069X);
            abstractC21069X.mo21552Q(C7543h.m7882d(jM9631a, abstractC21069X.f66985q0), 0.0f, c16308b);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m21543m(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X, int i10, int i11, InterfaceC1436k interfaceC1436k, int i12) {
        if ((i12 & 8) != 0) {
            int i13 = AbstractC21070Y.f66987b;
            interfaceC1436k = C21101v.f67030o0;
        }
        abstractC21068W.getClass();
        long jM9631a = AbstractC9101A4.m9631a(i10, i11);
        m21535a(abstractC21068W, abstractC21069X);
        abstractC21069X.mo21551N(C7543h.m7882d(jM9631a, abstractC21069X.f66985q0), 0.0f, interfaceC1436k);
    }

    /* JADX INFO: renamed from: n */
    public static void m21544n(AbstractC21068W abstractC21068W, AbstractC21069X abstractC21069X, long j10) {
        int i10 = AbstractC21070Y.f66987b;
        C21101v c21101v = C21101v.f67030o0;
        abstractC21068W.getClass();
        m21535a(abstractC21068W, abstractC21069X);
        abstractC21069X.mo21551N(C7543h.m7882d(j10, abstractC21069X.f66985q0), 0.0f, c21101v);
    }

    /* JADX INFO: renamed from: b */
    public abstract EnumC7546k mo21514b();

    /* JADX INFO: renamed from: c */
    public abstract int mo21515c();

    /* JADX INFO: renamed from: d */
    public final void m21545d(AbstractC21069X abstractC21069X, int i10, int i11, float f10) {
        long jM9631a = AbstractC9101A4.m9631a(i10, i11);
        m21535a(this, abstractC21069X);
        abstractC21069X.mo21551N(C7543h.m7882d(jM9631a, abstractC21069X.f66985q0), f10, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m21546g(AbstractC21069X abstractC21069X, int i10, int i11, float f10) {
        long jM9631a = AbstractC9101A4.m9631a(i10, i11);
        if (mo21514b() == EnumC7546k.f23904Y || mo21515c() == 0) {
            m21535a(this, abstractC21069X);
            abstractC21069X.mo21551N(C7543h.m7882d(jM9631a, abstractC21069X.f66985q0), f10, null);
        } else {
            long jM9631a2 = AbstractC9101A4.m9631a((mo21515c() - abstractC21069X.f66981Y) - ((int) (jM9631a >> 32)), (int) (jM9631a & 4294967295L));
            m21535a(this, abstractC21069X);
            abstractC21069X.mo21551N(C7543h.m7882d(jM9631a2, abstractC21069X.f66985q0), f10, null);
        }
    }
}
