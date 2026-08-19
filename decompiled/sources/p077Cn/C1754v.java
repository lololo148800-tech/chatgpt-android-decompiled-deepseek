package p077Cn;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p025An.InterfaceC0586M0;
import p049Bm.InterfaceC1436k;
import p153Fn.AbstractC2923a;
import p437Rn.InterfaceC6948f;
import p571X9.AbstractC9221V;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Cn.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C1754v extends C1743k {

    /* JADX INFO: renamed from: y0 */
    public final EnumC1733a f5024y0;

    public C1754v(int i10, EnumC1733a enumC1733a, InterfaceC1436k interfaceC1436k) {
        super(i10, interfaceC1436k);
        this.f5024y0 = enumC1733a;
        if (enumC1733a != EnumC1733a.f4961Y) {
            if (i10 < 1) {
                throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC16526C.f51263a.mo5693b(C1743k.class).mo4448c() + " instead").toString());
        }
    }

    @Override // p077Cn.C1743k
    /* JADX INFO: renamed from: E */
    public final boolean mo2536E() {
        return this.f5024y0 == EnumC1733a.f4962Z;
    }

    /* JADX INFO: renamed from: Q */
    public final Object m2568Q(Object obj, boolean z6) {
        C1751s c1751s;
        InterfaceC1436k interfaceC1436k;
        C0644w c0644wM3728b;
        EnumC1733a enumC1733a = EnumC1733a.f4963o0;
        C17296C c17296c = C17296C.f55119a;
        if (this.f5024y0 == enumC1733a) {
            Object objMo2524p = super.mo2524p(obj);
            if (!(objMo2524p instanceof C1749q) || (objMo2524p instanceof C1748p)) {
                return objMo2524p;
            }
            if (!z6 || (interfaceC1436k = this.f4994Z) == null || (c0644wM3728b = AbstractC2923a.m3728b(interfaceC1436k, obj, null)) == null) {
                return c17296c;
            }
            throw c0644wM3728b;
        }
        InterfaceC6948f interfaceC6948f = AbstractC1745m.f5000d;
        C1751s c1751s2 = (C1751s) C1743k.f4988t0.get(this);
        while (true) {
            long andIncrement = C1743k.f4984p0.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM2534C = m2534C(andIncrement, false);
            int i10 = AbstractC1745m.f4998b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            if (c1751s2.f8804o0 != j12) {
                C1751s c1751sM2529a = C1743k.m2529a(this, j12, c1751s2);
                if (c1751sM2529a != null) {
                    c1751s = c1751sM2529a;
                } else if (zM2534C) {
                    return new C1748p(m2557z());
                }
            } else {
                c1751s = c1751s2;
            }
            int iM2532k = C1743k.m2532k(this, c1751s, i11, obj, j10, interfaceC6948f, zM2534C);
            if (iM2532k == 0) {
                c1751s.m3743a();
                return c17296c;
            }
            if (iM2532k == 1) {
                return c17296c;
            }
            if (iM2532k == 2) {
                if (zM2534C) {
                    c1751s.m3765i();
                    return new C1748p(m2557z());
                }
                InterfaceC0586M0 interfaceC0586M0 = interfaceC6948f instanceof InterfaceC0586M0 ? (InterfaceC0586M0) interfaceC6948f : null;
                if (interfaceC0586M0 != null) {
                    interfaceC0586M0.mo1212a(c1751s, i11 + i10);
                }
                m2552u((c1751s.f8804o0 * j11) + ((long) i11));
                return c17296c;
            }
            if (iM2532k == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM2532k == 4) {
                if (j10 < C1743k.f4985q0.get(this)) {
                    c1751s.m3743a();
                }
                return new C1748p(m2557z());
            }
            if (iM2532k == 5) {
                c1751s.m3743a();
            }
            c1751s2 = c1751s;
        }
    }

    @Override // p077Cn.C1743k, p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: o */
    public final Object mo2523o(Object obj, InterfaceC18770c interfaceC18770c) throws Throwable {
        C0644w c0644wM3728b;
        Object objM2568Q = m2568Q(obj, true);
        if (!(objM2568Q instanceof C1748p)) {
            return C17296C.f55119a;
        }
        C1750r.m2559a(objM2568Q);
        InterfaceC1436k interfaceC1436k = this.f4994Z;
        if (interfaceC1436k == null || (c0644wM3728b = AbstractC2923a.m3728b(interfaceC1436k, obj, null)) == null) {
            throw m2557z();
        }
        AbstractC9221V.m9789a(c0644wM3728b, m2557z());
        throw c0644wM3728b;
    }

    @Override // p077Cn.C1743k, p077Cn.InterfaceC1731C
    /* JADX INFO: renamed from: p */
    public final Object mo2524p(Object obj) {
        return m2568Q(obj, false);
    }
}
