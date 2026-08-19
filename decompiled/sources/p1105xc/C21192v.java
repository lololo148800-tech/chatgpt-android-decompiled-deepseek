package p1105xc;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: xc.v */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21192v {
    public static final C21191u Companion = new C21191u();

    /* JADX INFO: renamed from: a */
    public final String f67356a;

    /* JADX INFO: renamed from: b */
    public final String f67357b;

    public /* synthetic */ C21192v(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21190t.f67355a.getDescriptor());
            throw null;
        }
        this.f67356a = str;
        this.f67357b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21192v)) {
            return false;
        }
        C21192v c21192v = (C21192v) obj;
        return AbstractC16544l.m18089b(this.f67356a, c21192v.f67356a) && AbstractC16544l.m18089b(this.f67357b, c21192v.f67357b);
    }

    public final int hashCode() {
        return this.f67357b.hashCode() + (this.f67356a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
