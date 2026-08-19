package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.C */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6597C extends AbstractC6659u {
    public static final C6596B Companion = new C6596B();

    /* JADX INFO: renamed from: c */
    public final C7351f0 f21307c;

    public /* synthetic */ C6597C(int i10, C7351f0 c7351f0) {
        if (1 == (i10 & 1)) {
            this.f21307c = c7351f0;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C6595A.f21306a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6597C) && AbstractC16544l.m18089b(this.f21307c, ((C6597C) obj).f21307c);
    }

    public final int hashCode() {
        return this.f21307c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6597C(C7351f0 message) {
        AbstractC16544l.m18094g(message, "message");
        this.f21307c = message;
    }
}
