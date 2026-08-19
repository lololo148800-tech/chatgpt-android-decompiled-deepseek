package io.sentry;

import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15447t;
import java.util.Date;
import java.util.HashMap;
import p544W9.AbstractC8656j3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.X0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15175X0 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final C15447t f47239Y;

    /* JADX INFO: renamed from: Z */
    public final C15445r f47240Z;

    /* JADX INFO: renamed from: o0 */
    public final C15158R1 f47241o0;

    /* JADX INFO: renamed from: p0 */
    public Date f47242p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f47243q0;

    public C15175X0(C15447t c15447t, C15445r c15445r, C15158R1 c15158r1) {
        this.f47239Y = c15447t;
        this.f47240Z = c15445r;
        this.f47241o0 = c15158r1;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        C15447t c15447t = this.f47239Y;
        if (c15447t != null) {
            c11248s.m12668o("event_id");
            c11248s.m12677z(interfaceC15127H, c15447t);
        }
        C15445r c15445r = this.f47240Z;
        if (c15445r != null) {
            c11248s.m12668o("sdk");
            c11248s.m12677z(interfaceC15127H, c15445r);
        }
        C15158R1 c15158r1 = this.f47241o0;
        if (c15158r1 != null) {
            c11248s.m12668o("trace");
            c11248s.m12677z(interfaceC15127H, c15158r1);
        }
        if (this.f47242p0 != null) {
            c11248s.m12668o("sent_at");
            c11248s.m12677z(interfaceC15127H, AbstractC8656j3.m9344l(this.f47242p0));
        }
        HashMap map = this.f47243q0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f47243q0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
