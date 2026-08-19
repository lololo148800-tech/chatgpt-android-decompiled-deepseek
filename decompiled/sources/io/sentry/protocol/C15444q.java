package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.HashMap;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.protocol.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C15444q implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48199Y;

    /* JADX INFO: renamed from: Z */
    public Integer f48200Z;

    /* JADX INFO: renamed from: o0 */
    public Integer f48201o0;

    /* JADX INFO: renamed from: p0 */
    public Integer f48202p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f48203q0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48199Y != null) {
            c11248s.m12668o("sdk_name");
            c11248s.m12660D(this.f48199Y);
        }
        if (this.f48200Z != null) {
            c11248s.m12668o("version_major");
            c11248s.m12659B(this.f48200Z);
        }
        if (this.f48201o0 != null) {
            c11248s.m12668o("version_minor");
            c11248s.m12659B(this.f48201o0);
        }
        if (this.f48202p0 != null) {
            c11248s.m12668o("version_patchlevel");
            c11248s.m12659B(this.f48202p0);
        }
        HashMap map = this.f48203q0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48203q0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
