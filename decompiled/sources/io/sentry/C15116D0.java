package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15116D0 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f47059Y;

    /* JADX INFO: renamed from: Z */
    public String f47060Z;

    /* JADX INFO: renamed from: o0 */
    public String f47061o0;

    /* JADX INFO: renamed from: p0 */
    public Long f47062p0;

    /* JADX INFO: renamed from: q0 */
    public Long f47063q0;

    /* JADX INFO: renamed from: r0 */
    public Long f47064r0;

    /* JADX INFO: renamed from: s0 */
    public Long f47065s0;

    /* JADX INFO: renamed from: t0 */
    public ConcurrentHashMap f47066t0;

    public C15116D0(InterfaceC15159S interfaceC15159S, Long l4, Long l10) {
        this.f47059Y = interfaceC15159S.mo16283n().toString();
        this.f47060Z = interfaceC15159S.mo16288s().f47144Y.toString();
        this.f47061o0 = interfaceC15159S.getName().isEmpty() ? "unknown" : interfaceC15159S.getName();
        this.f47062p0 = l4;
        this.f47064r0 = l10;
    }

    /* JADX INFO: renamed from: a */
    public final void m16260a(Long l4, Long l10, Long l11, Long l12) {
        if (this.f47063q0 == null) {
            this.f47063q0 = Long.valueOf(l4.longValue() - l10.longValue());
            this.f47062p0 = Long.valueOf(this.f47062p0.longValue() - l10.longValue());
            this.f47065s0 = Long.valueOf(l11.longValue() - l12.longValue());
            this.f47064r0 = Long.valueOf(this.f47064r0.longValue() - l12.longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15116D0.class != obj.getClass()) {
            return false;
        }
        C15116D0 c15116d0 = (C15116D0) obj;
        return this.f47059Y.equals(c15116d0.f47059Y) && this.f47060Z.equals(c15116d0.f47060Z) && this.f47061o0.equals(c15116d0.f47061o0) && this.f47062p0.equals(c15116d0.f47062p0) && this.f47064r0.equals(c15116d0.f47064r0) && AbstractC8483G3.m9132b(this.f47065s0, c15116d0.f47065s0) && AbstractC8483G3.m9132b(this.f47063q0, c15116d0.f47063q0) && AbstractC8483G3.m9132b(this.f47066t0, c15116d0.f47066t0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47059Y, this.f47060Z, this.f47061o0, this.f47062p0, this.f47063q0, this.f47064r0, this.f47065s0, this.f47066t0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o(ParameterNames.f31999ID);
        c11248s.m12677z(interfaceC15127H, this.f47059Y);
        c11248s.m12668o("trace_id");
        c11248s.m12677z(interfaceC15127H, this.f47060Z);
        c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
        c11248s.m12677z(interfaceC15127H, this.f47061o0);
        c11248s.m12668o("relative_start_ns");
        c11248s.m12677z(interfaceC15127H, this.f47062p0);
        c11248s.m12668o("relative_end_ns");
        c11248s.m12677z(interfaceC15127H, this.f47063q0);
        c11248s.m12668o("relative_cpu_start_ms");
        c11248s.m12677z(interfaceC15127H, this.f47064r0);
        c11248s.m12668o("relative_cpu_end_ms");
        c11248s.m12677z(interfaceC15127H, this.f47065s0);
        ConcurrentHashMap concurrentHashMap = this.f47066t0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47066t0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
