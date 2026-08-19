package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.U */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2791U extends AbstractC2841n {
    public static final C2782P Companion = new C2782P();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f8515d = {EnumC2787S.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC2787S f8516a;

    /* JADX INFO: renamed from: b */
    public final String f8517b;

    /* JADX INFO: renamed from: c */
    public final long f8518c;

    public C2791U(int i10, EnumC2787S enumC2787S, String str, long j10) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C2780O.f8498a.getDescriptor());
            throw null;
        }
        this.f8516a = enumC2787S;
        this.f8517b = str;
        if ((i10 & 4) == 0) {
            this.f8518c = System.currentTimeMillis();
        } else {
            this.f8518c = j10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2791U)) {
            return false;
        }
        C2791U c2791u = (C2791U) obj;
        return this.f8516a == c2791u.f8516a && AbstractC16544l.m18089b(this.f8517b, c2791u.f8517b) && this.f8518c == c2791u.f8518c;
    }

    public final int hashCode() {
        int iHashCode = this.f8516a.hashCode() * 31;
        String str = this.f8517b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f8518c;
        return ((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "█";
    }
}
