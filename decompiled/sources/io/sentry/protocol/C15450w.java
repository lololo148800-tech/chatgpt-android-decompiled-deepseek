package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC15169V0;
import io.sentry.C15135J1;
import io.sentry.C15138K1;
import io.sentry.C15144M1;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import io.sentry.metrics.C15407b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import p544W9.AbstractC8453B3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C15450w implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final Double f48225Y;

    /* JADX INFO: renamed from: Z */
    public final Double f48226Z;

    /* JADX INFO: renamed from: o0 */
    public final C15447t f48227o0;

    /* JADX INFO: renamed from: p0 */
    public final C15144M1 f48228p0;

    /* JADX INFO: renamed from: q0 */
    public final C15144M1 f48229q0;

    /* JADX INFO: renamed from: r0 */
    public final String f48230r0;

    /* JADX INFO: renamed from: s0 */
    public final String f48231s0;

    /* JADX INFO: renamed from: t0 */
    public final EnumC15147N1 f48232t0;

    /* JADX INFO: renamed from: u0 */
    public final String f48233u0;

    /* JADX INFO: renamed from: v0 */
    public final Map f48234v0;

    /* JADX INFO: renamed from: w0 */
    public Map f48235w0;

    /* JADX INFO: renamed from: x0 */
    public final Map f48236x0;

    /* JADX INFO: renamed from: y0 */
    public final Map f48237y0;

    /* JADX INFO: renamed from: z0 */
    public ConcurrentHashMap f48238z0;

    public C15450w(Double d10, Double d11, C15447t c15447t, C15144M1 c15144m1, C15144M1 c15144m2, String str, String str2, EnumC15147N1 enumC15147N1, String str3, Map map, Map map2, Map map3, Map map4) {
        this.f48225Y = d10;
        this.f48226Z = d11;
        this.f48227o0 = c15447t;
        this.f48228p0 = c15144m1;
        this.f48229q0 = c15144m2;
        this.f48230r0 = str;
        this.f48231s0 = str2;
        this.f48232t0 = enumC15147N1;
        this.f48233u0 = str3;
        this.f48234v0 = map;
        this.f48236x0 = map2;
        this.f48237y0 = map3;
        this.f48235w0 = map4;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f48225Y.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c11248s.m12677z(interfaceC15127H, bigDecimalValueOf.setScale(6, roundingMode));
        Double d10 = this.f48226Z;
        if (d10 != null) {
            c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
            c11248s.m12677z(interfaceC15127H, BigDecimal.valueOf(d10.doubleValue()).setScale(6, roundingMode));
        }
        c11248s.m12668o("trace_id");
        c11248s.m12677z(interfaceC15127H, this.f48227o0);
        c11248s.m12668o("span_id");
        c11248s.m12677z(interfaceC15127H, this.f48228p0);
        C15144M1 c15144m1 = this.f48229q0;
        if (c15144m1 != null) {
            c11248s.m12668o("parent_span_id");
            c11248s.m12677z(interfaceC15127H, c15144m1);
        }
        c11248s.m12668o("op");
        c11248s.m12660D(this.f48230r0);
        String str = this.f48231s0;
        if (str != null) {
            c11248s.m12668o("description");
            c11248s.m12660D(str);
        }
        EnumC15147N1 enumC15147N1 = this.f48232t0;
        if (enumC15147N1 != null) {
            c11248s.m12668o("status");
            c11248s.m12677z(interfaceC15127H, enumC15147N1);
        }
        String str2 = this.f48233u0;
        if (str2 != null) {
            c11248s.m12668o("origin");
            c11248s.m12677z(interfaceC15127H, str2);
        }
        Map map = this.f48234v0;
        if (!map.isEmpty()) {
            c11248s.m12668o("tags");
            c11248s.m12677z(interfaceC15127H, map);
        }
        if (this.f48235w0 != null) {
            c11248s.m12668o("data");
            c11248s.m12677z(interfaceC15127H, this.f48235w0);
        }
        Map map2 = this.f48236x0;
        if (!map2.isEmpty()) {
            c11248s.m12668o("measurements");
            c11248s.m12677z(interfaceC15127H, map2);
        }
        Map map3 = this.f48237y0;
        if (map3 != null && !map3.isEmpty()) {
            c11248s.m12668o("_metrics_summary");
            c11248s.m12677z(interfaceC15127H, map3);
        }
        ConcurrentHashMap concurrentHashMap = this.f48238z0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48238z0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }

    public C15450w(C15135J1 c15135j1) {
        ConcurrentHashMap concurrentHashMap = c15135j1.f47141k;
        C15138K1 c15138k1 = c15135j1.f47133c;
        this.f48231s0 = c15138k1.f47149r0;
        this.f48230r0 = c15138k1.f47148q0;
        this.f48228p0 = c15138k1.f47145Z;
        this.f48229q0 = c15138k1.f47146o0;
        this.f48227o0 = c15138k1.f47144Y;
        this.f48232t0 = c15138k1.f47150s0;
        this.f48233u0 = c15138k1.f47152u0;
        ConcurrentHashMap concurrentHashMapM9064a = AbstractC8453B3.m9064a(c15138k1.f47151t0);
        this.f48234v0 = concurrentHashMapM9064a == null ? new ConcurrentHashMap() : concurrentHashMapM9064a;
        ConcurrentHashMap concurrentHashMapM9064a2 = AbstractC8453B3.m9064a(c15135j1.f47142l);
        this.f48236x0 = concurrentHashMapM9064a2 == null ? new ConcurrentHashMap() : concurrentHashMapM9064a2;
        AbstractC15169V0 abstractC15169V0 = c15135j1.f47132b;
        this.f48226Z = abstractC15169V0 == null ? null : Double.valueOf(c15135j1.f47131a.mo16355c(abstractC15169V0) / 1.0E9d);
        this.f48225Y = Double.valueOf(c15135j1.f47131a.mo16356d() / 1.0E9d);
        this.f48235w0 = concurrentHashMap;
        C15407b c15407b = (C15407b) c15135j1.f47143m.m16684a();
        if (c15407b != null) {
            this.f48237y0 = c15407b.m16652a();
        } else {
            this.f48237y0 = null;
        }
    }
}
