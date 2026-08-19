package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.X1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21975X1 {
    public static final C21972W1 Companion = new C21972W1();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f69567f = {EnumC21981Z1.Companion.serializer(), EnumC21989b2.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: g */
    public static final C21975X1 f69568g;

    /* JADX INFO: renamed from: h */
    public static final C21975X1 f69569h;

    /* JADX INFO: renamed from: i */
    public static final C21975X1 f69570i;

    /* JADX INFO: renamed from: a */
    public final EnumC21981Z1 f69571a;

    /* JADX INFO: renamed from: b */
    public final EnumC21989b2 f69572b;

    /* JADX INFO: renamed from: c */
    public final C5551u f69573c;

    /* JADX INFO: renamed from: d */
    public final boolean f69574d;

    /* JADX INFO: renamed from: e */
    public final boolean f69575e;

    static {
        EnumC21981Z1 enumC21981Z1 = EnumC21981Z1.f69582p0;
        EnumC21989b2 enumC21989b2 = EnumC21989b2.f69617o0;
        C5551u.Companion.getClass();
        f69568g = new C21975X1(enumC21981Z1, enumC21989b2, C5550t.m5942a(Long.MAX_VALUE), true, true);
        EnumC21981Z1 enumC21981Z2 = EnumC21981Z1.f69584r0;
        EnumC21989b2 enumC21989b3 = EnumC21989b2.OTHER;
        f69569h = new C21975X1(enumC21981Z2, enumC21989b3, C5550t.m5942a(Long.MAX_VALUE), true, true);
        f69570i = new C21975X1(EnumC21981Z1.f69585s0, enumC21989b3, C5550t.m5942a(Long.MAX_VALUE), true, true);
    }

    public /* synthetic */ C21975X1(int i10, EnumC21981Z1 enumC21981Z1, EnumC21989b2 enumC21989b2, C5551u c5551u, boolean z6, boolean z10) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C21969V1.f69548a.getDescriptor());
            throw null;
        }
        this.f69571a = enumC21981Z1;
        this.f69572b = enumC21989b2;
        this.f69573c = c5551u;
        this.f69574d = z6;
        this.f69575e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21975X1)) {
            return false;
        }
        C21975X1 c21975x1 = (C21975X1) obj;
        return this.f69571a == c21975x1.f69571a && this.f69572b == c21975x1.f69572b && AbstractC16544l.m18089b(this.f69573c, c21975x1.f69573c) && this.f69574d == c21975x1.f69574d && this.f69575e == c21975x1.f69575e;
    }

    public final int hashCode() {
        int iHashCode = (this.f69572b.hashCode() + (this.f69571a.hashCode() * 31)) * 31;
        C5551u c5551u = this.f69573c;
        return ((((iHashCode + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31) + (this.f69574d ? 1231 : 1237)) * 31) + (this.f69575e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C21975X1(EnumC21981Z1 enumC21981Z1, EnumC21989b2 enumC21989b2, C5551u c5551u, boolean z6, boolean z10) {
        this.f69571a = enumC21981Z1;
        this.f69572b = enumC21989b2;
        this.f69573c = c5551u;
        this.f69574d = z6;
        this.f69575e = z10;
    }
}
