package p871lf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: lf.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16937u {
    public static final C16936t Companion = new C16936t();

    /* JADX INFO: renamed from: a */
    public final String f54384a;

    /* JADX INFO: renamed from: b */
    public final boolean f54385b;

    public C16937u(String jawboneId, boolean z6) {
        AbstractC16544l.m18094g(jawboneId, "jawboneId");
        this.f54384a = jawboneId;
        this.f54385b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16937u)) {
            return false;
        }
        C16937u c16937u = (C16937u) obj;
        return AbstractC16544l.m18089b(this.f54384a, c16937u.f54384a) && this.f54385b == c16937u.f54385b;
    }

    public final int hashCode() {
        return (this.f54384a.hashCode() * 31) + (this.f54385b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C16937u(String str, int i10, boolean z6) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C16935s.f54383a.getDescriptor());
            throw null;
        }
        this.f54384a = str;
        this.f54385b = z6;
    }
}
