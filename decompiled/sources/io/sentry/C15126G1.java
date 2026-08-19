package io.sentry;

import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15447t;
import io.sentry.protocol.EnumC15423C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001A.C0083q0;
import p001A.C0093v0;
import p001A.C0100z;
import p007A5.C0376k;
import p117Eb.C2391u;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.G1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15126G1 implements InterfaceC15159S {

    /* JADX INFO: renamed from: b */
    public final C15135J1 f47076b;

    /* JADX INFO: renamed from: d */
    public final C15106A f47078d;

    /* JADX INFO: renamed from: e */
    public final String f47079e;

    /* JADX INFO: renamed from: g */
    public volatile C15120E1 f47081g;

    /* JADX INFO: renamed from: h */
    public volatile C15120E1 f47082h;

    /* JADX INFO: renamed from: i */
    public volatile Timer f47083i;

    /* JADX INFO: renamed from: j */
    public final Object f47084j;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f47085k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f47086l;

    /* JADX INFO: renamed from: m */
    public final C0093v0 f47087m;

    /* JADX INFO: renamed from: n */
    public final EnumC15423C f47088n;

    /* JADX INFO: renamed from: o */
    public final EnumC15168V f47089o;

    /* JADX INFO: renamed from: p */
    public final C15430c f47090p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC15167U1 f47091q;

    /* JADX INFO: renamed from: r */
    public final C15164T1 f47092r;

    /* JADX INFO: renamed from: a */
    public final C15447t f47075a = new C15447t((UUID) null);

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f47077c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public C15123F1 f47080f = C15123F1.f47070c;

    public C15126G1(C15161S1 c15161s1, C15106A c15106a, C15164T1 c15164t1, InterfaceC15167U1 interfaceC15167U1) {
        this.f47083i = null;
        Object obj = new Object();
        this.f47084j = obj;
        this.f47085k = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f47086l = atomicBoolean;
        this.f47090p = new C15430c();
        this.f47076b = new C15135J1(c15161s1, this, c15106a, c15164t1.f47219o0, c15164t1);
        this.f47079e = c15161s1.f47210w0;
        this.f47089o = c15161s1.f47209A0;
        this.f47078d = c15106a;
        this.f47091q = interfaceC15167U1;
        this.f47088n = c15161s1.f47211x0;
        this.f47092r = c15164t1;
        C0093v0 c0093v0 = c15161s1.f47213z0;
        if (c0093v0 != null) {
            this.f47087m = c0093v0;
        } else {
            this.f47087m = new C0093v0(c15106a.mo16246j().getLogger());
        }
        if (interfaceC15167U1 != null) {
            interfaceC15167U1.mo16351i(this);
        }
        if (c15164t1.f47222r0 == null && c15164t1.f47223s0 == null) {
            return;
        }
        boolean z6 = true;
        this.f47083i = new Timer(true);
        Long l4 = c15164t1.f47223s0;
        if (l4 != null) {
            synchronized (obj) {
                try {
                    if (this.f47083i != null) {
                        m16293x();
                        atomicBoolean.set(true);
                        this.f47082h = new C15120E1(this, 1);
                        try {
                            this.f47083i.schedule(this.f47082h, l4.longValue());
                        } catch (Throwable th2) {
                            this.f47078d.mo16246j().getLogger().mo16297h(EnumC15375i1.WARNING, "Failed to schedule finish timer", th2);
                            EnumC15147N1 enumC15147N1Mo16270a = mo16270a();
                            if (enumC15147N1Mo16270a == null) {
                                enumC15147N1Mo16270a = EnumC15147N1.DEADLINE_EXCEEDED;
                            }
                            if (this.f47092r.f47222r0 == null) {
                                z6 = false;
                            }
                            mo16275f(enumC15147N1Mo16270a, z6, null);
                            this.f47086l.set(false);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        mo16286q();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX INFO: renamed from: A */
    public final void m16267A(EnumC15147N1 enumC15147N1, AbstractC15169V0 abstractC15169V0, boolean z6, C15516w c15516w) {
        C15113C0 c15113c0Mo16347l;
        AbstractC15169V0 abstractC15169V1 = this.f47076b.f47132b;
        if (abstractC15169V0 == null) {
            abstractC15169V0 = abstractC15169V1;
        }
        if (abstractC15169V0 == null) {
            abstractC15169V0 = this.f47078d.mo16246j().getDateProvider().mo16338a();
        }
        Iterator it = this.f47077c.iterator();
        while (it.hasNext()) {
            ((C15135J1) it.next()).f47139i.getClass();
        }
        this.f47080f = new C15123F1(true, enumC15147N1);
        if (this.f47076b.f47137g) {
            return;
        }
        if (!this.f47092r.f47221q0 || m16268B()) {
            AtomicReference atomicReference = new AtomicReference();
            C15135J1 c15135j1 = this.f47076b;
            c15135j1.f47140j = new C0083q0(this, c15135j1.f47140j, atomicReference, 13);
            c15135j1.mo16290u(this.f47080f.f47072b, abstractC15169V0);
            Boolean bool = Boolean.TRUE;
            C2391u c2391u = this.f47076b.f47133c.f47147p0;
            if (bool.equals(c2391u == null ? null : (Boolean) c2391u.f7430o0)) {
                C2391u c2391u2 = this.f47076b.f47133c.f47147p0;
                if (bool.equals(c2391u2 == null ? null : (Boolean) c2391u2.f7431p0)) {
                    c15113c0Mo16347l = this.f47078d.mo16246j().getTransactionProfiler().mo16347l(this, (List) atomicReference.get(), this.f47078d.mo16246j());
                } else {
                    c15113c0Mo16347l = null;
                }
            } else {
                c15113c0Mo16347l = null;
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f47078d.mo16253v(new C15117D1(this));
            C15421A c15421a = new C15421A(this);
            if (this.f47083i != null) {
                synchronized (this.f47084j) {
                    try {
                        if (this.f47083i != null) {
                            m16294y();
                            m16293x();
                            this.f47083i.cancel();
                            this.f47083i = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z6 && this.f47077c.isEmpty() && this.f47092r.f47222r0 != null) {
                this.f47078d.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f47079e);
            } else {
                c15421a.f48055F0.putAll(this.f47076b.f47142l);
                this.f47078d.mo16234A(c15421a, mo16273d(), c15516w, c15113c0Mo16347l);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m16268B() {
        ArrayList<C15135J1> arrayList = new ArrayList(this.f47077c);
        if (arrayList.isEmpty()) {
            return true;
        }
        for (C15135J1 c15135j1 : arrayList) {
            if (!c15135j1.f47137g && c15135j1.f47132b == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC15154Q m16269C(String str, String str2, AbstractC15169V0 abstractC15169V0, EnumC15168V enumC15168V, C0376k c0376k) {
        C15135J1 c15135j1 = this.f47076b;
        boolean z6 = c15135j1.f47137g;
        C15509v0 c15509v0 = C15509v0.f48434a;
        if (z6 || !this.f47089o.equals(enumC15168V)) {
            return c15509v0;
        }
        int size = this.f47077c.size();
        C15106A c15106a = this.f47078d;
        if (size < c15106a.mo16246j().getMaxSpans()) {
            return c15135j1.f47137g ? c15509v0 : c15135j1.f47134d.m16295z(c15135j1.f47133c.f47145Z, str, str2, abstractC15169V0, enumC15168V, c0376k);
        }
        c15106a.mo16246j().getLogger().mo16298o(EnumC15375i1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return c15509v0;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: a */
    public final EnumC15147N1 mo16270a() {
        return this.f47076b.f47133c.f47150s0;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: b */
    public final void mo16271b() {
        mo16290u(mo16270a(), null);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: c */
    public final void mo16272c(EnumC15147N1 enumC15147N1) {
        C15135J1 c15135j1 = this.f47076b;
        if (c15135j1.f47137g) {
            this.f47078d.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "The transaction is already finished. Status %s cannot be set", enumC15147N1 == null ? "null" : enumC15147N1.name());
        } else {
            c15135j1.f47133c.f47150s0 = enumC15147N1;
        }
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: d */
    public final C15158R1 mo16273d() {
        if (!this.f47078d.mo16246j().isTraceSampling()) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.f47087m.f403Z) {
                    AtomicReference atomicReference = new AtomicReference();
                    AtomicReference atomicReference2 = new AtomicReference();
                    this.f47078d.mo16253v(new C0100z(atomicReference, 29, atomicReference2));
                    this.f47087m.m355y(this, (C15425E) atomicReference.get(), (C15447t) atomicReference2.get(), this.f47078d.mo16246j(), this.f47076b.f47133c.f47147p0);
                    this.f47087m.f403Z = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f47087m.m356z();
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: e */
    public final boolean mo16274e() {
        return this.f47076b.f47137g;
    }

    @Override // io.sentry.InterfaceC15159S
    /* JADX INFO: renamed from: f */
    public final void mo16275f(EnumC15147N1 enumC15147N1, boolean z6, C15516w c15516w) {
        if (this.f47076b.f47137g) {
            return;
        }
        AbstractC15169V0 abstractC15169V0Mo16338a = this.f47078d.mo16246j().getDateProvider().mo16338a();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f47077c;
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            C15135J1 c15135j1 = (C15135J1) listIterator.previous();
            c15135j1.f47140j = null;
            c15135j1.mo16290u(enumC15147N1, abstractC15169V0Mo16338a);
        }
        m16267A(enumC15147N1, abstractC15169V0Mo16338a, z6, c15516w);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: g */
    public final boolean mo16276g(AbstractC15169V0 abstractC15169V0) {
        return this.f47076b.mo16276g(abstractC15169V0);
    }

    @Override // io.sentry.InterfaceC15154Q
    public final String getDescription() {
        return this.f47076b.f47133c.f47149r0;
    }

    @Override // io.sentry.InterfaceC15159S
    public final String getName() {
        return this.f47079e;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: h */
    public final void mo16277h(Number number, String str) {
        this.f47076b.mo16277h(number, str);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: i */
    public final void mo16278i(EnumC15147N1 enumC15147N1) {
        mo16290u(enumC15147N1, null);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: j */
    public final InterfaceC15154Q mo16279j(String str, String str2, AbstractC15169V0 abstractC15169V0, EnumC15168V enumC15168V) {
        return m16269C(str, str2, abstractC15169V0, enumC15168V, new C0376k(9));
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: k */
    public final void mo16280k(Object obj, String str) {
        C15135J1 c15135j1 = this.f47076b;
        if (c15135j1.f47137g) {
            this.f47078d.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            c15135j1.mo16280k(obj, str);
        }
    }

    @Override // io.sentry.InterfaceC15159S
    /* JADX INFO: renamed from: l */
    public final C15135J1 mo16281l() {
        ArrayList arrayList = new ArrayList(this.f47077c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((C15135J1) arrayList.get(size)).f47137g) {
                return (C15135J1) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: m */
    public final void mo16282m(String str) {
        C15135J1 c15135j1 = this.f47076b;
        if (c15135j1.f47137g) {
            this.f47078d.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            c15135j1.f47133c.f47149r0 = str;
        }
    }

    @Override // io.sentry.InterfaceC15159S
    /* JADX INFO: renamed from: n */
    public final C15447t mo16283n() {
        return this.f47075a;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: o */
    public final void mo16284o(Exception exc) {
        C15135J1 c15135j1 = this.f47076b;
        if (c15135j1.f47137g) {
            this.f47078d.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            c15135j1.f47135e = exc;
        }
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: p */
    public final InterfaceC15154Q mo16285p(String str) {
        return mo16291v(str, null);
    }

    @Override // io.sentry.InterfaceC15159S
    /* JADX INFO: renamed from: q */
    public final void mo16286q() {
        Long l4;
        synchronized (this.f47084j) {
            try {
                if (this.f47083i != null && (l4 = this.f47092r.f47222r0) != null) {
                    m16294y();
                    this.f47085k.set(true);
                    this.f47081g = new C15120E1(this, 0);
                    try {
                        this.f47083i.schedule(this.f47081g, l4.longValue());
                    } catch (Throwable th2) {
                        this.f47078d.mo16246j().getLogger().mo16297h(EnumC15375i1.WARNING, "Failed to schedule finish timer", th2);
                        EnumC15147N1 enumC15147N1Mo16270a = mo16270a();
                        if (enumC15147N1Mo16270a == null) {
                            enumC15147N1Mo16270a = EnumC15147N1.OK;
                        }
                        mo16290u(enumC15147N1Mo16270a, null);
                        this.f47085k.set(false);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: r */
    public final void mo16287r(String str, Long l4, EnumC15401l0 enumC15401l0) {
        this.f47076b.mo16287r(str, l4, enumC15401l0);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: s */
    public final C15138K1 mo16288s() {
        return this.f47076b.f47133c;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: t */
    public final AbstractC15169V0 mo16289t() {
        return this.f47076b.f47132b;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: u */
    public final void mo16290u(EnumC15147N1 enumC15147N1, AbstractC15169V0 abstractC15169V0) {
        m16267A(enumC15147N1, abstractC15169V0, true, null);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: v */
    public final InterfaceC15154Q mo16291v(String str, String str2) {
        return m16269C(str, str2, null, EnumC15168V.SENTRY, new C0376k(9));
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: w */
    public final AbstractC15169V0 mo16292w() {
        return this.f47076b.f47131a;
    }

    /* JADX INFO: renamed from: x */
    public final void m16293x() {
        synchronized (this.f47084j) {
            try {
                if (this.f47082h != null) {
                    this.f47082h.cancel();
                    this.f47086l.set(false);
                    this.f47082h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m16294y() {
        synchronized (this.f47084j) {
            try {
                if (this.f47081g != null) {
                    this.f47081g.cancel();
                    this.f47085k.set(false);
                    this.f47081g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC15154Q m16295z(C15144M1 c15144m1, String str, String str2, AbstractC15169V0 abstractC15169V0, EnumC15168V enumC15168V, C0376k c0376k) {
        C15135J1 c15135j1 = this.f47076b;
        boolean z6 = c15135j1.f47137g;
        C15509v0 c15509v0 = C15509v0.f48434a;
        if (z6 || !this.f47089o.equals(enumC15168V)) {
            return c15509v0;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f47077c;
        int size = copyOnWriteArrayList.size();
        C15106A c15106a = this.f47078d;
        if (size >= c15106a.mo16246j().getMaxSpans()) {
            c15106a.mo16246j().getLogger().mo16298o(EnumC15375i1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return c15509v0;
        }
        AbstractC8483G3.m9133c(c15144m1, "parentSpanId is required");
        m16294y();
        C15135J1 c15135j2 = new C15135J1(c15135j1.f47133c.f47144Y, c15144m1, this, str, this.f47078d, abstractC15169V0, c0376k, new C15117D1(this));
        c15135j2.f47133c.f47149r0 = str2;
        c15135j2.mo16280k(String.valueOf(Thread.currentThread().getId()), "thread.id");
        c15135j2.mo16280k(c15106a.mo16246j().getMainThreadChecker().mo16438a() ? "main" : Thread.currentThread().getName(), "thread.name");
        copyOnWriteArrayList.add(c15135j2);
        InterfaceC15167U1 interfaceC15167U1 = this.f47091q;
        if (interfaceC15167U1 != null) {
            interfaceC15167U1.mo16350f(c15135j2);
        }
        return c15135j2;
    }
}
