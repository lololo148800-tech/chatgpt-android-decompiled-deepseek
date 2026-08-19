package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.Y1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1032Y1 {
    public static final C1026X1 Companion = new C1026X1();

    /* JADX INFO: renamed from: j */
    public static final KSerializer[] f2849j = {null, null, null, null, null, EnumC1101i2.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f2850a;

    /* JADX INFO: renamed from: b */
    public final C1052b2 f2851b;

    /* JADX INFO: renamed from: c */
    public final C1121l2 f2852c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1136o f2853d;

    /* JADX INFO: renamed from: e */
    public final C5551u f2854e;

    /* JADX INFO: renamed from: f */
    public final EnumC1101i2 f2855f;

    /* JADX INFO: renamed from: g */
    public final Boolean f2856g;

    /* JADX INFO: renamed from: h */
    public final String f2857h;

    /* JADX INFO: renamed from: i */
    public final C1087g2 f2858i;

    public C1032Y1(int i10, String str, C1052b2 c1052b2, C1121l2 c1121l2, InterfaceC1136o interfaceC1136o, C5551u c5551u, EnumC1101i2 enumC1101i2, Boolean bool, String str2, C1087g2 c1087g2) {
        if (11 != (i10 & 11)) {
            AbstractC11153a0.m12389l(i10, 11, C1020W1.f2828a.getDescriptor());
            throw null;
        }
        this.f2850a = str;
        this.f2851b = c1052b2;
        if ((i10 & 4) == 0) {
            this.f2852c = null;
        } else {
            this.f2852c = c1121l2;
        }
        this.f2853d = interfaceC1136o;
        if ((i10 & 16) == 0) {
            this.f2854e = null;
        } else {
            this.f2854e = c5551u;
        }
        this.f2855f = (i10 & 32) == 0 ? EnumC1101i2.f3001Z : enumC1101i2;
        if ((i10 & 64) == 0) {
            this.f2856g = null;
        } else {
            this.f2856g = bool;
        }
        if ((i10 & 128) == 0) {
            this.f2857h = null;
        } else {
            this.f2857h = str2;
        }
        this.f2858i = (i10 & 256) == 0 ? new C1087g2(null, null, null, null, null, null, false, -1, 15) : c1087g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1032Y1)) {
            return false;
        }
        C1032Y1 c1032y1 = (C1032Y1) obj;
        return AbstractC16544l.m18089b(this.f2850a, c1032y1.f2850a) && AbstractC16544l.m18089b(this.f2851b, c1032y1.f2851b) && AbstractC16544l.m18089b(this.f2852c, c1032y1.f2852c) && AbstractC16544l.m18089b(this.f2853d, c1032y1.f2853d) && AbstractC16544l.m18089b(this.f2854e, c1032y1.f2854e) && this.f2855f == c1032y1.f2855f && AbstractC16544l.m18089b(this.f2856g, c1032y1.f2856g) && AbstractC16544l.m18089b(this.f2857h, c1032y1.f2857h) && AbstractC16544l.m18089b(this.f2858i, c1032y1.f2858i);
    }

    public final int hashCode() {
        int iHashCode = (this.f2851b.hashCode() + (this.f2850a.hashCode() * 31)) * 31;
        C1121l2 c1121l2 = this.f2852c;
        int iHashCode2 = (this.f2853d.hashCode() + ((iHashCode + (c1121l2 == null ? 0 : c1121l2.f3034a.hashCode())) * 31)) * 31;
        C5551u c5551u = this.f2854e;
        int iHashCode3 = (this.f2855f.hashCode() + ((iHashCode2 + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31)) * 31;
        Boolean bool = this.f2856g;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f2857h;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        C1087g2 c1087g2 = this.f2858i;
        return iHashCode5 + (c1087g2 != null ? c1087g2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1032Y1(String id2, C1052b2 c1052b2, InterfaceC1136o content, C5551u c5551u, String str, C1087g2 c1087g2) {
        EnumC1101i2 enumC1101i2 = EnumC1101i2.f3001Z;
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(content, "content");
        this.f2850a = id2;
        this.f2851b = c1052b2;
        this.f2852c = null;
        this.f2853d = content;
        this.f2854e = c5551u;
        this.f2855f = enumC1101i2;
        this.f2856g = null;
        this.f2857h = str;
        this.f2858i = c1087g2;
    }
}
