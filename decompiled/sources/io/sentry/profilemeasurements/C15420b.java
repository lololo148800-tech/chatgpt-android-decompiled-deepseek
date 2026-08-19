package io.sentry.profilemeasurements;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.util.Arrays;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.profilemeasurements.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15420b implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public ConcurrentHashMap f48048Y;

    /* JADX INFO: renamed from: Z */
    public String f48049Z;

    /* JADX INFO: renamed from: o0 */
    public double f48050o0;

    public C15420b(Long l4, Number number) {
        this.f48049Z = l4.toString();
        this.f48050o0 = number.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15420b.class != obj.getClass()) {
            return false;
        }
        C15420b c15420b = (C15420b) obj;
        return AbstractC8483G3.m9132b(this.f48048Y, c15420b.f48048Y) && this.f48049Z.equals(c15420b.f48049Z) && this.f48050o0 == c15420b.f48050o0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48048Y, this.f48049Z, Double.valueOf(this.f48050o0)});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("value");
        c11248s.m12677z(interfaceC15127H, Double.valueOf(this.f48050o0));
        c11248s.m12668o("elapsed_since_start_ns");
        c11248s.m12677z(interfaceC15127H, this.f48049Z);
        ConcurrentHashMap concurrentHashMap = this.f48048Y;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48048Y, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
