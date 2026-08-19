package p672c3;

import kotlin.jvm.internal.AbstractC16544l;
import p637a3.C10495l;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: c3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C11570E {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10497n f34971a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n f34972b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C11570E(InterfaceC10497n interfaceC10497n, int i10) {
        C10495l c10495l = C10495l.f31097a;
        this(c10495l, (i10 & 2) != 0 ? c10495l : interfaceC10497n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11570E)) {
            return false;
        }
        C11570E c11570e = (C11570E) obj;
        return AbstractC16544l.m18089b(this.f34971a, c11570e.f34971a) && AbstractC16544l.m18089b(this.f34972b, c11570e.f34972b);
    }

    public final int hashCode() {
        return this.f34972b.hashCode() + (this.f34971a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.f34971a + ", nonSizeModifiers=" + this.f34972b + ')';
    }

    public C11570E(InterfaceC10497n interfaceC10497n, InterfaceC10497n interfaceC10497n2) {
        this.f34971a = interfaceC10497n;
        this.f34972b = interfaceC10497n2;
    }
}
