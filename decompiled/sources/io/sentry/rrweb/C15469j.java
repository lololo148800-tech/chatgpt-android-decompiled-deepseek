package io.sentry.rrweb;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.rrweb.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C15469j extends AbstractC15461b implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: o0 */
    public String f48310o0;

    /* JADX INFO: renamed from: p0 */
    public int f48311p0;

    /* JADX INFO: renamed from: q0 */
    public int f48312q0;

    /* JADX INFO: renamed from: r0 */
    public HashMap f48313r0;

    public C15469j() {
        super(EnumC15462c.Meta);
        this.f48310o0 = "";
    }

    @Override // io.sentry.rrweb.AbstractC15461b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15469j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C15469j c15469j = (C15469j) obj;
        return this.f48311p0 == c15469j.f48311p0 && this.f48312q0 == c15469j.f48312q0 && AbstractC8483G3.m9132b(this.f48310o0, c15469j.f48310o0);
    }

    @Override // io.sentry.rrweb.AbstractC15461b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f48310o0, Integer.valueOf(this.f48311p0), Integer.valueOf(this.f48312q0)});
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
        c11248s.m12668o("href");
        c11248s.m12660D(this.f48310o0);
        c11248s.m12668o("height");
        c11248s.m12676y(this.f48311p0);
        c11248s.m12668o("width");
        c11248s.m12676y(this.f48312q0);
        HashMap map = this.f48313r0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48313r0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
        c11248s.m12665h();
    }
}
