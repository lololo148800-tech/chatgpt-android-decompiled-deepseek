package p059C5;

import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0832p;
import p374P5.C6354g;

/* JADX INFO: renamed from: C5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1587e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0832p f4454a;

    /* JADX INFO: renamed from: b */
    public final C6354g f4455b;

    /* JADX INFO: renamed from: c */
    public final C1586d f4456c;

    public C1587e(InterfaceC0832p interfaceC0832p, C6354g c6354g, C1586d c1586d) {
        this.f4454a = interfaceC0832p;
        this.f4455b = c6354g;
        this.f4456c = c1586d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1587e) {
            C1587e c1587e = (C1587e) obj;
            if (AbstractC16544l.m18089b(this.f4454a, c1587e.f4454a)) {
                C1586d c1586d = c1587e.f4456c;
                C1586d c1586d2 = this.f4456c;
                if (AbstractC16544l.m18089b(c1586d2, c1586d) && c1586d2.m2440a(this.f4455b, c1587e.f4455b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f4454a.hashCode() * 31;
        C1586d c1586d = this.f4456c;
        return c1586d.m2441b(this.f4455b) + ((c1586d.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.f4454a + ", request=" + this.f4455b + ", modelEqualityDelegate=" + this.f4456c + ')';
    }
}
