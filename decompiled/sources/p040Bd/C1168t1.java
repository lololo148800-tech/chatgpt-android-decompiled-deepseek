package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.t1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1168t1 extends AbstractC1142p {
    public static final C1065d1 Companion = new C1065d1();

    /* JADX INFO: renamed from: h */
    public static final KSerializer[] f3112h = {null, null, null, null, EnumC1159r4.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a */
    public final Integer f3113a;

    /* JADX INFO: renamed from: b */
    public final Integer f3114b;

    /* JADX INFO: renamed from: c */
    public final String f3115c;

    /* JADX INFO: renamed from: d */
    public final C1144p1 f3116d;

    /* JADX INFO: renamed from: e */
    public final EnumC1159r4 f3117e;

    /* JADX INFO: renamed from: f */
    public final String f3118f;

    /* JADX INFO: renamed from: g */
    public final String f3119g;

    public C1168t1(int i10, Integer num, Integer num2, String str, C1144p1 c1144p1, EnumC1159r4 enumC1159r4, String str2, String str3) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1037Z0.f2864a.getDescriptor());
            throw null;
        }
        this.f3113a = num;
        this.f3114b = num2;
        this.f3115c = str;
        if ((i10 & 8) == 0) {
            this.f3116d = null;
        } else {
            this.f3116d = c1144p1;
        }
        if ((i10 & 16) == 0) {
            this.f3117e = EnumC1159r4.f3083Z;
        } else {
            this.f3117e = enumC1159r4;
        }
        if ((i10 & 32) == 0) {
            this.f3118f = null;
        } else {
            this.f3118f = str2;
        }
        if ((i10 & 64) == 0) {
            this.f3119g = "stock";
        } else {
            this.f3119g = str3;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f3114b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f3113a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f3119g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168t1)) {
            return false;
        }
        C1168t1 c1168t1 = (C1168t1) obj;
        return AbstractC16544l.m18089b(this.f3113a, c1168t1.f3113a) && AbstractC16544l.m18089b(this.f3114b, c1168t1.f3114b) && AbstractC16544l.m18089b(this.f3115c, c1168t1.f3115c) && AbstractC16544l.m18089b(this.f3116d, c1168t1.f3116d) && this.f3117e == c1168t1.f3117e && AbstractC16544l.m18089b(this.f3118f, c1168t1.f3118f) && AbstractC16544l.m18089b(this.f3119g, c1168t1.f3119g);
    }

    public final int hashCode() {
        Integer num = this.f3113a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3114b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f3115c);
        C1144p1 c1144p1 = this.f3116d;
        int iHashCode2 = (this.f3117e.hashCode() + ((iM527p + (c1144p1 == null ? 0 : c1144p1.hashCode())) * 31)) * 31;
        String str = this.f3118f;
        return this.f3119g.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
