package io.sentry;

import io.sentry.protocol.C15436i;
import io.sentry.protocol.C15447t;
import io.sentry.util.C15498c;
import io.sentry.util.C15499d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p007A5.C0376k;
import p544W9.AbstractC8483G3;
import p561X.C8990d;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.J1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15135J1 implements InterfaceC15154Q {

    /* JADX INFO: renamed from: a */
    public final AbstractC15169V0 f47131a;

    /* JADX INFO: renamed from: b */
    public AbstractC15169V0 f47132b;

    /* JADX INFO: renamed from: c */
    public final C15138K1 f47133c;

    /* JADX INFO: renamed from: d */
    public final C15126G1 f47134d;

    /* JADX INFO: renamed from: e */
    public Exception f47135e;

    /* JADX INFO: renamed from: f */
    public final C15106A f47136f;

    /* JADX INFO: renamed from: i */
    public final C0376k f47139i;

    /* JADX INFO: renamed from: j */
    public InterfaceC15141L1 f47140j;

    /* JADX INFO: renamed from: g */
    public boolean f47137g = false;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f47138h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f47141k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap f47142l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m */
    public final C15498c f47143m = new C15498c(new C8990d(17));

    public C15135J1(C15447t c15447t, C15144M1 c15144m1, C15126G1 c15126g1, String str, C15106A c15106a, AbstractC15169V0 abstractC15169V0, C0376k c0376k, C15117D1 c15117d1) {
        this.f47133c = new C15138K1(c15447t, new C15144M1(), str, c15144m1, c15126g1.f47076b.f47133c.f47147p0);
        this.f47134d = c15126g1;
        AbstractC8483G3.m9133c(c15106a, "hub is required");
        this.f47136f = c15106a;
        this.f47139i = c0376k;
        this.f47140j = c15117d1;
        if (abstractC15169V0 != null) {
            this.f47131a = abstractC15169V0;
        } else {
            this.f47131a = c15106a.mo16246j().getDateProvider().mo16338a();
        }
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: a */
    public final EnumC15147N1 mo16270a() {
        return this.f47133c.f47150s0;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: b */
    public final void mo16271b() {
        mo16278i(this.f47133c.f47150s0);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: c */
    public final void mo16272c(EnumC15147N1 enumC15147N1) {
        this.f47133c.f47150s0 = enumC15147N1;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: e */
    public final boolean mo16274e() {
        return this.f47137g;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: g */
    public final boolean mo16276g(AbstractC15169V0 abstractC15169V0) {
        if (this.f47132b == null) {
            return false;
        }
        this.f47132b = abstractC15169V0;
        return true;
    }

    @Override // io.sentry.InterfaceC15154Q
    public final String getDescription() {
        return this.f47133c.f47149r0;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: h */
    public final void mo16277h(Number number, String str) {
        if (this.f47137g) {
            this.f47136f.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f47142l.put(str, new C15436i(number, null));
        C15126G1 c15126g1 = this.f47134d;
        C15135J1 c15135j1 = c15126g1.f47076b;
        if (c15135j1 == this || c15135j1.f47142l.containsKey(str)) {
            return;
        }
        c15126g1.mo16277h(number, str);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: i */
    public final void mo16278i(EnumC15147N1 enumC15147N1) {
        mo16290u(enumC15147N1, this.f47136f.mo16246j().getDateProvider().mo16338a());
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: k */
    public final void mo16280k(Object obj, String str) {
        this.f47141k.put(str, obj);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: m */
    public final void mo16282m(String str) {
        this.f47133c.f47149r0 = str;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: o */
    public final void mo16284o(Exception exc) {
        this.f47135e = exc;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: p */
    public final InterfaceC15154Q mo16285p(String str) {
        return mo16291v(str, null);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: r */
    public final void mo16287r(String str, Long l4, EnumC15401l0 enumC15401l0) {
        if (this.f47137g) {
            this.f47136f.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f47142l.put(str, new C15436i(l4, enumC15401l0.apiName()));
        C15126G1 c15126g1 = this.f47134d;
        C15135J1 c15135j1 = c15126g1.f47076b;
        if (c15135j1 == this || c15135j1.f47142l.containsKey(str)) {
            return;
        }
        c15126g1.mo16287r(str, l4, enumC15401l0);
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: s */
    public final C15138K1 mo16288s() {
        return this.f47133c;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: t */
    public final AbstractC15169V0 mo16289t() {
        return this.f47132b;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: u */
    public final void mo16290u(EnumC15147N1 enumC15147N1, AbstractC15169V0 abstractC15169V0) {
        List<C15135J1> list;
        AbstractC15169V0 abstractC15169V1;
        AbstractC15169V0 abstractC15169V2;
        if (this.f47137g || !this.f47138h.compareAndSet(false, true)) {
            return;
        }
        C15138K1 c15138k1 = this.f47133c;
        c15138k1.f47150s0 = enumC15147N1;
        C15106A c15106a = this.f47136f;
        if (abstractC15169V0 == null) {
            abstractC15169V0 = c15106a.mo16246j().getDateProvider().mo16338a();
        }
        this.f47132b = abstractC15169V0;
        C0376k c0376k = this.f47139i;
        c0376k.getClass();
        boolean z6 = c0376k.f1278Z;
        C15126G1 c15126g1 = this.f47134d;
        if (z6) {
            C15144M1 c15144m1 = c15126g1.f47076b.f47133c.f47145Z;
            C15144M1 c15144m2 = c15138k1.f47145Z;
            boolean zEquals = c15144m1.equals(c15144m2);
            CopyOnWriteArrayList<C15135J1> copyOnWriteArrayList = c15126g1.f47077c;
            if (!zEquals) {
                list = copyOnWriteArrayList;
                ArrayList arrayList = new ArrayList();
                for (C15135J1 c15135j1 : copyOnWriteArrayList) {
                    C15144M1 c15144m3 = c15135j1.f47133c.f47146o0;
                    if (c15144m3 != null && c15144m3.equals(c15144m2)) {
                        arrayList.add(c15135j1);
                    }
                }
                list = arrayList;
            }
            list = copyOnWriteArrayList;
            AbstractC15169V0 abstractC15169V3 = null;
            AbstractC15169V0 abstractC15169V4 = null;
            for (C15135J1 c15135j2 : list) {
                if (abstractC15169V3 == null || c15135j2.f47131a.mo16354b(abstractC15169V3) < 0) {
                    abstractC15169V3 = c15135j2.f47131a;
                }
                if (abstractC15169V4 == null || ((abstractC15169V2 = c15135j2.f47132b) != null && abstractC15169V2.mo16354b(abstractC15169V4) > 0)) {
                    abstractC15169V4 = c15135j2.f47132b;
                }
            }
            if (c0376k.f1278Z && abstractC15169V4 != null && ((abstractC15169V1 = this.f47132b) == null || abstractC15169V1.mo16354b(abstractC15169V4) > 0)) {
                mo16276g(abstractC15169V4);
            }
        }
        Throwable cause = this.f47135e;
        if (cause != null) {
            String str = c15126g1.f47079e;
            c15106a.getClass();
            AbstractC8483G3.m9133c(cause, "throwable is required");
            AbstractC8483G3.m9133c(str, "transactionName is required");
            while (cause.getCause() != null && cause.getCause() != cause) {
                cause = cause.getCause();
            }
            Map map = c15106a.f47002e;
            if (!map.containsKey(cause)) {
                map.put(cause, new C15499d(new WeakReference(this), str));
            }
        }
        InterfaceC15141L1 interfaceC15141L1 = this.f47140j;
        if (interfaceC15141L1 != null) {
            interfaceC15141L1.mo269d(this);
        }
        this.f47137g = true;
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: v */
    public final InterfaceC15154Q mo16291v(String str, String str2) {
        if (this.f47137g) {
            return C15509v0.f48434a;
        }
        C15144M1 c15144m1 = this.f47133c.f47145Z;
        C15126G1 c15126g1 = this.f47134d;
        c15126g1.getClass();
        return c15126g1.m16295z(c15144m1, str, str2, null, EnumC15168V.SENTRY, new C0376k(9));
    }

    @Override // io.sentry.InterfaceC15154Q
    /* JADX INFO: renamed from: w */
    public final AbstractC15169V0 mo16292w() {
        return this.f47131a;
    }

    public C15135J1(C15161S1 c15161s1, C15126G1 c15126g1, C15106A c15106a, AbstractC15169V0 abstractC15169V0, C15164T1 c15164t1) {
        this.f47133c = c15161s1;
        AbstractC8483G3.m9133c(c15126g1, "sentryTracer is required");
        this.f47134d = c15126g1;
        this.f47136f = c15106a;
        this.f47140j = null;
        if (abstractC15169V0 != null) {
            this.f47131a = abstractC15169V0;
        } else {
            this.f47131a = c15106a.mo16246j().getDateProvider().mo16338a();
        }
        this.f47139i = c15164t1;
    }
}
