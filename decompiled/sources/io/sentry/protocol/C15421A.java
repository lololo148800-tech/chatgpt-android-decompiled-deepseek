package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC15160S0;
import io.sentry.C15126G1;
import io.sentry.C15135J1;
import io.sentry.C15138K1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import io.sentry.metrics.C15407b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p117Eb.C2391u;
import p544W9.AbstractC8680n3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C15421A extends AbstractC15160S0 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: B0 */
    public String f48051B0;

    /* JADX INFO: renamed from: C0 */
    public Double f48052C0;

    /* JADX INFO: renamed from: D0 */
    public Double f48053D0;

    /* JADX INFO: renamed from: E0 */
    public final ArrayList f48054E0;

    /* JADX INFO: renamed from: F0 */
    public final HashMap f48055F0;

    /* JADX INFO: renamed from: G0 */
    public Map f48056G0;

    /* JADX INFO: renamed from: H0 */
    public C15422B f48057H0;

    /* JADX INFO: renamed from: I0 */
    public ConcurrentHashMap f48058I0;

    public C15421A(ArrayList arrayList, HashMap map, C15422B c15422b) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.f48054E0 = arrayList2;
        HashMap map2 = new HashMap();
        this.f48055F0 = map2;
        this.f48051B0 = "";
        this.f48052C0 = dValueOf;
        this.f48053D0 = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f48055F0.putAll(((C15450w) it.next()).f48236x0);
        }
        this.f48057H0 = c15422b;
        this.f48056G0 = null;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48051B0 != null) {
            c11248s.m12668o("transaction");
            c11248s.m12660D(this.f48051B0);
        }
        c11248s.m12668o("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f48052C0.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c11248s.m12677z(interfaceC15127H, bigDecimalValueOf.setScale(6, roundingMode));
        if (this.f48053D0 != null) {
            c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
            c11248s.m12677z(interfaceC15127H, BigDecimal.valueOf(this.f48053D0.doubleValue()).setScale(6, roundingMode));
        }
        ArrayList arrayList = this.f48054E0;
        if (!arrayList.isEmpty()) {
            c11248s.m12668o("spans");
            c11248s.m12677z(interfaceC15127H, arrayList);
        }
        c11248s.m12668o("type");
        c11248s.m12660D("transaction");
        HashMap map = this.f48055F0;
        if (!map.isEmpty()) {
            c11248s.m12668o("measurements");
            c11248s.m12677z(interfaceC15127H, map);
        }
        Map map2 = this.f48056G0;
        if (map2 != null && !map2.isEmpty()) {
            c11248s.m12668o("_metrics_summary");
            c11248s.m12677z(interfaceC15127H, this.f48056G0);
        }
        c11248s.m12668o("transaction_info");
        c11248s.m12677z(interfaceC15127H, this.f48057H0);
        AbstractC8680n3.m9371d(this, c11248s, interfaceC15127H);
        ConcurrentHashMap concurrentHashMap = this.f48058I0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48058I0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }

    public C15421A(C15126G1 c15126g1) {
        super(c15126g1.f47075a);
        this.f48054E0 = new ArrayList();
        this.f48055F0 = new HashMap();
        C15135J1 c15135j1 = c15126g1.f47076b;
        this.f48052C0 = Double.valueOf(c15135j1.f47131a.mo16356d() / 1.0E9d);
        this.f48053D0 = Double.valueOf(c15135j1.f47131a.mo16355c(c15135j1.f47132b) / 1.0E9d);
        this.f48051B0 = c15126g1.f47079e;
        Iterator it = c15126g1.f47077c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C15135J1 c15135j2 = (C15135J1) it.next();
            Boolean bool = Boolean.TRUE;
            C2391u c2391u = c15135j2.f47133c.f47147p0;
            if (bool.equals(c2391u != null ? (Boolean) c2391u.f7430o0 : null)) {
                this.f48054E0.add(new C15450w(c15135j2));
            }
        }
        C15430c c15430c = this.f47195Z;
        c15430c.putAll(c15126g1.f47090p);
        C15138K1 c15138k1 = c15135j1.f47133c;
        c15430c.m16662c(new C15138K1(c15138k1.f47144Y, c15138k1.f47145Z, c15138k1.f47146o0, c15138k1.f47148q0, c15138k1.f47149r0, c15138k1.f47147p0, c15138k1.f47150s0, c15138k1.f47152u0));
        Iterator it2 = c15138k1.f47151t0.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            m16341c((String) entry.getKey(), (String) entry.getValue());
        }
        ConcurrentHashMap concurrentHashMap = c15135j1.f47141k;
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                m16340b(entry2.getValue(), (String) entry2.getKey());
            }
        }
        this.f48057H0 = new C15422B(c15126g1.f47088n.apiName());
        C15407b c15407b = (C15407b) c15135j1.f47143m.m16684a();
        if (c15407b != null) {
            this.f48056G0 = c15407b.m16652a();
        } else {
            this.f48056G0 = null;
        }
    }
}
