package io.sentry;

import io.sentry.protocol.C15447t;
import java.util.Arrays;
import p117Eb.C2391u;
import p544W9.AbstractC8453B3;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.K1 */
/* JADX INFO: loaded from: classes3.dex */
public class C15138K1 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final C15447t f47144Y;

    /* JADX INFO: renamed from: Z */
    public final C15144M1 f47145Z;

    /* JADX INFO: renamed from: o0 */
    public final C15144M1 f47146o0;

    /* JADX INFO: renamed from: p0 */
    public transient C2391u f47147p0;

    /* JADX INFO: renamed from: q0 */
    public final String f47148q0;

    /* JADX INFO: renamed from: r0 */
    public String f47149r0;

    /* JADX INFO: renamed from: s0 */
    public EnumC15147N1 f47150s0;

    /* JADX INFO: renamed from: t0 */
    public ConcurrentHashMap f47151t0;

    /* JADX INFO: renamed from: u0 */
    public String f47152u0;

    /* JADX INFO: renamed from: v0 */
    public ConcurrentHashMap f47153v0;

    public C15138K1(C15447t c15447t, C15144M1 c15144m1, String str, C15144M1 c15144m2, C2391u c2391u) {
        this(c15447t, c15144m1, c15144m2, str, null, c2391u, null, "manual");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15138K1)) {
            return false;
        }
        C15138K1 c15138k1 = (C15138K1) obj;
        return this.f47144Y.equals(c15138k1.f47144Y) && this.f47145Z.equals(c15138k1.f47145Z) && AbstractC8483G3.m9132b(this.f47146o0, c15138k1.f47146o0) && this.f47148q0.equals(c15138k1.f47148q0) && AbstractC8483G3.m9132b(this.f47149r0, c15138k1.f47149r0) && this.f47150s0 == c15138k1.f47150s0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47144Y, this.f47145Z, this.f47146o0, this.f47148q0, this.f47149r0, this.f47150s0});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("trace_id");
        this.f47144Y.serialize(c11248s, interfaceC15127H);
        c11248s.m12668o("span_id");
        this.f47145Z.serialize(c11248s, interfaceC15127H);
        C15144M1 c15144m1 = this.f47146o0;
        if (c15144m1 != null) {
            c11248s.m12668o("parent_span_id");
            c15144m1.serialize(c11248s, interfaceC15127H);
        }
        c11248s.m12668o("op");
        c11248s.m12660D(this.f47148q0);
        if (this.f47149r0 != null) {
            c11248s.m12668o("description");
            c11248s.m12660D(this.f47149r0);
        }
        if (this.f47150s0 != null) {
            c11248s.m12668o("status");
            c11248s.m12677z(interfaceC15127H, this.f47150s0);
        }
        if (this.f47152u0 != null) {
            c11248s.m12668o("origin");
            c11248s.m12677z(interfaceC15127H, this.f47152u0);
        }
        if (!this.f47151t0.isEmpty()) {
            c11248s.m12668o("tags");
            c11248s.m12677z(interfaceC15127H, this.f47151t0);
        }
        ConcurrentHashMap concurrentHashMap = this.f47153v0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47153v0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }

    public C15138K1(C15447t c15447t, C15144M1 c15144m1, C15144M1 c15144m2, String str, String str2, C2391u c2391u, EnumC15147N1 enumC15147N1, String str3) {
        this.f47151t0 = new ConcurrentHashMap();
        this.f47152u0 = "manual";
        AbstractC8483G3.m9133c(c15447t, "traceId is required");
        this.f47144Y = c15447t;
        AbstractC8483G3.m9133c(c15144m1, "spanId is required");
        this.f47145Z = c15144m1;
        AbstractC8483G3.m9133c(str, "operation is required");
        this.f47148q0 = str;
        this.f47146o0 = c15144m2;
        this.f47147p0 = c2391u;
        this.f47149r0 = str2;
        this.f47150s0 = enumC15147N1;
        this.f47152u0 = str3;
    }

    public C15138K1(C15138K1 c15138k1) {
        this.f47151t0 = new ConcurrentHashMap();
        this.f47152u0 = "manual";
        this.f47144Y = c15138k1.f47144Y;
        this.f47145Z = c15138k1.f47145Z;
        this.f47146o0 = c15138k1.f47146o0;
        this.f47147p0 = c15138k1.f47147p0;
        this.f47148q0 = c15138k1.f47148q0;
        this.f47149r0 = c15138k1.f47149r0;
        this.f47150s0 = c15138k1.f47150s0;
        ConcurrentHashMap concurrentHashMapM9064a = AbstractC8453B3.m9064a(c15138k1.f47151t0);
        if (concurrentHashMapM9064a != null) {
            this.f47151t0 = concurrentHashMapM9064a;
        }
    }
}
