package io.sentry.protocol;

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

/* JADX INFO: renamed from: io.sentry.protocol.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C15440m implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48174Y;

    /* JADX INFO: renamed from: Z */
    public String f48175Z;

    /* JADX INFO: renamed from: o0 */
    public String f48176o0;

    /* JADX INFO: renamed from: p0 */
    public String f48177p0;

    /* JADX INFO: renamed from: q0 */
    public String f48178q0;

    /* JADX INFO: renamed from: r0 */
    public Boolean f48179r0;

    /* JADX INFO: renamed from: s0 */
    public ConcurrentHashMap f48180s0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15440m.class != obj.getClass()) {
            return false;
        }
        C15440m c15440m = (C15440m) obj;
        return AbstractC8483G3.m9132b(this.f48174Y, c15440m.f48174Y) && AbstractC8483G3.m9132b(this.f48175Z, c15440m.f48175Z) && AbstractC8483G3.m9132b(this.f48176o0, c15440m.f48176o0) && AbstractC8483G3.m9132b(this.f48177p0, c15440m.f48177p0) && AbstractC8483G3.m9132b(this.f48178q0, c15440m.f48178q0) && AbstractC8483G3.m9132b(this.f48179r0, c15440m.f48179r0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48174Y, this.f48175Z, this.f48176o0, this.f48177p0, this.f48178q0, this.f48179r0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48174Y != null) {
            c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
            c11248s.m12660D(this.f48174Y);
        }
        if (this.f48175Z != null) {
            c11248s.m12668o("version");
            c11248s.m12660D(this.f48175Z);
        }
        if (this.f48176o0 != null) {
            c11248s.m12668o("raw_description");
            c11248s.m12660D(this.f48176o0);
        }
        if (this.f48177p0 != null) {
            c11248s.m12668o("build");
            c11248s.m12660D(this.f48177p0);
        }
        if (this.f48178q0 != null) {
            c11248s.m12668o("kernel_version");
            c11248s.m12660D(this.f48178q0);
        }
        if (this.f48179r0 != null) {
            c11248s.m12668o("rooted");
            c11248s.m12658A(this.f48179r0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48180s0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48180s0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
