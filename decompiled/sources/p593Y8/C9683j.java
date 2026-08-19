package p593Y8;

import android.content.Context;
import ge.C14089m0;
import ie.C14974c;
import io.sentry.C15524y1;
import io.sentry.EnumC15359h;
import io.sentry.android.core.C15192J;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.C15287r;
import io.sentry.transport.C15481d;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import p042Bf.C1271m;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p110E4.C2314l;
import p207I4.InterfaceC3617d;
import p228J.AbstractC3794B0;
import p233J4.C4256b;
import p233J4.C4260f;
import p571X9.AbstractC9227W;
import p745f9.C13589g;
import p745f9.InterfaceC13586d;
import p801i5.AbstractC14929a;
import p801i5.C14932d;
import p801i5.InterfaceC14934f;
import p817j$.util.concurrent.ConcurrentHashMap;
import p823j3.C16084f;
import p825j5.C16127d;
import p825j5.C16128e;
import p825j5.C16129f;
import p825j5.InterfaceC16130g;
import p876lm.InterfaceC17068a;
import p959q8.C18639a;

/* JADX INFO: renamed from: Y8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9683j implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29191Y = 0;

    /* JADX INFO: renamed from: Z */
    public Object f29192Z;

    /* JADX INFO: renamed from: o0 */
    public Object f29193o0;

    /* JADX INFO: renamed from: p0 */
    public Object f29194p0;

    /* JADX INFO: renamed from: q0 */
    public Object f29195q0;

    /* JADX INFO: renamed from: r0 */
    public Object f29196r0;

    /* JADX INFO: renamed from: s0 */
    public Object f29197s0;

    public /* synthetic */ C9683j() {
    }

    /* JADX INFO: renamed from: E */
    public C4256b m10271E() {
        return (C4256b) ((C17314q) this.f29195q0).getValue();
    }

    /* JADX INFO: renamed from: P */
    public boolean m10272P(EnumC15359h enumC15359h) {
        Date date;
        ((C15481d) this.f29192Z).getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f29194p0;
        Date date3 = (Date) concurrentHashMap.get(EnumC15359h.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC15359h.Unknown.equals(enumC15359h) || (date = (Date) concurrentHashMap.get(enumC15359h)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    /* JADX INFO: renamed from: S */
    public C14932d m10273S() {
        ThreadLocal threadLocal = (ThreadLocal) this.f29194p0;
        C16127d c16127d = (C16127d) threadLocal.get();
        C16127d c16127d2 = new C16127d(this, c16127d);
        threadLocal.set(c16127d2);
        if (c16127d == null) {
            m10271E().m5024e();
        }
        return new C14932d(c16127d2);
    }

    /* JADX INFO: renamed from: T */
    public void m10274T(String... queryKeys) {
        AbstractC16544l.m18094g(queryKeys, "queryKeys");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((LinkedHashMap) this.f29197s0)) {
            for (String str : queryKeys) {
                Set set = (Set) ((LinkedHashMap) this.f29197s0).get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m10275W() {
        for (ReplayIntegration replayIntegration : (CopyOnWriteArrayList) this.f29195q0) {
            replayIntegration.getClass();
            if (replayIntegration.f47666x0 instanceof C15287r) {
                if (m10272P(EnumC15359h.All) || m10272P(EnumC15359h.Replay)) {
                    replayIntegration.mo16265e();
                } else {
                    replayIntegration.mo16264a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10276a(EnumC15359h enumC15359h, Date date) {
        Date date2 = (Date) ((ConcurrentHashMap) this.f29194p0).get(enumC15359h);
        if (date2 == null || date.after(date2)) {
            ((ConcurrentHashMap) this.f29194p0).put(enumC15359h, date);
            m10275W();
            synchronized (this.f29197s0) {
                try {
                    if (((Timer) this.f29196r0) == null) {
                        this.f29196r0 = new Timer(true);
                    }
                    ((Timer) this.f29196r0).schedule(new C15192J(this, 1), date);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C17296C c17296c;
        switch (this.f29191Y) {
            case 0:
                ((C13589g) ((InterfaceC13586d) ((InterfaceC17068a) this.f29194p0).get())).close();
                return;
            case 1:
                synchronized (this.f29197s0) {
                    try {
                        Timer timer = (Timer) this.f29196r0;
                        if (timer != null) {
                            timer.cancel();
                            this.f29196r0 = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                ((CopyOnWriteArrayList) this.f29195q0).clear();
                return;
            default:
                ((C16129f) this.f29196r0).evictAll();
                InterfaceC3617d interfaceC3617d = (InterfaceC3617d) this.f29192Z;
                if (interfaceC3617d != null) {
                    interfaceC3617d.close();
                    c17296c = C17296C.f55119a;
                } else {
                    c17296c = null;
                }
                if (c17296c == null) {
                    m10271E().close();
                    return;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: e */
    public C14932d m10277e(Integer num, String str, InterfaceC1436k interfaceC1436k) {
        return new C14932d(m10278k(num, new C16084f(this, 2, str), interfaceC1436k, C16128e.f50050Y));
    }

    /* JADX INFO: renamed from: k */
    public Object m10278k(Integer num, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        C16129f c16129f = (C16129f) this.f29196r0;
        InterfaceC16130g interfaceC16130g = num != null ? (InterfaceC16130g) c16129f.remove(num) : null;
        if (interfaceC16130g == null) {
            interfaceC16130g = (InterfaceC16130g) interfaceC1426a.invoke();
        }
        if (interfaceC1436k != null) {
            try {
                interfaceC1436k.invoke(interfaceC16130g);
            } finally {
                if (num != null) {
                    InterfaceC16130g interfaceC16130g2 = (InterfaceC16130g) c16129f.put(num, interfaceC16130g);
                    if (interfaceC16130g2 != null) {
                        interfaceC16130g2.close();
                    }
                } else {
                    interfaceC16130g.close();
                }
            }
        }
        return interfaceC1436k2.invoke(interfaceC16130g);
    }

    /* JADX INFO: renamed from: m */
    public C14932d m10279m(Integer num, String sql, InterfaceC1436k interfaceC1436k, int i10, InterfaceC1436k interfaceC1436k2) {
        AbstractC16544l.m18094g(sql, "sql");
        return new C14932d(m10278k(num, new C1271m(sql, this, i10, 1), interfaceC1436k2, new C14089m0(4, interfaceC1436k)));
    }

    public C9683j(InterfaceC3617d interfaceC3617d, C4256b c4256b, int i10, Long l4) {
        this.f29192Z = interfaceC3617d;
        this.f29193o0 = l4;
        if (!((interfaceC3617d != null) ^ (c4256b != null))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f29194p0 = new ThreadLocal();
        this.f29195q0 = AbstractC9227W.m9800c(new C16084f(this, 1, c4256b));
        this.f29196r0 = new C16129f(i10);
        this.f29197s0 = new LinkedHashMap();
    }

    public /* synthetic */ C9683j(C4256b c4256b) {
        this(null, c4256b, 1, null);
    }

    public C9683j(C15524y1 c15524y1) {
        C15481d c15481d = C15481d.f48366a;
        this.f29194p0 = new ConcurrentHashMap();
        this.f29195q0 = new CopyOnWriteArrayList();
        this.f29196r0 = null;
        this.f29197s0 = new Object();
        this.f29192Z = c15481d;
        this.f29193o0 = c15524y1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9683j(InterfaceC14934f interfaceC14934f, Context context, String str, C18639a factory, C14974c c14974c, int i10) {
        factory = (i10 & 8) != 0 ? new C18639a(8) : factory;
        C2314l callback = (i10 & 16) != 0 ? new C2314l(interfaceC14934f, new AbstractC14929a[0]) : c14974c;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(factory, "factory");
        AbstractC16544l.m18094g(callback, "callback");
        this(new C4260f(context, str, callback, false, false), null, 20, null);
    }
}
