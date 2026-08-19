package p1057v6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p008A6.C0384d;
import p1076w6.C20845c;
import p1076w6.C20846d;
import p136F6.AbstractC2674a;
import p228J.AbstractC3812N;
import p874lj.C17057a;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17691y;

/* JADX INFO: renamed from: v6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C20466f extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final long f64967o0;

    /* JADX INFO: renamed from: p0 */
    public final C17057a f64968p0;

    /* JADX INFO: renamed from: q0 */
    public final C20846d f64969q0;

    public C20466f(int i10, long j10) {
        super((char) 0, 12);
        this.f64967o0 = j10;
        this.f64968p0 = new C17057a(7);
        this.f64969q0 = new C20846d(i10, new C0384d(14));
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: G */
    public final C20468h mo4516G(String key, C20461a cacheHeaders) {
        C20468h c20468hM21111Q;
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        synchronized (this.f64968p0) {
            c20468hM21111Q = m21111Q(key, cacheHeaders);
            if (c20468hM21111Q == null) {
                AbstractC3812N abstractC3812N = (AbstractC3812N) this.f11539Z;
                if (abstractC3812N == null || (c20468hM21111Q = abstractC3812N.mo4516G(key, cacheHeaders)) == null) {
                    c20468hM21111Q = null;
                } else {
                    this.f64969q0.m21444b(key, new C20465e(c20468hM21111Q, this.f64967o0));
                }
            }
        }
        return c20468hM21111Q;
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: H */
    public final Collection mo4517H(Collection keys, C20461a cacheHeaders) {
        Object objInvoke;
        AbstractC16544l.m18094g(keys, "keys");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        C20464d c20464d = new C20464d(keys, this, cacheHeaders);
        synchronized (this.f64968p0) {
            objInvoke = c20464d.invoke();
        }
        return (Collection) objInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: I */
    public final Set mo4518I(Collection records, C20461a cacheHeaders) {
        Set setM21112a;
        AbstractC16544l.m18094g(records, "records");
        AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
        boolean zContainsKey = cacheHeaders.f64953a.containsKey("do-not-store");
        Set set = C17691y.f56482Y;
        if (zContainsKey) {
            return set;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = records.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C20468h c20468h = (C20468h) it.next();
            C20468h c20468hMo4516G = mo4516G(c20468h.f64972Y, cacheHeaders);
            long j10 = this.f64967o0;
            C20846d c20846d = this.f64969q0;
            String str = c20468h.f64972Y;
            if (c20468hMo4516G == null) {
                c20846d.m21444b(str, new C20465e(c20468h, j10));
                setM21112a = c20468h.m21112a();
            } else {
                C17309l c17309lM21113b = c20468hMo4516G.m21113b(c20468h, null);
                C20468h c20468h2 = (C20468h) c17309lM21113b.f55136Y;
                setM21112a = (Set) c17309lM21113b.f55137Z;
                c20846d.m21444b(str, new C20465e(c20468h2, j10));
            }
            AbstractC17686t.m19398v(setM21112a, arrayList);
        }
        Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
        AbstractC3812N abstractC3812N = (AbstractC3812N) this.f11539Z;
        Set setMo4518I = abstractC3812N != null ? abstractC3812N.mo4518I(records, cacheHeaders) : null;
        if (setMo4518I != null) {
            set = setMo4518I;
        }
        return AbstractC17665J.m19266f(setM19328G0, set);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: Q */
    public final C20468h m21111Q(String str, C20461a c20461a) {
        C20845c c20845c;
        C20846d c20846d = this.f64969q0;
        C20845c c20845c2 = (C20845c) c20846d.f66286c.get(str);
        if (c20845c2 != null) {
            c20846d.m21443a(c20845c2);
        }
        C20465e c20465e = c20845c2 != null ? c20845c2.f66281b : null;
        if (c20465e == null) {
            return null;
        }
        long j10 = c20465e.f64964b;
        long j11 = c20465e.f64965c;
        if (j10 >= 0) {
            int i10 = AbstractC2674a.f8212a;
            if (System.currentTimeMillis() - j11 >= j10) {
                c20845c = (C20845c) c20846d.f66286c.remove(str);
                if (c20845c != null) {
                    c20846d.m21445c(c20845c);
                }
            } else if (c20461a.f64953a.containsKey("evict-after-read")) {
                c20845c = (C20845c) c20846d.f66286c.remove(str);
                if (c20845c != null) {
                    c20846d.m21445c(c20845c);
                }
            }
        } else if (c20461a.f64953a.containsKey("evict-after-read")) {
            c20845c = (C20845c) c20846d.f66286c.remove(str);
            if (c20845c != null) {
                c20846d.m21445c(c20845c);
            }
        }
        if (j10 >= 0) {
            int i11 = AbstractC2674a.f8212a;
            if (System.currentTimeMillis() - j11 >= j10) {
                c20465e = null;
            }
        }
        if (c20465e != null) {
            return c20465e.f64963a;
        }
        return null;
    }
}
