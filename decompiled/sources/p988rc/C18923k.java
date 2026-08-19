package p988rc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p204I1.C3573D;
import p467T1.C7200j;
import p774h1.C14365u;

/* JADX INFO: renamed from: rc.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18923k extends AbstractC18928p {

    /* JADX INFO: renamed from: e */
    public static final C3573D f60381e = new C3573D(C14365u.f45058h, 0, null, null, null, null, null, 0, null, null, null, 0, C7200j.f22864c, null, 61438);

    /* JADX INFO: renamed from: d */
    public final AbstractC16546n f60382d;

    /* JADX WARN: Multi-variable type inference failed */
    public C18923k(InterfaceC1426a interfaceC1426a) {
        super(null);
        this.f60382d = (AbstractC16546n) interfaceC1426a;
    }

    @Override // p988rc.AbstractC18928p
    /* JADX INFO: renamed from: a */
    public final C3573D mo1115a(C18930r c18930r) {
        return c18930r.f60404h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18923k) && this.f60382d.equals(((C18923k) obj).f60382d);
    }

    public final int hashCode() {
        return this.f60382d.hashCode();
    }

    public final String toString() {
        return "Link(onClick=" + this.f60382d + Separators.RPAREN;
    }
}
