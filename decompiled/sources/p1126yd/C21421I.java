package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.I */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21421I implements InterfaceC21409C {
    public static final C21419H Companion = new C21419H();

    /* JADX INFO: renamed from: a */
    public final String f67992a;

    /* JADX INFO: renamed from: b */
    public final String f67993b;

    public C21421I(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21417G.f67986a.getDescriptor());
            throw null;
        }
        this.f67992a = str;
        this.f67993b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21421I)) {
            return false;
        }
        C21421I c21421i = (C21421I) obj;
        return AbstractC16544l.m18089b(this.f67992a, c21421i.f67992a) && AbstractC16544l.m18089b(this.f67993b, c21421i.f67993b);
    }

    public final int hashCode() {
        return this.f67993b.hashCode() + (this.f67992a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
