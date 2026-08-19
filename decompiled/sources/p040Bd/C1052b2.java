package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.b2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1052b2 {
    public static final C1045a2 Companion = new C1045a2();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f2877c = {EnumC1066d2.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final EnumC1066d2 f2878a;

    /* JADX INFO: renamed from: b */
    public final String f2879b;

    public /* synthetic */ C1052b2(int i10, EnumC1066d2 enumC1066d2, String str) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C1038Z1.f2865a.getDescriptor());
            throw null;
        }
        this.f2878a = enumC1066d2;
        if ((i10 & 2) == 0) {
            this.f2879b = null;
        } else {
            this.f2879b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1052b2)) {
            return false;
        }
        C1052b2 c1052b2 = (C1052b2) obj;
        return this.f2878a == c1052b2.f2878a && AbstractC16544l.m18089b(this.f2879b, c1052b2.f2879b);
    }

    public final int hashCode() {
        int iHashCode = this.f2878a.hashCode() * 31;
        String str = this.f2879b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C1052b2(EnumC1066d2 enumC1066d2, String str) {
        this.f2878a = enumC1066d2;
        this.f2879b = str;
    }
}
