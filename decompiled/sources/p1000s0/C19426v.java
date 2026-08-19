package p1000s0;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0178J0;
import p013Ab.C0420b;
import p293Lh.C5062h;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p953q0.AbstractC18551I;
import p953q0.InterfaceC18554L;

/* JADX INFO: renamed from: s0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C19426v implements InterfaceC18554L {

    /* JADX INFO: renamed from: a */
    public final C19408d f61572a;

    /* JADX INFO: renamed from: b */
    public final C19425u f61573b;

    /* JADX INFO: renamed from: c */
    public final C0420b f61574c;

    public C19426v(C19408d c19408d, C19425u c19425u, C0420b c0420b) {
        this.f61572a = c19408d;
        this.f61573b = c19425u;
        this.f61574c = c0420b;
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: a */
    public final int mo5910a(Object obj) {
        return this.f61574c.mo1046a(obj);
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: b */
    public final int mo5911b() {
        return this.f61573b.mo19801k().f1381Z;
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: c */
    public final Object mo5912c(int i10) {
        Object objM1064t = this.f61574c.m1064t(i10);
        return objM1064t == null ? this.f61573b.m19932l(i10) : objM1064t;
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo5913d(int i10) {
        return null;
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: e */
    public final void mo5914e(int i10, Object obj, C6021p c6021p, int i11) {
        int i12;
        c6021p.m6526U(-1201380429);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6538d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6545h(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6542f(this) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC18551I.m19922c(obj, i10, this.f61572a.f61463z, AbstractC8411c.m8969c(1142237095, c6021p, new C0178J0(this, i10, 29)), c6021p, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(i10, i11, 10, this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19426v)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f61573b, ((C19426v) obj).f61573b);
    }

    public final int hashCode() {
        return this.f61573b.hashCode();
    }
}
