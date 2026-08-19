package p623Zf;

import ec.AbstractC13361c;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1149zc.C21841c;

/* JADX INFO: renamed from: Zf.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C10324t implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f30637a;

    /* JADX INFO: renamed from: b */
    public final boolean f30638b;

    /* JADX INFO: renamed from: c */
    public final boolean f30639c;

    /* JADX INFO: renamed from: d */
    public final C10310f f30640d;

    /* JADX INFO: renamed from: e */
    public final boolean f30641e;

    public C10324t(String str, boolean z6, boolean z10, C10310f c10310f, boolean z11) {
        this.f30637a = str;
        this.f30638b = z6;
        this.f30639c = z10;
        this.f30640d = c10310f;
        this.f30641e = z11;
    }

    /* JADX INFO: renamed from: e */
    public static C10324t m10881e(C10324t c10324t, boolean z6, boolean z10, C10310f c10310f, int i10) {
        String googleClientId = c10324t.f30637a;
        if ((i10 & 2) != 0) {
            z6 = c10324t.f30638b;
        }
        boolean z11 = z6;
        if ((i10 & 4) != 0) {
            z10 = c10324t.f30639c;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            c10310f = c10324t.f30640d;
        }
        boolean z13 = c10324t.f30641e;
        c10324t.getClass();
        AbstractC16544l.m18094g(googleClientId, "googleClientId");
        return new C10324t(googleClientId, z11, z12, c10310f, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10324t)) {
            return false;
        }
        C10324t c10324t = (C10324t) obj;
        return AbstractC16544l.m18089b(this.f30637a, c10324t.f30637a) && this.f30638b == c10324t.f30638b && this.f30639c == c10324t.f30639c && AbstractC16544l.m18089b(this.f30640d, c10324t.f30640d) && this.f30641e == c10324t.f30641e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10882f(AbstractC13361c abstractC13361c) {
        C10310f c10310f = this.f30640d;
        return AbstractC16544l.m18089b(c10310f != null ? c10310f.f30611a : null, abstractC13361c) || (abstractC13361c.equals(C21841c.f69307c) && this.f30639c);
    }

    public final int hashCode() {
        int iHashCode = ((((this.f30637a.hashCode() * 31) + (this.f30638b ? 1231 : 1237)) * 31) + (this.f30639c ? 1231 : 1237)) * 31;
        C10310f c10310f = this.f30640d;
        return ((iHashCode + (c10310f == null ? 0 : c10310f.hashCode())) * 31) + (this.f30641e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
