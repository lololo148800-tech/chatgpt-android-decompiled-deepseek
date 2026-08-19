package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15436i implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final Number f48154Y;

    /* JADX INFO: renamed from: Z */
    public final String f48155Z;

    /* JADX INFO: renamed from: o0 */
    public ConcurrentHashMap f48156o0;

    public C15436i(Number number, String str) {
        this.f48154Y = number;
        this.f48155Z = str;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("value");
        c11248s.m12659B(this.f48154Y);
        String str = this.f48155Z;
        if (str != null) {
            c11248s.m12668o("unit");
            c11248s.m12660D(str);
        }
        ConcurrentHashMap concurrentHashMap = this.f48156o0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48156o0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
