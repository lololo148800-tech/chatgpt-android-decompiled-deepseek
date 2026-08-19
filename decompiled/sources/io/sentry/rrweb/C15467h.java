package io.sentry.rrweb;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.HashMap;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.rrweb.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C15467h implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public int f48301Y;

    /* JADX INFO: renamed from: Z */
    public float f48302Z;

    /* JADX INFO: renamed from: o0 */
    public float f48303o0;

    /* JADX INFO: renamed from: p0 */
    public long f48304p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f48305q0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o(ParameterNames.f31999ID);
        c11248s.m12676y(this.f48301Y);
        c11248s.m12668o("x");
        c11248s.m12675x(this.f48302Z);
        c11248s.m12668o("y");
        c11248s.m12675x(this.f48303o0);
        c11248s.m12668o("timeOffset");
        c11248s.m12676y(this.f48304p0);
        HashMap map = this.f48305q0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48305q0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
