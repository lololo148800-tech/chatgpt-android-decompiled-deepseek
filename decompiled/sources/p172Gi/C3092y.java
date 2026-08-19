package p172Gi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.EnumC22033m2;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Gi.y */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3092y {
    public static final C3091x Companion = new C3091x();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f9302c = {EnumC22033m2.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final EnumC22033m2 f9303a;

    /* JADX INFO: renamed from: b */
    public final String f9304b;

    public /* synthetic */ C3092y(int i10, EnumC22033m2 enumC22033m2, String str) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C3090w.f9301a.getDescriptor());
            throw null;
        }
        this.f9303a = enumC22033m2;
        if ((i10 & 2) == 0) {
            this.f9304b = null;
        } else {
            this.f9304b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3092y)) {
            return false;
        }
        C3092y c3092y = (C3092y) obj;
        return this.f9303a == c3092y.f9303a && AbstractC16544l.m18089b(this.f9304b, c3092y.f9304b);
    }

    public final int hashCode() {
        int iHashCode = this.f9303a.hashCode() * 31;
        String str = this.f9304b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
