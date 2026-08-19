package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.y2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22081y2 {
    public static final C22077x2 Companion = new C22077x2();

    /* JADX INFO: renamed from: i */
    public static final KSerializer[] f69801i = {null, EnumC22033m2.Companion.serializer(), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f69802a;

    /* JADX INFO: renamed from: b */
    public final EnumC22033m2 f69803b;

    /* JADX INFO: renamed from: c */
    public final C22045p2 f69804c;

    /* JADX INFO: renamed from: d */
    public final C22057s2 f69805d;

    /* JADX INFO: renamed from: e */
    public final C22057s2 f69806e;

    /* JADX INFO: renamed from: f */
    public final String f69807f;

    /* JADX INFO: renamed from: g */
    public final String f69808g;

    /* JADX INFO: renamed from: h */
    public final C22069v2 f69809h;

    public /* synthetic */ C22081y2(int i10, String str, EnumC22033m2 enumC22033m2, C22045p2 c22045p2, C22057s2 c22057s2, C22057s2 c22057s3, String str2, String str3, C22069v2 c22069v2) {
        if (127 != (i10 & 127)) {
            AbstractC11153a0.m12389l(i10, 127, C22073w2.f69788a.getDescriptor());
            throw null;
        }
        this.f69802a = str;
        this.f69803b = enumC22033m2;
        this.f69804c = c22045p2;
        this.f69805d = c22057s2;
        this.f69806e = c22057s3;
        this.f69807f = str2;
        this.f69808g = str3;
        if ((i10 & 128) == 0) {
            this.f69809h = null;
        } else {
            this.f69809h = c22069v2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22081y2)) {
            return false;
        }
        C22081y2 c22081y2 = (C22081y2) obj;
        return AbstractC16544l.m18089b(this.f69802a, c22081y2.f69802a) && this.f69803b == c22081y2.f69803b && AbstractC16544l.m18089b(this.f69804c, c22081y2.f69804c) && AbstractC16544l.m18089b(this.f69805d, c22081y2.f69805d) && AbstractC16544l.m18089b(this.f69806e, c22081y2.f69806e) && AbstractC16544l.m18089b(this.f69807f, c22081y2.f69807f) && AbstractC16544l.m18089b(this.f69808g, c22081y2.f69808g) && AbstractC16544l.m18089b(this.f69809h, c22081y2.f69809h);
    }

    public final int hashCode() {
        int iHashCode = (this.f69803b.hashCode() + (this.f69802a.hashCode() * 31)) * 31;
        C22045p2 c22045p2 = this.f69804c;
        int iHashCode2 = (iHashCode + (c22045p2 == null ? 0 : c22045p2.hashCode())) * 31;
        C22057s2 c22057s2 = this.f69805d;
        int iHashCode3 = (iHashCode2 + (c22057s2 == null ? 0 : c22057s2.hashCode())) * 31;
        C22057s2 c22057s3 = this.f69806e;
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p((iHashCode3 + (c22057s3 == null ? 0 : c22057s3.hashCode())) * 31, 31, this.f69807f), 31, this.f69808g);
        C22069v2 c22069v2 = this.f69809h;
        return iM527p + (c22069v2 != null ? c22069v2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
