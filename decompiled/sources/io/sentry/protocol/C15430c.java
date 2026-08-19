package io.sentry.protocol;

import io.sentry.C15138K1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p544W9.AbstractC8453B3;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15430c extends ConcurrentHashMap implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final Object f48101Y = new Object();

    public C15430c() {
    }

    /* JADX INFO: renamed from: a */
    public final C15138K1 m16660a() {
        return (C15138K1) m16663d(C15138K1.class, "trace");
    }

    /* JADX INFO: renamed from: b */
    public final void m16661b(C15428a c15428a) {
        put("app", c15428a);
    }

    /* JADX INFO: renamed from: c */
    public final void m16662c(C15138K1 c15138k1) {
        AbstractC8483G3.m9133c(c15138k1, "traceContext is required");
        put("trace", c15138k1);
    }

    /* JADX INFO: renamed from: d */
    public final Object m16663d(Class cls, String str) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                c11248s.m12668o(str);
                c11248s.m12677z(interfaceC15127H, obj);
            }
        }
        c11248s.m12665h();
    }

    public C15430c(C15430c c15430c) {
        Iterator it = c15430c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C15428a)) {
                    C15428a c15428a = (C15428a) value;
                    C15428a c15428a2 = new C15428a();
                    c15428a2.f48092s0 = c15428a.f48092s0;
                    c15428a2.f48086Y = c15428a.f48086Y;
                    c15428a2.f48090q0 = c15428a.f48090q0;
                    c15428a2.f48087Z = c15428a.f48087Z;
                    c15428a2.f48091r0 = c15428a.f48091r0;
                    c15428a2.f48089p0 = c15428a.f48089p0;
                    c15428a2.f48088o0 = c15428a.f48088o0;
                    c15428a2.f48093t0 = AbstractC8453B3.m9064a(c15428a.f48093t0);
                    c15428a2.f48096w0 = c15428a.f48096w0;
                    List list = c15428a.f48094u0;
                    c15428a2.f48094u0 = list != null ? new ArrayList(list) : null;
                    c15428a2.f48095v0 = c15428a.f48095v0;
                    c15428a2.f48097x0 = AbstractC8453B3.m9064a(c15428a.f48097x0);
                    m16661b(c15428a2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof C15429b)) {
                    C15429b c15429b = (C15429b) value;
                    C15429b c15429b2 = new C15429b();
                    c15429b2.f48098Y = c15429b.f48098Y;
                    c15429b2.f48099Z = c15429b.f48099Z;
                    c15429b2.f48100o0 = AbstractC8453B3.m9064a(c15429b.f48100o0);
                    put("browser", c15429b2);
                } else if ("device".equals(entry.getKey()) && (value instanceof C15433f)) {
                    C15433f c15433f = (C15433f) value;
                    C15433f c15433f2 = new C15433f();
                    c15433f2.f48126Y = c15433f.f48126Y;
                    c15433f2.f48127Z = c15433f.f48127Z;
                    c15433f2.f48128o0 = c15433f.f48128o0;
                    c15433f2.f48129p0 = c15433f.f48129p0;
                    c15433f2.f48130q0 = c15433f.f48130q0;
                    c15433f2.f48131r0 = c15433f.f48131r0;
                    c15433f2.f48134u0 = c15433f.f48134u0;
                    c15433f2.f48135v0 = c15433f.f48135v0;
                    c15433f2.f48136w0 = c15433f.f48136w0;
                    c15433f2.f48137x0 = c15433f.f48137x0;
                    c15433f2.f48138y0 = c15433f.f48138y0;
                    c15433f2.f48139z0 = c15433f.f48139z0;
                    c15433f2.f48105A0 = c15433f.f48105A0;
                    c15433f2.f48106B0 = c15433f.f48106B0;
                    c15433f2.f48107C0 = c15433f.f48107C0;
                    c15433f2.f48108D0 = c15433f.f48108D0;
                    c15433f2.f48109E0 = c15433f.f48109E0;
                    c15433f2.f48110F0 = c15433f.f48110F0;
                    c15433f2.f48111G0 = c15433f.f48111G0;
                    c15433f2.f48112H0 = c15433f.f48112H0;
                    c15433f2.f48113I0 = c15433f.f48113I0;
                    c15433f2.f48114J0 = c15433f.f48114J0;
                    c15433f2.f48115K0 = c15433f.f48115K0;
                    c15433f2.f48117M0 = c15433f.f48117M0;
                    c15433f2.f48118N0 = c15433f.f48118N0;
                    c15433f2.f48120P0 = c15433f.f48120P0;
                    c15433f2.f48121Q0 = c15433f.f48121Q0;
                    c15433f2.f48133t0 = c15433f.f48133t0;
                    String[] strArr = c15433f.f48132s0;
                    c15433f2.f48132s0 = strArr != null ? (String[]) strArr.clone() : null;
                    c15433f2.f48119O0 = c15433f.f48119O0;
                    TimeZone timeZone = c15433f.f48116L0;
                    c15433f2.f48116L0 = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    c15433f2.f48122R0 = c15433f.f48122R0;
                    c15433f2.f48123S0 = c15433f.f48123S0;
                    c15433f2.f48124T0 = c15433f.f48124T0;
                    c15433f2.f48125U0 = AbstractC8453B3.m9064a(c15433f.f48125U0);
                    put("device", c15433f2);
                } else if ("os".equals(entry.getKey()) && (value instanceof C15440m)) {
                    C15440m c15440m = (C15440m) value;
                    C15440m c15440m2 = new C15440m();
                    c15440m2.f48174Y = c15440m.f48174Y;
                    c15440m2.f48175Z = c15440m.f48175Z;
                    c15440m2.f48176o0 = c15440m.f48176o0;
                    c15440m2.f48177p0 = c15440m.f48177p0;
                    c15440m2.f48178q0 = c15440m.f48178q0;
                    c15440m2.f48179r0 = c15440m.f48179r0;
                    c15440m2.f48180s0 = AbstractC8453B3.m9064a(c15440m.f48180s0);
                    put("os", c15440m2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C15449v)) {
                    C15449v c15449v = (C15449v) value;
                    C15449v c15449v2 = new C15449v();
                    c15449v2.f48221Y = c15449v.f48221Y;
                    c15449v2.f48222Z = c15449v.f48222Z;
                    c15449v2.f48223o0 = c15449v.f48223o0;
                    c15449v2.f48224p0 = AbstractC8453B3.m9064a(c15449v.f48224p0);
                    put("runtime", c15449v2);
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C15435h)) {
                    C15435h c15435h = (C15435h) value;
                    C15435h c15435h2 = new C15435h();
                    c15435h2.f48144Y = c15435h.f48144Y;
                    c15435h2.f48145Z = c15435h.f48145Z;
                    c15435h2.f48146o0 = c15435h.f48146o0;
                    c15435h2.f48147p0 = c15435h.f48147p0;
                    c15435h2.f48148q0 = c15435h.f48148q0;
                    c15435h2.f48149r0 = c15435h.f48149r0;
                    c15435h2.f48150s0 = c15435h.f48150s0;
                    c15435h2.f48151t0 = c15435h.f48151t0;
                    c15435h2.f48152u0 = c15435h.f48152u0;
                    c15435h2.f48153v0 = AbstractC8453B3.m9064a(c15435h.f48153v0);
                    put("gpu", c15435h2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof C15138K1)) {
                    m16662c(new C15138K1((C15138K1) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof C15443p)) {
                    C15443p c15443p = (C15443p) value;
                    C15443p c15443p2 = new C15443p();
                    c15443p2.f48193Y = c15443p.f48193Y;
                    c15443p2.f48194Z = AbstractC8453B3.m9064a(c15443p.f48194Z);
                    c15443p2.f48198r0 = AbstractC8453B3.m9064a(c15443p.f48198r0);
                    c15443p2.f48195o0 = c15443p.f48195o0;
                    c15443p2.f48196p0 = c15443p.f48196p0;
                    c15443p2.f48197q0 = c15443p.f48197q0;
                    synchronized (this.f48101Y) {
                        put("response", c15443p2);
                    }
                } else {
                    put((String) entry.getKey(), value);
                }
            }
        }
    }
}
