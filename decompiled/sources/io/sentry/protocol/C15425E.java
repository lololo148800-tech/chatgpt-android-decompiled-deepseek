package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.Arrays;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C15425E implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48062Y;

    /* JADX INFO: renamed from: Z */
    public String f48063Z;

    /* JADX INFO: renamed from: o0 */
    public String f48064o0;

    /* JADX INFO: renamed from: p0 */
    public String f48065p0;

    /* JADX INFO: renamed from: q0 */
    public String f48066q0;

    /* JADX INFO: renamed from: r0 */
    public String f48067r0;

    /* JADX INFO: renamed from: s0 */
    public C15434g f48068s0;

    /* JADX INFO: renamed from: t0 */
    public ConcurrentHashMap f48069t0;

    /* JADX INFO: renamed from: u0 */
    public ConcurrentHashMap f48070u0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15425E.class != obj.getClass()) {
            return false;
        }
        C15425E c15425e = (C15425E) obj;
        return AbstractC8483G3.m9132b(this.f48062Y, c15425e.f48062Y) && AbstractC8483G3.m9132b(this.f48063Z, c15425e.f48063Z) && AbstractC8483G3.m9132b(this.f48064o0, c15425e.f48064o0) && AbstractC8483G3.m9132b(this.f48065p0, c15425e.f48065p0) && AbstractC8483G3.m9132b(this.f48066q0, c15425e.f48066q0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48062Y, this.f48063Z, this.f48064o0, this.f48065p0, this.f48066q0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48062Y != null) {
            c11248s.m12668o("email");
            c11248s.m12660D(this.f48062Y);
        }
        if (this.f48063Z != null) {
            c11248s.m12668o(ParameterNames.f31999ID);
            c11248s.m12660D(this.f48063Z);
        }
        if (this.f48064o0 != null) {
            c11248s.m12668o("username");
            c11248s.m12660D(this.f48064o0);
        }
        if (this.f48065p0 != null) {
            c11248s.m12668o("segment");
            c11248s.m12660D(this.f48065p0);
        }
        if (this.f48066q0 != null) {
            c11248s.m12668o("ip_address");
            c11248s.m12660D(this.f48066q0);
        }
        if (this.f48067r0 != null) {
            c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
            c11248s.m12660D(this.f48067r0);
        }
        if (this.f48068s0 != null) {
            c11248s.m12668o("geo");
            this.f48068s0.serialize(c11248s, interfaceC15127H);
        }
        if (this.f48069t0 != null) {
            c11248s.m12668o("data");
            c11248s.m12677z(interfaceC15127H, this.f48069t0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48070u0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48070u0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
