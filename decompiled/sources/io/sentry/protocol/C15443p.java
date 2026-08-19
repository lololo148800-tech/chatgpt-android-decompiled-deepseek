package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C15443p implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48193Y;

    /* JADX INFO: renamed from: Z */
    public ConcurrentHashMap f48194Z;

    /* JADX INFO: renamed from: o0 */
    public Integer f48195o0;

    /* JADX INFO: renamed from: p0 */
    public Long f48196p0;

    /* JADX INFO: renamed from: q0 */
    public Object f48197q0;

    /* JADX INFO: renamed from: r0 */
    public ConcurrentHashMap f48198r0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48193Y != null) {
            c11248s.m12668o("cookies");
            c11248s.m12660D(this.f48193Y);
        }
        if (this.f48194Z != null) {
            c11248s.m12668o("headers");
            c11248s.m12677z(interfaceC15127H, this.f48194Z);
        }
        if (this.f48195o0 != null) {
            c11248s.m12668o("status_code");
            c11248s.m12677z(interfaceC15127H, this.f48195o0);
        }
        if (this.f48196p0 != null) {
            c11248s.m12668o("body_size");
            c11248s.m12677z(interfaceC15127H, this.f48196p0);
        }
        if (this.f48197q0 != null) {
            c11248s.m12668o("data");
            c11248s.m12677z(interfaceC15127H, this.f48197q0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48198r0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48198r0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
