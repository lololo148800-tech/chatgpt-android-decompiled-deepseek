package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.I */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0935I extends AbstractC0888A0 {
    public static final C0929H Companion = new C0929H();

    /* JADX INFO: renamed from: a */
    public final Integer f2681a;

    /* JADX INFO: renamed from: b */
    public final Integer f2682b;

    /* JADX INFO: renamed from: c */
    public final String f2683c;

    /* JADX INFO: renamed from: d */
    public final String f2684d;

    public C0935I(int i10, Integer num, Integer num2, String str, String str2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0923G.f2664a.getDescriptor());
            throw null;
        }
        this.f2681a = num;
        this.f2682b = num2;
        this.f2683c = str;
        if ((i10 & 8) == 0) {
            this.f2684d = "file_citation";
        } else {
            this.f2684d = str2;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2682b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2681a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2684d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0935I)) {
            return false;
        }
        C0935I c0935i = (C0935I) obj;
        return AbstractC16544l.m18089b(this.f2681a, c0935i.f2681a) && AbstractC16544l.m18089b(this.f2682b, c0935i.f2682b) && AbstractC16544l.m18089b(this.f2683c, c0935i.f2683c) && AbstractC16544l.m18089b(this.f2684d, c0935i.f2684d);
    }

    public final int hashCode() {
        Integer num = this.f2681a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2682b;
        return this.f2684d.hashCode() + AbstractC0168G.m527p((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f2683c);
    }

    public final String toString() {
        return "█";
    }

    public C0935I(Integer num, Integer num2, String str) {
        this.f2681a = num;
        this.f2682b = num2;
        this.f2683c = str;
        this.f2684d = "file_citation";
    }
}
