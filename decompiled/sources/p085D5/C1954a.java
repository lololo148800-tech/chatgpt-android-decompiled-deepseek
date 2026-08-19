package p085D5;

import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0832p;
import p059C5.C1586d;

/* JADX INFO: renamed from: D5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1954a {

    /* JADX INFO: renamed from: a */
    public final Object f5784a;

    /* JADX INFO: renamed from: b */
    public final C1586d f5785b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0832p f5786c;

    public C1954a(Object obj, C1586d c1586d, InterfaceC0832p interfaceC0832p) {
        this.f5784a = obj;
        this.f5785b = c1586d;
        this.f5786c = interfaceC0832p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1954a) {
            C1954a c1954a = (C1954a) obj;
            C1586d c1586d = c1954a.f5785b;
            C1586d c1586d2 = this.f5785b;
            if (AbstractC16544l.m18089b(c1586d2, c1586d) && c1586d2.m2440a(this.f5784a, c1954a.f5784a) && AbstractC16544l.m18089b(this.f5786c, c1954a.f5786c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C1586d c1586d = this.f5785b;
        return this.f5786c.hashCode() + ((c1586d.m2441b(this.f5784a) + (c1586d.hashCode() * 31)) * 31);
    }
}
