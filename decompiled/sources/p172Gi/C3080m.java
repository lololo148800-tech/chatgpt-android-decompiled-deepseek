package p172Gi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Gi.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3080m {
    public static final C3079l Companion = new C3079l();

    /* JADX INFO: renamed from: a */
    public final String f9283a;

    /* JADX INFO: renamed from: b */
    public final String f9284b;

    public /* synthetic */ C3080m(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C3078k.f9282a.getDescriptor());
            throw null;
        }
        this.f9283a = str;
        this.f9284b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3080m)) {
            return false;
        }
        C3080m c3080m = (C3080m) obj;
        return AbstractC16544l.m18089b(this.f9283a, c3080m.f9283a) && AbstractC16544l.m18089b(this.f9284b, c3080m.f9284b);
    }

    public final int hashCode() {
        return this.f9284b.hashCode() + (this.f9283a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
