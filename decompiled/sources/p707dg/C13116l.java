package p707dg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: dg.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13116l {
    public static final C13115k Companion = new C13115k();

    /* JADX INFO: renamed from: a */
    public final String f41638a;

    /* JADX INFO: renamed from: b */
    public final String f41639b;

    public /* synthetic */ C13116l(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C13114j.f41637a.getDescriptor());
            throw null;
        }
        this.f41638a = str;
        this.f41639b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13116l)) {
            return false;
        }
        C13116l c13116l = (C13116l) obj;
        return AbstractC16544l.m18089b(this.f41638a, c13116l.f41638a) && AbstractC16544l.m18089b(this.f41639b, c13116l.f41639b);
    }

    public final int hashCode() {
        return this.f41639b.hashCode() + (this.f41638a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C13116l(String email) {
        AbstractC16544l.m18094g(email, "email");
        this.f41638a = "dBPYPHX8xGTuepNhXZJCycwsystDsw7Y";
        this.f41639b = email;
    }
}
