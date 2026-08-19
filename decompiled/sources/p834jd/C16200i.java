package p834jd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: jd.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16200i extends AbstractC16201j {
    public static final C16199h Companion = new C16199h();

    /* JADX INFO: renamed from: b */
    public final String f50277b;

    public C16200i(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f50277b = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C16198g.f50276a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16200i) {
            return AbstractC16544l.m18089b(this.f50277b, ((C16200i) obj).f50277b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50277b.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C16200i(String str) {
        this.f50277b = str;
    }
}
