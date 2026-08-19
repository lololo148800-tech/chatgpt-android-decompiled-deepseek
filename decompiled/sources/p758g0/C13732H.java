package p758g0;

import com.google.protobuf.AbstractC12107L1;
import p232J3.C4249u;

/* JADX INFO: renamed from: g0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C13732H implements InterfaceC13772l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13797y f43301a;

    /* JADX INFO: renamed from: b */
    public final int f43302b;

    /* JADX INFO: renamed from: c */
    public final long f43303c;

    public C13732H(InterfaceC13797y interfaceC13797y, int i10, long j10) {
        this.f43301a = interfaceC13797y;
        this.f43302b = i10;
        this.f43303c = j10;
    }

    @Override // p758g0.InterfaceC13772l
    /* JADX INFO: renamed from: a */
    public final InterfaceC13787s0 mo15214a(C13783q0 c13783q0) {
        return new C4249u(this.f43301a.mo15214a(c13783q0), this.f43302b, this.f43303c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13732H)) {
            return false;
        }
        C13732H c13732h = (C13732H) obj;
        if (c13732h.f43301a.equals(this.f43301a) && c13732h.f43302b == this.f43302b) {
            return c13732h.f43303c == this.f43303c;
        }
        return false;
    }

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f43302b, this.f43301a.hashCode() * 31, 31);
        long j10 = this.f43303c;
        return iM13820k + ((int) (j10 ^ (j10 >>> 32)));
    }
}
