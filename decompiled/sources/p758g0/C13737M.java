package p758g0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: g0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C13737M {

    /* JADX INFO: renamed from: a */
    public final Float f43323a;

    /* JADX INFO: renamed from: b */
    public InterfaceC13798z f43324b;

    /* JADX INFO: renamed from: c */
    public int f43325c;

    public C13737M(Float f10, InterfaceC13798z interfaceC13798z) {
        this.f43323a = f10;
        this.f43324b = interfaceC13798z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13737M)) {
            return false;
        }
        C13737M c13737m = (C13737M) obj;
        return c13737m.f43323a.equals(this.f43323a) && AbstractC16544l.m18089b(c13737m.f43324b, this.f43324b) && c13737m.f43325c == this.f43325c;
    }

    public final int hashCode() {
        return this.f43324b.hashCode() + (((this.f43323a.hashCode() * 31) + this.f43325c) * 31);
    }
}
