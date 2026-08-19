package mo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p228J.AbstractC3794B0;
import p523V9.AbstractC8152n6;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: mo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C17339f {

    /* JADX INFO: renamed from: c */
    public static final C17339f f55229c = new C17339f(AbstractC17680n.m19328G0(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set f55230a;

    /* JADX INFO: renamed from: b */
    public final AbstractC8152n6 f55231b;

    public C17339f(Set set, AbstractC8152n6 abstractC8152n6) {
        this.f55230a = set;
        this.f55231b = abstractC8152n6;
    }

    /* JADX INFO: renamed from: a */
    public final void m19000a(String hostname, InterfaceC1426a interfaceC1426a) {
        AbstractC16544l.m18094g(hostname, "hostname");
        Iterator it = this.f55230a.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17339f) {
            C17339f c17339f = (C17339f) obj;
            if (AbstractC16544l.m18089b(c17339f.f55230a, this.f55230a) && AbstractC16544l.m18089b(c17339f.f55231b, this.f55231b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f55230a.hashCode() + 1517) * 41;
        AbstractC8152n6 abstractC8152n6 = this.f55231b;
        return iHashCode + (abstractC8152n6 != null ? abstractC8152n6.hashCode() : 0);
    }
}
