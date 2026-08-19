package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.List;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C15452y implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public List f48257Y;

    /* JADX INFO: renamed from: Z */
    public ConcurrentHashMap f48258Z;

    /* JADX INFO: renamed from: o0 */
    public Boolean f48259o0;

    /* JADX INFO: renamed from: p0 */
    public ConcurrentHashMap f48260p0;

    public C15452y(List list) {
        this.f48257Y = list;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48257Y != null) {
            c11248s.m12668o("frames");
            c11248s.m12677z(interfaceC15127H, this.f48257Y);
        }
        if (this.f48258Z != null) {
            c11248s.m12668o("registers");
            c11248s.m12677z(interfaceC15127H, this.f48258Z);
        }
        if (this.f48259o0 != null) {
            c11248s.m12668o("snapshot");
            c11248s.m12658A(this.f48259o0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48260p0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48260p0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
