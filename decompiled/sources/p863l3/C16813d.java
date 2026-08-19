package p863l3;

import kotlin.jvm.internal.AbstractC16544l;
import p492U1.C7548m;
import p884m3.C17149h;
import p884m3.InterfaceC17142a;

/* JADX INFO: renamed from: l3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16813d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17142a f53948a;

    /* JADX INFO: renamed from: b */
    public final C7548m f53949b;

    public C16813d(C17149h c17149h, C7548m c7548m, int i10) {
        c7548m = (i10 & 2) != 0 ? null : c7548m;
        this.f53948a = c17149h;
        this.f53949b = c7548m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16813d)) {
            return false;
        }
        C16813d c16813d = (C16813d) obj;
        if (!AbstractC16544l.m18089b(this.f53948a, c16813d.f53948a) || !AbstractC16544l.m18089b(this.f53949b, c16813d.f53949b)) {
            return false;
        }
        c16813d.getClass();
        if (!AbstractC16544l.m18089b(null, null)) {
            return false;
        }
        c16813d.getClass();
        if (!AbstractC16544l.m18089b(null, null)) {
            return false;
        }
        c16813d.getClass();
        if (!AbstractC16544l.m18089b(null, null)) {
            return false;
        }
        c16813d.getClass();
        if (!AbstractC16544l.m18089b(null, null)) {
            return false;
        }
        c16813d.getClass();
        return AbstractC16544l.m18089b(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.f53948a.hashCode() * 31;
        C7548m c7548m = this.f53949b;
        return (iHashCode + (c7548m != null ? c7548m.hashCode() : 0)) * 28629151;
    }

    public final String toString() {
        return "TextStyle(color=" + this.f53948a + ", fontSize=" + this.f53949b + ", fontWeight=null, fontStyle=null, textDecoration=null, textAlign=null, fontFamily=null)";
    }
}
