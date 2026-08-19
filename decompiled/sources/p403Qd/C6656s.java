package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.s */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6656s extends AbstractC6659u {
    public static final C6654r Companion = new C6654r();

    /* JADX INFO: renamed from: c */
    public final C7351f0 f21421c;

    public /* synthetic */ C6656s(int i10, C7351f0 c7351f0) {
        if (1 == (i10 & 1)) {
            this.f21421c = c7351f0;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C6652q.f21417a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6656s) && AbstractC16544l.m18089b(this.f21421c, ((C6656s) obj).f21421c);
    }

    public final int hashCode() {
        return this.f21421c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6656s(C7351f0 c7351f0) {
        this.f21421c = c7351f0;
    }
}
