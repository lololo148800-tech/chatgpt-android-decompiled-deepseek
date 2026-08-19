package io.sentry;

import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15428a;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15441n;
import io.sentry.protocol.C15447t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A.C0083q0;
import p310M9.C5311e;
import p544W9.AbstractC8453B3;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15134J0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC15159S f47113a;

    /* JADX INFO: renamed from: b */
    public C15425E f47114b;

    /* JADX INFO: renamed from: c */
    public String f47115c;

    /* JADX INFO: renamed from: d */
    public C15441n f47116d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f47117e;

    /* JADX INFO: renamed from: f */
    public final C15153P1 f47118f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f47119g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f47120h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f47121i;

    /* JADX INFO: renamed from: j */
    public final C15524y1 f47122j;

    /* JADX INFO: renamed from: k */
    public volatile C15132I1 f47123k;

    /* JADX INFO: renamed from: l */
    public final Object f47124l;

    /* JADX INFO: renamed from: m */
    public final Object f47125m;

    /* JADX INFO: renamed from: n */
    public final Object f47126n;

    /* JADX INFO: renamed from: o */
    public final C15430c f47127o;

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList f47128p;

    /* JADX INFO: renamed from: q */
    public C5311e f47129q;

    /* JADX INFO: renamed from: r */
    public C15447t f47130r;

    public C15134J0(C15524y1 c15524y1) {
        this.f47117e = new ArrayList();
        this.f47119g = new ConcurrentHashMap();
        this.f47120h = new ConcurrentHashMap();
        this.f47121i = new CopyOnWriteArrayList();
        this.f47124l = new Object();
        this.f47125m = new Object();
        this.f47126n = new Object();
        this.f47127o = new C15430c();
        this.f47128p = new CopyOnWriteArrayList();
        this.f47130r = C15447t.f48216Z;
        this.f47122j = c15524y1;
        int maxBreadcrumbs = c15524y1.getMaxBreadcrumbs();
        this.f47118f = maxBreadcrumbs > 0 ? new C15153P1(new C15353f(maxBreadcrumbs)) : new C15153P1(new C15413o());
        this.f47129q = new C5311e(22);
    }

    /* JADX INFO: renamed from: a */
    public final void m16304a() {
        synchronized (this.f47125m) {
            this.f47113a = null;
        }
        for (InterfaceC15145N interfaceC15145N : this.f47122j.getScopeObservers()) {
            interfaceC15145N.mo16315f(null);
            interfaceC15145N.mo16313d(null, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16305b(C15447t c15447t) {
        this.f47130r = c15447t;
        Iterator<InterfaceC15145N> it = this.f47122j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo16311b(c15447t);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16306c(String str) {
        this.f47115c = str;
        C15430c c15430c = this.f47127o;
        C15428a c15428a = (C15428a) c15430c.m16663d(C15428a.class, "app");
        if (c15428a == null) {
            c15428a = new C15428a();
            c15430c.m16661b(c15428a);
        }
        if (str == null) {
            c15428a.f48094u0 = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c15428a.f48094u0 = arrayList;
        }
        Iterator<InterfaceC15145N> it = this.f47122j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo16314e(c15430c);
        }
    }

    public final Object clone() {
        return new C15134J0(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m16307d(InterfaceC15159S interfaceC15159S) {
        synchronized (this.f47125m) {
            try {
                this.f47113a = interfaceC15159S;
                for (InterfaceC15145N interfaceC15145N : this.f47122j.getScopeObservers()) {
                    if (interfaceC15159S != null) {
                        interfaceC15145N.mo16315f(interfaceC15159S.getName());
                        interfaceC15145N.mo16313d(interfaceC15159S.mo16288s(), this);
                    } else {
                        interfaceC15145N.mo16315f(null);
                        interfaceC15145N.mo16313d(null, this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final C5311e m16308e(InterfaceC15131I0 interfaceC15131I0) {
        C5311e c5311e;
        synchronized (this.f47126n) {
            interfaceC15131I0.mo16300a(this.f47129q);
            c5311e = new C5311e(this.f47129q);
        }
        return c5311e;
    }

    /* JADX INFO: renamed from: f */
    public final C15132I1 m16309f(C0083q0 c0083q0) {
        C15132I1 c15132i1Clone;
        synchronized (this.f47124l) {
            try {
                c0083q0.m270e(this.f47123k);
                c15132i1Clone = this.f47123k != null ? this.f47123k.clone() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c15132i1Clone;
    }

    public C15134J0(C15134J0 c15134j0) {
        C15425E c15425e;
        C15153P1 c15153p1;
        this.f47117e = new ArrayList();
        this.f47119g = new ConcurrentHashMap();
        this.f47120h = new ConcurrentHashMap();
        this.f47121i = new CopyOnWriteArrayList();
        this.f47124l = new Object();
        this.f47125m = new Object();
        this.f47126n = new Object();
        this.f47127o = new C15430c();
        this.f47128p = new CopyOnWriteArrayList();
        this.f47130r = C15447t.f48216Z;
        this.f47113a = c15134j0.f47113a;
        this.f47123k = c15134j0.f47123k;
        this.f47122j = c15134j0.f47122j;
        C15425E c15425e2 = c15134j0.f47114b;
        C15441n c15441n = null;
        if (c15425e2 != null) {
            c15425e = new C15425E();
            c15425e.f48062Y = c15425e2.f48062Y;
            c15425e.f48064o0 = c15425e2.f48064o0;
            c15425e.f48063Z = c15425e2.f48063Z;
            c15425e.f48066q0 = c15425e2.f48066q0;
            c15425e.f48065p0 = c15425e2.f48065p0;
            c15425e.f48067r0 = c15425e2.f48067r0;
            c15425e.f48068s0 = c15425e2.f48068s0;
            c15425e.f48069t0 = AbstractC8453B3.m9064a(c15425e2.f48069t0);
            c15425e.f48070u0 = AbstractC8453B3.m9064a(c15425e2.f48070u0);
        } else {
            c15425e = null;
        }
        this.f47114b = c15425e;
        this.f47115c = c15134j0.f47115c;
        this.f47130r = c15134j0.f47130r;
        C15441n c15441n2 = c15134j0.f47116d;
        if (c15441n2 != null) {
            c15441n = new C15441n();
            c15441n.f48181Y = c15441n2.f48181Y;
            c15441n.f48185q0 = c15441n2.f48185q0;
            c15441n.f48182Z = c15441n2.f48182Z;
            c15441n.f48183o0 = c15441n2.f48183o0;
            c15441n.f48186r0 = AbstractC8453B3.m9064a(c15441n2.f48186r0);
            c15441n.f48187s0 = AbstractC8453B3.m9064a(c15441n2.f48187s0);
            c15441n.f48189u0 = AbstractC8453B3.m9064a(c15441n2.f48189u0);
            c15441n.f48192x0 = AbstractC8453B3.m9064a(c15441n2.f48192x0);
            c15441n.f48184p0 = c15441n2.f48184p0;
            c15441n.f48190v0 = c15441n2.f48190v0;
            c15441n.f48188t0 = c15441n2.f48188t0;
            c15441n.f48191w0 = c15441n2.f48191w0;
        }
        this.f47116d = c15441n;
        this.f47117e = new ArrayList(c15134j0.f47117e);
        this.f47121i = new CopyOnWriteArrayList(c15134j0.f47121i);
        C15345d[] c15345dArr = (C15345d[]) c15134j0.f47118f.toArray(new C15345d[0]);
        int maxBreadcrumbs = c15134j0.f47122j.getMaxBreadcrumbs();
        if (maxBreadcrumbs > 0) {
            c15153p1 = new C15153P1(new C15353f(maxBreadcrumbs));
        } else {
            c15153p1 = new C15153P1(new C15413o());
        }
        for (C15345d c15345d : c15345dArr) {
            c15153p1.add(new C15345d(c15345d));
        }
        this.f47118f = c15153p1;
        ConcurrentHashMap concurrentHashMap = c15134j0.f47119g;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f47119g = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = c15134j0.f47120h;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f47120h = concurrentHashMap4;
        this.f47127o = new C15430c(c15134j0.f47127o);
        this.f47128p = new CopyOnWriteArrayList(c15134j0.f47128p);
        this.f47129q = new C5311e(c15134j0.f47129q);
    }
}
