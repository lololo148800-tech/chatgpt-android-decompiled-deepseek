package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C15434g implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48140Y;

    /* JADX INFO: renamed from: Z */
    public String f48141Z;

    /* JADX INFO: renamed from: o0 */
    public String f48142o0;

    /* JADX INFO: renamed from: p0 */
    public ConcurrentHashMap f48143p0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48140Y != null) {
            c11248s.m12668o("city");
            c11248s.m12660D(this.f48140Y);
        }
        if (this.f48141Z != null) {
            c11248s.m12668o("country_code");
            c11248s.m12660D(this.f48141Z);
        }
        if (this.f48142o0 != null) {
            c11248s.m12668o("region");
            c11248s.m12660D(this.f48142o0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48143p0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48143p0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
