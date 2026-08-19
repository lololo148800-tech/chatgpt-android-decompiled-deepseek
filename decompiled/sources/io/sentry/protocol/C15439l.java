package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import p658b5.C11248s;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15439l implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public double f48169Y;

    /* JADX INFO: renamed from: Z */
    public double f48170Z;

    /* JADX INFO: renamed from: o0 */
    public double f48171o0;

    /* JADX INFO: renamed from: p0 */
    public int f48172p0;

    /* JADX INFO: renamed from: q0 */
    public ConcurrentHashMap f48173q0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("min");
        c11248s.m12675x(this.f48169Y);
        c11248s.m12668o("max");
        c11248s.m12675x(this.f48170Z);
        c11248s.m12668o("sum");
        c11248s.m12675x(this.f48171o0);
        c11248s.m12668o("count");
        c11248s.m12676y(this.f48172p0);
        if (this.f48173q0 != null) {
            c11248s.m12668o("tags");
            c11248s.m12677z(interfaceC15127H, this.f48173q0);
        }
        c11248s.m12665h();
    }
}
