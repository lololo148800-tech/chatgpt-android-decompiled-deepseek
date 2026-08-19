package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.HashMap;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C15437j implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48157Y;

    /* JADX INFO: renamed from: Z */
    public String f48158Z;

    /* JADX INFO: renamed from: o0 */
    public String f48159o0;

    /* JADX INFO: renamed from: p0 */
    public Boolean f48160p0;

    /* JADX INFO: renamed from: q0 */
    public ConcurrentHashMap f48161q0;

    /* JADX INFO: renamed from: r0 */
    public ConcurrentHashMap f48162r0;

    /* JADX INFO: renamed from: s0 */
    public Boolean f48163s0;

    /* JADX INFO: renamed from: t0 */
    public HashMap f48164t0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48157Y != null) {
            c11248s.m12668o("type");
            c11248s.m12660D(this.f48157Y);
        }
        if (this.f48158Z != null) {
            c11248s.m12668o("description");
            c11248s.m12660D(this.f48158Z);
        }
        if (this.f48159o0 != null) {
            c11248s.m12668o("help_link");
            c11248s.m12660D(this.f48159o0);
        }
        if (this.f48160p0 != null) {
            c11248s.m12668o("handled");
            c11248s.m12658A(this.f48160p0);
        }
        if (this.f48161q0 != null) {
            c11248s.m12668o("meta");
            c11248s.m12677z(interfaceC15127H, this.f48161q0);
        }
        if (this.f48162r0 != null) {
            c11248s.m12668o("data");
            c11248s.m12677z(interfaceC15127H, this.f48162r0);
        }
        if (this.f48163s0 != null) {
            c11248s.m12668o("synthetic");
            c11248s.m12658A(this.f48163s0);
        }
        HashMap map = this.f48164t0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48164t0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
