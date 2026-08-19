package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.Map;
import p315Me.Myis.CxcULo;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C15453z implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public Long f48261Y;

    /* JADX INFO: renamed from: Z */
    public Integer f48262Z;

    /* JADX INFO: renamed from: o0 */
    public String f48263o0;

    /* JADX INFO: renamed from: p0 */
    public String f48264p0;

    /* JADX INFO: renamed from: q0 */
    public Boolean f48265q0;

    /* JADX INFO: renamed from: r0 */
    public Boolean f48266r0;

    /* JADX INFO: renamed from: s0 */
    public Boolean f48267s0;

    /* JADX INFO: renamed from: t0 */
    public Boolean f48268t0;

    /* JADX INFO: renamed from: u0 */
    public C15452y f48269u0;

    /* JADX INFO: renamed from: v0 */
    public Map f48270v0;

    /* JADX INFO: renamed from: w0 */
    public ConcurrentHashMap f48271w0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48261Y != null) {
            c11248s.m12668o(ParameterNames.f31999ID);
            c11248s.m12659B(this.f48261Y);
        }
        if (this.f48262Z != null) {
            c11248s.m12668o("priority");
            c11248s.m12659B(this.f48262Z);
        }
        if (this.f48263o0 != null) {
            c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
            c11248s.m12660D(this.f48263o0);
        }
        if (this.f48264p0 != null) {
            c11248s.m12668o("state");
            c11248s.m12660D(this.f48264p0);
        }
        if (this.f48265q0 != null) {
            c11248s.m12668o(CxcULo.HrPA);
            c11248s.m12658A(this.f48265q0);
        }
        if (this.f48266r0 != null) {
            c11248s.m12668o("current");
            c11248s.m12658A(this.f48266r0);
        }
        if (this.f48267s0 != null) {
            c11248s.m12668o("daemon");
            c11248s.m12658A(this.f48267s0);
        }
        if (this.f48268t0 != null) {
            c11248s.m12668o("main");
            c11248s.m12658A(this.f48268t0);
        }
        if (this.f48269u0 != null) {
            c11248s.m12668o("stacktrace");
            c11248s.m12677z(interfaceC15127H, this.f48269u0);
        }
        if (this.f48270v0 != null) {
            c11248s.m12668o("held_locks");
            c11248s.m12677z(interfaceC15127H, this.f48270v0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48271w0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48271w0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
