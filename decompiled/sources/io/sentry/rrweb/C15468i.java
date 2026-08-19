package io.sentry.rrweb;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.rrweb.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15468i extends AbstractC15464e implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: p0 */
    public int f48306p0;

    /* JADX INFO: renamed from: q0 */
    public List f48307q0;

    /* JADX INFO: renamed from: r0 */
    public HashMap f48308r0;

    /* JADX INFO: renamed from: s0 */
    public HashMap f48309s0;

    public C15468i() {
        super(EnumC15463d.TouchMove);
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
        List list = this.f48307q0;
        if (list != null && !list.isEmpty()) {
            c11248s.m12668o("positions");
            c11248s.m12677z(interfaceC15127H, this.f48307q0);
        }
        c11248s.m12668o("pointerId");
        c11248s.m12676y(this.f48306p0);
        HashMap map = this.f48309s0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48309s0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
        HashMap map2 = this.f48308r0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC14376f.m15826E(this.f48308r0, str2, c11248s, str2, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
