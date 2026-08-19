package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.w1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1186w1 extends AbstractC0888A0 {
    public static final C1180v1 Companion = new C1180v1();

    /* JADX INFO: renamed from: a */
    public final Integer f3135a;

    /* JADX INFO: renamed from: b */
    public final Integer f3136b;

    /* JADX INFO: renamed from: c */
    public final C5551u f3137c;

    /* JADX INFO: renamed from: d */
    public final String f3138d;

    /* JADX INFO: renamed from: e */
    public final String f3139e;

    public C1186w1(int i10, Integer num, Integer num2, C5551u c5551u, String str, String str2) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C1174u1.f3122a.getDescriptor());
            throw null;
        }
        this.f3135a = num;
        this.f3136b = num2;
        this.f3137c = c5551u;
        this.f3138d = str;
        if ((i10 & 16) == 0) {
            this.f3139e = "time";
        } else {
            this.f3139e = str2;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f3136b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f3135a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f3139e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186w1)) {
            return false;
        }
        C1186w1 c1186w1 = (C1186w1) obj;
        return AbstractC16544l.m18089b(this.f3135a, c1186w1.f3135a) && AbstractC16544l.m18089b(this.f3136b, c1186w1.f3136b) && AbstractC16544l.m18089b(this.f3137c, c1186w1.f3137c) && AbstractC16544l.m18089b(this.f3138d, c1186w1.f3138d) && AbstractC16544l.m18089b(this.f3139e, c1186w1.f3139e);
    }

    public final int hashCode() {
        Integer num = this.f3135a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3136b;
        return this.f3139e.hashCode() + AbstractC0168G.m527p((this.f3137c.f18004Y.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31, 31, this.f3138d);
    }

    public final String toString() {
        return "█";
    }
}
