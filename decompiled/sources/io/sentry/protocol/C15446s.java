package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.HashMap;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.protocol.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C15446s implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48209Y;

    /* JADX INFO: renamed from: Z */
    public String f48210Z;

    /* JADX INFO: renamed from: o0 */
    public String f48211o0;

    /* JADX INFO: renamed from: p0 */
    public Long f48212p0;

    /* JADX INFO: renamed from: q0 */
    public C15452y f48213q0;

    /* JADX INFO: renamed from: r0 */
    public C15437j f48214r0;

    /* JADX INFO: renamed from: s0 */
    public HashMap f48215s0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48209Y != null) {
            c11248s.m12668o("type");
            c11248s.m12660D(this.f48209Y);
        }
        if (this.f48210Z != null) {
            c11248s.m12668o("value");
            c11248s.m12660D(this.f48210Z);
        }
        if (this.f48211o0 != null) {
            c11248s.m12668o("module");
            c11248s.m12660D(this.f48211o0);
        }
        if (this.f48212p0 != null) {
            c11248s.m12668o("thread_id");
            c11248s.m12659B(this.f48212p0);
        }
        if (this.f48213q0 != null) {
            c11248s.m12668o("stacktrace");
            c11248s.m12677z(interfaceC15127H, this.f48213q0);
        }
        if (this.f48214r0 != null) {
            c11248s.m12668o("mechanism");
            c11248s.m12677z(interfaceC15127H, this.f48214r0);
        }
        HashMap map = this.f48215s0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48215s0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
