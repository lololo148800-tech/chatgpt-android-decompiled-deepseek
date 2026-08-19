package p204I1;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: I1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3609y {

    /* JADX INFO: renamed from: a */
    public final C3608x f10995a;

    /* JADX INFO: renamed from: b */
    public final C3607w f10996b;

    public C3609y(C3608x c3608x, C3607w c3607w) {
        this.f10995a = c3608x;
        this.f10996b = c3607w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3609y)) {
            return false;
        }
        C3609y c3609y = (C3609y) obj;
        return AbstractC16544l.m18089b(this.f10996b, c3609y.f10996b) && AbstractC16544l.m18089b(this.f10995a, c3609y.f10995a);
    }

    public final int hashCode() {
        C3608x c3608x = this.f10995a;
        int iHashCode = (c3608x != null ? c3608x.hashCode() : 0) * 31;
        C3607w c3607w = this.f10996b;
        return iHashCode + (c3607w != null ? c3607w.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f10995a + ", paragraphSyle=" + this.f10996b + ')';
    }
}
