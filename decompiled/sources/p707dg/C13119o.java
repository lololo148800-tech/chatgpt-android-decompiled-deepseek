package p707dg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: dg.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13119o {
    public static final C13118n Companion = new C13118n();

    /* JADX INFO: renamed from: a */
    public final String f41641a;

    public /* synthetic */ C13119o(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f41641a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C13117m.f41640a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13119o) && AbstractC16544l.m18089b(this.f41641a, ((C13119o) obj).f41641a);
    }

    public final int hashCode() {
        String str = this.f41641a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C13119o(String str) {
        this.f41641a = str;
    }
}
