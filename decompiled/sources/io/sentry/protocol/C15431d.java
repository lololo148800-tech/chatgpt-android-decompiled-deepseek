package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.HashMap;
import java.util.List;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.protocol.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15431d implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public C15444q f48102Y;

    /* JADX INFO: renamed from: Z */
    public List f48103Z;

    /* JADX INFO: renamed from: o0 */
    public HashMap f48104o0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48102Y != null) {
            c11248s.m12668o("sdk_info");
            c11248s.m12677z(interfaceC15127H, this.f48102Y);
        }
        if (this.f48103Z != null) {
            c11248s.m12668o("images");
            c11248s.m12677z(interfaceC15127H, this.f48103Z);
        }
        HashMap map = this.f48104o0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48104o0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
