package io.sentry.rrweb;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.rrweb.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C15470k extends AbstractC15461b implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: o0 */
    public String f48314o0;

    /* JADX INFO: renamed from: p0 */
    public String f48315p0;

    /* JADX INFO: renamed from: q0 */
    public String f48316q0;

    /* JADX INFO: renamed from: r0 */
    public double f48317r0;

    /* JADX INFO: renamed from: s0 */
    public double f48318s0;

    /* JADX INFO: renamed from: t0 */
    public ConcurrentHashMap f48319t0;

    /* JADX INFO: renamed from: u0 */
    public HashMap f48320u0;

    /* JADX INFO: renamed from: v0 */
    public ConcurrentHashMap f48321v0;

    /* JADX INFO: renamed from: w0 */
    public ConcurrentHashMap f48322w0;

    public C15470k() {
        super(EnumC15462c.Custom);
        this.f48314o0 = "performanceSpan";
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("type");
        c11248s.m12677z(interfaceC15127H, this.f48290Y);
        c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
        c11248s.m12676y(this.f48291Z);
        c11248s.m12668o("data");
        c11248s.m12663d();
        c11248s.m12668o(ParameterNames.TAG);
        c11248s.m12660D(this.f48314o0);
        c11248s.m12668o("payload");
        c11248s.m12663d();
        if (this.f48315p0 != null) {
            c11248s.m12668o("op");
            c11248s.m12660D(this.f48315p0);
        }
        if (this.f48316q0 != null) {
            c11248s.m12668o("description");
            c11248s.m12660D(this.f48316q0);
        }
        c11248s.m12668o("startTimestamp");
        c11248s.m12677z(interfaceC15127H, BigDecimal.valueOf(this.f48317r0));
        c11248s.m12668o("endTimestamp");
        c11248s.m12677z(interfaceC15127H, BigDecimal.valueOf(this.f48318s0));
        if (this.f48319t0 != null) {
            c11248s.m12668o("data");
            c11248s.m12677z(interfaceC15127H, this.f48319t0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48321v0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48321v0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
        ConcurrentHashMap concurrentHashMap2 = this.f48322w0;
        if (concurrentHashMap2 != null) {
            for (K k10 : concurrentHashMap2.keySet()) {
                AbstractC14376f.m15827F(this.f48322w0, k10, c11248s, k10, interfaceC15127H);
            }
        }
        c11248s.m12665h();
        HashMap map = this.f48320u0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48320u0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
