package p059C5;

import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p374P5.C6354g;

/* JADX INFO: renamed from: C5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1586d {

    /* JADX INFO: renamed from: a */
    public static final C1586d f4453a = new C1586d();

    /* JADX INFO: renamed from: a */
    public final boolean m2440a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof C6354g) || !(obj2 instanceof C6354g)) {
            return AbstractC16544l.m18089b(obj, obj2);
        }
        C6354g c6354g = (C6354g) obj;
        C6354g c6354g2 = (C6354g) obj2;
        return AbstractC16544l.m18089b(c6354g.f20661a, c6354g2.f20661a) && c6354g.f20662b.equals(c6354g2.f20662b) && AbstractC16544l.m18089b(null, null) && c6354g.f20664d.equals(c6354g2.f20664d) && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(c6354g.f20676p, c6354g2.f20676p) && c6354g.f20677q == c6354g2.f20677q && c6354g.f20678r == c6354g2.f20678r;
    }

    /* JADX INFO: renamed from: b */
    public final int m2441b(Object obj) {
        if (!(obj instanceof C6354g)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        C6354g c6354g = (C6354g) obj;
        return c6354g.f20678r.hashCode() + ((c6354g.f20677q.hashCode() + ((c6354g.f20676p.hashCode() + AbstractC20734X.m21250u((c6354g.f20662b.hashCode() + (c6354g.f20661a.hashCode() * 31)) * 961, 961, c6354g.f20664d)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
