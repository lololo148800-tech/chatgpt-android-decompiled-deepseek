package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.Arrays;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C15441n implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48181Y;

    /* JADX INFO: renamed from: Z */
    public String f48182Z;

    /* JADX INFO: renamed from: o0 */
    public String f48183o0;

    /* JADX INFO: renamed from: p0 */
    public Object f48184p0;

    /* JADX INFO: renamed from: q0 */
    public String f48185q0;

    /* JADX INFO: renamed from: r0 */
    public ConcurrentHashMap f48186r0;

    /* JADX INFO: renamed from: s0 */
    public ConcurrentHashMap f48187s0;

    /* JADX INFO: renamed from: t0 */
    public Long f48188t0;

    /* JADX INFO: renamed from: u0 */
    public ConcurrentHashMap f48189u0;

    /* JADX INFO: renamed from: v0 */
    public String f48190v0;

    /* JADX INFO: renamed from: w0 */
    public String f48191w0;

    /* JADX INFO: renamed from: x0 */
    public ConcurrentHashMap f48192x0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15441n.class != obj.getClass()) {
            return false;
        }
        C15441n c15441n = (C15441n) obj;
        return AbstractC8483G3.m9132b(this.f48181Y, c15441n.f48181Y) && AbstractC8483G3.m9132b(this.f48182Z, c15441n.f48182Z) && AbstractC8483G3.m9132b(this.f48183o0, c15441n.f48183o0) && AbstractC8483G3.m9132b(this.f48185q0, c15441n.f48185q0) && AbstractC8483G3.m9132b(this.f48186r0, c15441n.f48186r0) && AbstractC8483G3.m9132b(this.f48187s0, c15441n.f48187s0) && AbstractC8483G3.m9132b(this.f48188t0, c15441n.f48188t0) && AbstractC8483G3.m9132b(this.f48190v0, c15441n.f48190v0) && AbstractC8483G3.m9132b(this.f48191w0, c15441n.f48191w0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48181Y, this.f48182Z, this.f48183o0, this.f48185q0, this.f48186r0, this.f48187s0, this.f48188t0, this.f48190v0, this.f48191w0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48181Y != null) {
            c11248s.m12668o("url");
            c11248s.m12660D(this.f48181Y);
        }
        if (this.f48182Z != null) {
            c11248s.m12668o("method");
            c11248s.m12660D(this.f48182Z);
        }
        if (this.f48183o0 != null) {
            c11248s.m12668o("query_string");
            c11248s.m12660D(this.f48183o0);
        }
        if (this.f48184p0 != null) {
            c11248s.m12668o("data");
            c11248s.m12677z(interfaceC15127H, this.f48184p0);
        }
        if (this.f48185q0 != null) {
            c11248s.m12668o("cookies");
            c11248s.m12660D(this.f48185q0);
        }
        if (this.f48186r0 != null) {
            c11248s.m12668o("headers");
            c11248s.m12677z(interfaceC15127H, this.f48186r0);
        }
        if (this.f48187s0 != null) {
            c11248s.m12668o("env");
            c11248s.m12677z(interfaceC15127H, this.f48187s0);
        }
        if (this.f48189u0 != null) {
            c11248s.m12668o("other");
            c11248s.m12677z(interfaceC15127H, this.f48189u0);
        }
        if (this.f48190v0 != null) {
            c11248s.m12668o("fragment");
            c11248s.m12677z(interfaceC15127H, this.f48190v0);
        }
        if (this.f48188t0 != null) {
            c11248s.m12668o("body_size");
            c11248s.m12677z(interfaceC15127H, this.f48188t0);
        }
        if (this.f48191w0 != null) {
            c11248s.m12668o("api_target");
            c11248s.m12677z(interfaceC15127H, this.f48191w0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48192x0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48192x0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
