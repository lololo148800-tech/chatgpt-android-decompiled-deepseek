package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.p2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22045p2 {
    public static final C22041o2 Companion = new C22041o2();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f69731d = {null, EnumC22079y0.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f69732a;

    /* JADX INFO: renamed from: b */
    public final EnumC22079y0 f69733b;

    /* JADX INFO: renamed from: c */
    public final C22025k2 f69734c;

    public /* synthetic */ C22045p2(int i10, String str, EnumC22079y0 enumC22079y0, C22025k2 c22025k2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C22037n2.f69703a.getDescriptor());
            throw null;
        }
        this.f69732a = str;
        this.f69733b = enumC22079y0;
        this.f69734c = c22025k2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22045p2)) {
            return false;
        }
        C22045p2 c22045p2 = (C22045p2) obj;
        return AbstractC16544l.m18089b(this.f69732a, c22045p2.f69732a) && this.f69733b == c22045p2.f69733b && AbstractC16544l.m18089b(this.f69734c, c22045p2.f69734c);
    }

    public final int hashCode() {
        String str = this.f69732a;
        return this.f69734c.hashCode() + ((this.f69733b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
