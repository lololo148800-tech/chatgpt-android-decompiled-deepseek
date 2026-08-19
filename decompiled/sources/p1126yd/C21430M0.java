package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.M0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21430M0 extends AbstractC21504w {
    public static final C21428L0 Companion = new C21428L0();

    /* JADX INFO: renamed from: a */
    public final String f68001a;

    public C21430M0(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f68001a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C21426K0.f67998a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21430M0) && AbstractC16544l.m18089b(this.f68001a, ((C21430M0) obj).f68001a);
    }

    public final int hashCode() {
        return this.f68001a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
