package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p067Cd.C1629c;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.S */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21440S implements InterfaceC21409C {
    public static final C21437Q Companion = new C21437Q();

    /* JADX INFO: renamed from: a */
    public final String f68008a;

    /* JADX INFO: renamed from: b */
    public final String f68009b;

    /* JADX INFO: renamed from: c */
    public final boolean f68010c;

    /* JADX INFO: renamed from: d */
    public final C1629c f68011d;

    public C21440S(int i10, String str, String str2, boolean z6, C1629c c1629c) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C21435P.f68005a.getDescriptor());
            throw null;
        }
        this.f68008a = str;
        this.f68009b = str2;
        this.f68010c = z6;
        this.f68011d = c1629c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21440S)) {
            return false;
        }
        C21440S c21440s = (C21440S) obj;
        return AbstractC16544l.m18089b(this.f68008a, c21440s.f68008a) && AbstractC16544l.m18089b(this.f68009b, c21440s.f68009b) && this.f68010c == c21440s.f68010c && AbstractC16544l.m18089b(this.f68011d, c21440s.f68011d);
    }

    public final int hashCode() {
        return this.f68011d.hashCode() + ((AbstractC0168G.m527p(this.f68008a.hashCode() * 31, 31, this.f68009b) + (this.f68010c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
