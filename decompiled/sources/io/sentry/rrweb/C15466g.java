package io.sentry.rrweb;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.HashMap;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.rrweb.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C15466g extends AbstractC15464e implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: p0 */
    public EnumC15465f f48293p0;

    /* JADX INFO: renamed from: q0 */
    public int f48294q0;

    /* JADX INFO: renamed from: r0 */
    public float f48295r0;

    /* JADX INFO: renamed from: s0 */
    public float f48296s0;

    /* JADX INFO: renamed from: t0 */
    public int f48297t0;

    /* JADX INFO: renamed from: u0 */
    public int f48298u0;

    /* JADX INFO: renamed from: v0 */
    public HashMap f48299v0;

    /* JADX INFO: renamed from: w0 */
    public HashMap f48300w0;

    public C15466g() {
        super(EnumC15463d.MouseInteraction);
        this.f48297t0 = 2;
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
        c11248s.m12668o("source");
        c11248s.m12677z(interfaceC15127H, this.f48292o0);
        c11248s.m12668o("type");
        c11248s.m12677z(interfaceC15127H, this.f48293p0);
        c11248s.m12668o(ParameterNames.f31999ID);
        c11248s.m12676y(this.f48294q0);
        c11248s.m12668o("x");
        c11248s.m12675x(this.f48295r0);
        c11248s.m12668o("y");
        c11248s.m12675x(this.f48296s0);
        c11248s.m12668o("pointerType");
        c11248s.m12676y(this.f48297t0);
        c11248s.m12668o("pointerId");
        c11248s.m12676y(this.f48298u0);
        HashMap map = this.f48300w0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48300w0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
        HashMap map2 = this.f48299v0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC14376f.m15826E(this.f48299v0, str2, c11248s, str2, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
