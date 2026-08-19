package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.F1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0919F1 extends AbstractC0985Q1 {
    public static final C0913E1 Companion = new C0913E1();

    /* JADX INFO: renamed from: a */
    public final Integer f2654a;

    /* JADX INFO: renamed from: b */
    public final Integer f2655b;

    /* JADX INFO: renamed from: c */
    public final String f2656c;

    /* JADX INFO: renamed from: d */
    public final String f2657d;

    public C0919F1(int i10, Integer num, Integer num2, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0907D1.f2640a.getDescriptor());
            throw null;
        }
        this.f2654a = num;
        this.f2655b = num2;
        if ((i10 & 4) == 0) {
            this.f2656c = "unsupported";
        } else {
            this.f2656c = str;
        }
        if ((i10 & 8) == 0) {
            this.f2657d = null;
        } else {
            this.f2657d = str2;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: a */
    public final String mo1963a() {
        return this.f2657d;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2655b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2654a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2656c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0919F1)) {
            return false;
        }
        C0919F1 c0919f1 = (C0919F1) obj;
        return AbstractC16544l.m18089b(this.f2654a, c0919f1.f2654a) && AbstractC16544l.m18089b(this.f2655b, c0919f1.f2655b) && AbstractC16544l.m18089b(this.f2656c, c0919f1.f2656c) && AbstractC16544l.m18089b(this.f2657d, c0919f1.f2657d);
    }

    public final int hashCode() {
        Integer num = this.f2654a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2655b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f2656c);
        String str = this.f2657d;
        return iM527p + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
