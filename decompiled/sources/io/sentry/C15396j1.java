package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.j1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15396j1 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public int f47990Y;

    /* JADX INFO: renamed from: Z */
    public String f47991Z;

    /* JADX INFO: renamed from: o0 */
    public String f47992o0;

    /* JADX INFO: renamed from: p0 */
    public String f47993p0;

    /* JADX INFO: renamed from: q0 */
    public Long f47994q0;

    /* JADX INFO: renamed from: r0 */
    public ConcurrentHashMap f47995r0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15396j1.class != obj.getClass()) {
            return false;
        }
        return AbstractC8483G3.m9132b(this.f47991Z, ((C15396j1) obj).f47991Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47991Z});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("type");
        c11248s.m12676y(this.f47990Y);
        if (this.f47991Z != null) {
            c11248s.m12668o("address");
            c11248s.m12660D(this.f47991Z);
        }
        if (this.f47992o0 != null) {
            c11248s.m12668o("package_name");
            c11248s.m12660D(this.f47992o0);
        }
        if (this.f47993p0 != null) {
            c11248s.m12668o("class_name");
            c11248s.m12660D(this.f47993p0);
        }
        if (this.f47994q0 != null) {
            c11248s.m12668o("thread_id");
            c11248s.m12659B(this.f47994q0);
        }
        ConcurrentHashMap concurrentHashMap = this.f47995r0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47995r0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
