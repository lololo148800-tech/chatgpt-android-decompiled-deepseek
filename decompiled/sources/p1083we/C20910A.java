package p1083we;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: we.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C20910A {
    public static final C20935u Companion = new C20935u();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f66655d = {null, EnumC20938x.Companion.serializer(), EnumC20940z.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final String f66656a;

    /* JADX INFO: renamed from: b */
    public final EnumC20938x f66657b;

    /* JADX INFO: renamed from: c */
    public final EnumC20940z f66658c;

    public /* synthetic */ C20910A(int i10, String str, EnumC20938x enumC20938x, EnumC20940z enumC20940z) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C20934t.f66698a.getDescriptor());
            throw null;
        }
        this.f66656a = str;
        if ((i10 & 2) == 0) {
            this.f66657b = null;
        } else {
            this.f66657b = enumC20938x;
        }
        if ((i10 & 4) == 0) {
            this.f66658c = null;
        } else {
            this.f66658c = enumC20940z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20910A)) {
            return false;
        }
        C20910A c20910a = (C20910A) obj;
        return AbstractC16544l.m18089b(this.f66656a, c20910a.f66656a) && this.f66657b == c20910a.f66657b && this.f66658c == c20910a.f66658c;
    }

    public final int hashCode() {
        int iHashCode = this.f66656a.hashCode() * 31;
        EnumC20938x enumC20938x = this.f66657b;
        int iHashCode2 = (iHashCode + (enumC20938x == null ? 0 : enumC20938x.hashCode())) * 31;
        EnumC20940z enumC20940z = this.f66658c;
        return iHashCode2 + (enumC20940z != null ? enumC20940z.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
