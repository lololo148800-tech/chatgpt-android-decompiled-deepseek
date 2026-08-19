package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.Arrays;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C15435h implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48144Y;

    /* JADX INFO: renamed from: Z */
    public Integer f48145Z;

    /* JADX INFO: renamed from: o0 */
    public String f48146o0;

    /* JADX INFO: renamed from: p0 */
    public String f48147p0;

    /* JADX INFO: renamed from: q0 */
    public Integer f48148q0;

    /* JADX INFO: renamed from: r0 */
    public String f48149r0;

    /* JADX INFO: renamed from: s0 */
    public Boolean f48150s0;

    /* JADX INFO: renamed from: t0 */
    public String f48151t0;

    /* JADX INFO: renamed from: u0 */
    public String f48152u0;

    /* JADX INFO: renamed from: v0 */
    public ConcurrentHashMap f48153v0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15435h.class != obj.getClass()) {
            return false;
        }
        C15435h c15435h = (C15435h) obj;
        return AbstractC8483G3.m9132b(this.f48144Y, c15435h.f48144Y) && AbstractC8483G3.m9132b(this.f48145Z, c15435h.f48145Z) && AbstractC8483G3.m9132b(this.f48146o0, c15435h.f48146o0) && AbstractC8483G3.m9132b(this.f48147p0, c15435h.f48147p0) && AbstractC8483G3.m9132b(this.f48148q0, c15435h.f48148q0) && AbstractC8483G3.m9132b(this.f48149r0, c15435h.f48149r0) && AbstractC8483G3.m9132b(this.f48150s0, c15435h.f48150s0) && AbstractC8483G3.m9132b(this.f48151t0, c15435h.f48151t0) && AbstractC8483G3.m9132b(this.f48152u0, c15435h.f48152u0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48144Y, this.f48145Z, this.f48146o0, this.f48147p0, this.f48148q0, this.f48149r0, this.f48150s0, this.f48151t0, this.f48152u0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48144Y != null) {
            c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
            c11248s.m12660D(this.f48144Y);
        }
        if (this.f48145Z != null) {
            c11248s.m12668o(ParameterNames.f31999ID);
            c11248s.m12659B(this.f48145Z);
        }
        if (this.f48146o0 != null) {
            c11248s.m12668o("vendor_id");
            c11248s.m12660D(this.f48146o0);
        }
        if (this.f48147p0 != null) {
            c11248s.m12668o("vendor_name");
            c11248s.m12660D(this.f48147p0);
        }
        if (this.f48148q0 != null) {
            c11248s.m12668o("memory_size");
            c11248s.m12659B(this.f48148q0);
        }
        if (this.f48149r0 != null) {
            c11248s.m12668o("api_type");
            c11248s.m12660D(this.f48149r0);
        }
        if (this.f48150s0 != null) {
            c11248s.m12668o("multi_threaded_rendering");
            c11248s.m12658A(this.f48150s0);
        }
        if (this.f48151t0 != null) {
            c11248s.m12668o("version");
            c11248s.m12660D(this.f48151t0);
        }
        if (this.f48152u0 != null) {
            c11248s.m12668o("npot_support");
            c11248s.m12660D(this.f48152u0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48153v0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48153v0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
