package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.k0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21481k0 {
    public static final C21479j0 Companion = new C21479j0();

    /* JADX INFO: renamed from: a */
    public final String f68080a;

    /* JADX INFO: renamed from: b */
    public final boolean f68081b;

    public /* synthetic */ C21481k0(String str, int i10, boolean z6) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21477i0.f68078a.getDescriptor());
            throw null;
        }
        this.f68080a = str;
        this.f68081b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21481k0)) {
            return false;
        }
        C21481k0 c21481k0 = (C21481k0) obj;
        return AbstractC16544l.m18089b(this.f68080a, c21481k0.f68080a) && this.f68081b == c21481k0.f68081b;
    }

    public final int hashCode() {
        return (this.f68080a.hashCode() * 31) + (this.f68081b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
