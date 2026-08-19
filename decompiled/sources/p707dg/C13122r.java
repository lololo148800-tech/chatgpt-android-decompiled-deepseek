package p707dg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: dg.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13122r {
    public static final C13121q Companion = new C13121q();

    /* JADX INFO: renamed from: a */
    public final String f41643a;

    /* JADX INFO: renamed from: b */
    public final String f41644b;

    public /* synthetic */ C13122r(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C13120p.f41642a.getDescriptor());
            throw null;
        }
        this.f41643a = str;
        this.f41644b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13122r)) {
            return false;
        }
        C13122r c13122r = (C13122r) obj;
        return AbstractC16544l.m18089b(this.f41643a, c13122r.f41643a) && AbstractC16544l.m18089b(this.f41644b, c13122r.f41644b);
    }

    public final int hashCode() {
        return this.f41644b.hashCode() + (this.f41643a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C13122r(String email, String code) {
        AbstractC16544l.m18094g(email, "email");
        AbstractC16544l.m18094g(code, "code");
        this.f41643a = email;
        this.f41644b = code;
    }
}
