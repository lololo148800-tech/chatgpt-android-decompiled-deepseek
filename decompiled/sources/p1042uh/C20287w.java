package p1042uh;

import kotlin.jvm.internal.AbstractC16544l;
import p1107xh.EnumC21226P;

/* JADX INFO: renamed from: uh.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C20287w {

    /* JADX INFO: renamed from: a */
    public final String f64144a;

    /* JADX INFO: renamed from: b */
    public final EnumC21226P f64145b;

    /* JADX INFO: renamed from: c */
    public final C20286v f64146c;

    public C20287w(String str, EnumC21226P enumC21226P, C20286v c20286v) {
        this.f64144a = str;
        this.f64145b = enumC21226P;
        this.f64146c = c20286v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20287w)) {
            return false;
        }
        C20287w c20287w = (C20287w) obj;
        return AbstractC16544l.m18089b(this.f64144a, c20287w.f64144a) && this.f64145b == c20287w.f64145b && AbstractC16544l.m18089b(this.f64146c, c20287w.f64146c);
    }

    public final int hashCode() {
        int iHashCode = (this.f64145b.hashCode() + (this.f64144a.hashCode() * 31)) * 31;
        C20286v c20286v = this.f64146c;
        return iHashCode + (c20286v == null ? 0 : c20286v.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
