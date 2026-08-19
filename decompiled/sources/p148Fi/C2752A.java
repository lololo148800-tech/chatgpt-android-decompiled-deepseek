package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p040Bd.C1026X1;
import p040Bd.C1032Y1;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2752A extends AbstractC2841n {
    public static final C2865z Companion = new C2865z();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f8437c;

    /* JADX INFO: renamed from: a */
    public final EnumC2753A0 f8438a;

    /* JADX INFO: renamed from: b */
    public final C1032Y1 f8439b;

    static {
        C1026X1 c1026x1 = C1032Y1.Companion;
        f8437c = new KSerializer[]{EnumC2753A0.Companion.serializer(), null};
    }

    public C2752A(int i10, EnumC2753A0 enumC2753A0, C1032Y1 c1032y1) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C2863y.f8635a.getDescriptor());
            throw null;
        }
        this.f8438a = enumC2753A0;
        if ((i10 & 2) == 0) {
            this.f8439b = null;
        } else {
            this.f8439b = c1032y1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2752A)) {
            return false;
        }
        C2752A c2752a = (C2752A) obj;
        return this.f8438a == c2752a.f8438a && AbstractC16544l.m18089b(this.f8439b, c2752a.f8439b);
    }

    public final int hashCode() {
        int iHashCode = this.f8438a.hashCode() * 31;
        C1032Y1 c1032y1 = this.f8439b;
        return iHashCode + (c1032y1 == null ? 0 : c1032y1.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C2752A(C1032Y1 c1032y1) {
        this.f8438a = EnumC2753A0.f8444r0;
        this.f8439b = c1032y1;
    }
}
