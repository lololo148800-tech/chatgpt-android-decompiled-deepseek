package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15428a implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48086Y;

    /* JADX INFO: renamed from: Z */
    public Date f48087Z;

    /* JADX INFO: renamed from: o0 */
    public String f48088o0;

    /* JADX INFO: renamed from: p0 */
    public String f48089p0;

    /* JADX INFO: renamed from: q0 */
    public String f48090q0;

    /* JADX INFO: renamed from: r0 */
    public String f48091r0;

    /* JADX INFO: renamed from: s0 */
    public String f48092s0;

    /* JADX INFO: renamed from: t0 */
    public AbstractMap f48093t0;

    /* JADX INFO: renamed from: u0 */
    public List f48094u0;

    /* JADX INFO: renamed from: v0 */
    public String f48095v0;

    /* JADX INFO: renamed from: w0 */
    public Boolean f48096w0;

    /* JADX INFO: renamed from: x0 */
    public ConcurrentHashMap f48097x0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15428a.class != obj.getClass()) {
            return false;
        }
        C15428a c15428a = (C15428a) obj;
        return AbstractC8483G3.m9132b(this.f48086Y, c15428a.f48086Y) && AbstractC8483G3.m9132b(this.f48087Z, c15428a.f48087Z) && AbstractC8483G3.m9132b(this.f48088o0, c15428a.f48088o0) && AbstractC8483G3.m9132b(this.f48089p0, c15428a.f48089p0) && AbstractC8483G3.m9132b(this.f48090q0, c15428a.f48090q0) && AbstractC8483G3.m9132b(this.f48091r0, c15428a.f48091r0) && AbstractC8483G3.m9132b(this.f48092s0, c15428a.f48092s0) && AbstractC8483G3.m9132b(this.f48093t0, c15428a.f48093t0) && AbstractC8483G3.m9132b(this.f48096w0, c15428a.f48096w0) && AbstractC8483G3.m9132b(this.f48094u0, c15428a.f48094u0) && AbstractC8483G3.m9132b(this.f48095v0, c15428a.f48095v0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48086Y, this.f48087Z, this.f48088o0, this.f48089p0, this.f48090q0, this.f48091r0, this.f48092s0, this.f48093t0, this.f48096w0, this.f48094u0, this.f48095v0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48086Y != null) {
            c11248s.m12668o("app_identifier");
            c11248s.m12660D(this.f48086Y);
        }
        if (this.f48087Z != null) {
            c11248s.m12668o("app_start_time");
            c11248s.m12677z(interfaceC15127H, this.f48087Z);
        }
        if (this.f48088o0 != null) {
            c11248s.m12668o("device_app_hash");
            c11248s.m12660D(this.f48088o0);
        }
        if (this.f48089p0 != null) {
            c11248s.m12668o("build_type");
            c11248s.m12660D(this.f48089p0);
        }
        if (this.f48090q0 != null) {
            c11248s.m12668o("app_name");
            c11248s.m12660D(this.f48090q0);
        }
        if (this.f48091r0 != null) {
            c11248s.m12668o("app_version");
            c11248s.m12660D(this.f48091r0);
        }
        if (this.f48092s0 != null) {
            c11248s.m12668o("app_build");
            c11248s.m12660D(this.f48092s0);
        }
        AbstractMap abstractMap = this.f48093t0;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            c11248s.m12668o("permissions");
            c11248s.m12677z(interfaceC15127H, this.f48093t0);
        }
        if (this.f48096w0 != null) {
            c11248s.m12668o("in_foreground");
            c11248s.m12658A(this.f48096w0);
        }
        if (this.f48094u0 != null) {
            c11248s.m12668o("view_names");
            c11248s.m12677z(interfaceC15127H, this.f48094u0);
        }
        if (this.f48095v0 != null) {
            c11248s.m12668o("start_type");
            c11248s.m12660D(this.f48095v0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48097x0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48097x0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
