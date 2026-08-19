package p328N1;

import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8566U3;

/* JADX INFO: renamed from: N1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C5576C {

    /* JADX INFO: renamed from: a */
    public final int f18077a;

    /* JADX INFO: renamed from: b */
    public final C5609y f18078b;

    /* JADX INFO: renamed from: c */
    public final int f18079c;

    /* JADX INFO: renamed from: d */
    public final C5608x f18080d;

    /* JADX INFO: renamed from: e */
    public final int f18081e;

    public C5576C(int i10, C5609y c5609y, int i11, C5608x c5608x, int i12) {
        this.f18077a = i10;
        this.f18078b = c5609y;
        this.f18079c = i11;
        this.f18080d = c5608x;
        this.f18081e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5576C)) {
            return false;
        }
        C5576C c5576c = (C5576C) obj;
        return this.f18077a == c5576c.f18077a && AbstractC16544l.m18089b(this.f18078b, c5576c.f18078b) && C5605u.m5992a(this.f18079c, c5576c.f18079c) && this.f18080d.equals(c5576c.f18080d) && AbstractC8566U3.m9232b(this.f18081e, c5576c.f18081e);
    }

    public final int hashCode() {
        return this.f18080d.f18150a.hashCode() + (((((((this.f18077a * 31) + this.f18078b.f18160Y) * 31) + this.f18079c) * 31) + this.f18081e) * 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f18077a + ", weight=" + this.f18078b + ", style=" + ((Object) C5605u.m5993b(this.f18079c)) + ", loadingStrategy=" + ((Object) AbstractC8566U3.m9233c(this.f18081e)) + ')';
    }
}
