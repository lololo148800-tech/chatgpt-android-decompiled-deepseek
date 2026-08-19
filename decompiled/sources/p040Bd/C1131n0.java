package p040Bd;

import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: Bd.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1131n0 extends AbstractC1142p {

    /* JADX INFO: renamed from: a */
    public final Integer f3046a;

    /* JADX INFO: renamed from: b */
    public final Integer f3047b;

    /* JADX INFO: renamed from: c */
    public final String f3048c;

    /* JADX INFO: renamed from: d */
    public final String f3049d;

    public C1131n0(Integer num, Integer num2, String str) {
        EnumC1125m0 enumC1125m0 = EnumC1125m0.f3038Y;
        this.f3046a = num;
        this.f3047b = num2;
        this.f3048c = str;
        this.f3049d = "hardcoded_text_button";
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f3047b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f3046a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f3049d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1131n0)) {
            return false;
        }
        C1131n0 c1131n0 = (C1131n0) obj;
        if (!this.f3046a.equals(c1131n0.f3046a) || !this.f3047b.equals(c1131n0.f3047b)) {
            return false;
        }
        EnumC1125m0 enumC1125m0 = EnumC1125m0.f3038Y;
        return this.f3048c.equals(c1131n0.f3048c) && this.f3049d.equals(c1131n0.f3049d);
    }

    public final int hashCode() {
        return this.f3049d.hashCode() + AbstractC0168G.m527p((EnumC1125m0.f3038Y.hashCode() + ((this.f3047b.hashCode() + (this.f3046a.hashCode() * 31)) * 31)) * 31, 31, this.f3048c);
    }

    public final String toString() {
        return "█";
    }
}
