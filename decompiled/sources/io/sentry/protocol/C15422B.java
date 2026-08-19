package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C15422B implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final String f48059Y;

    /* JADX INFO: renamed from: Z */
    public ConcurrentHashMap f48060Z;

    public C15422B(String str) {
        this.f48059Y = str;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        String str = this.f48059Y;
        if (str != null) {
            c11248s.m12668o("source");
            c11248s.m12677z(interfaceC15127H, str);
        }
        ConcurrentHashMap concurrentHashMap = this.f48060Z;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48060Z, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
