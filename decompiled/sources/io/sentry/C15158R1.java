package io.sentry;

import io.sentry.protocol.C15447t;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15158R1 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public final C15447t f47182Y;

    /* JADX INFO: renamed from: Z */
    public final String f47183Z;

    /* JADX INFO: renamed from: o0 */
    public final String f47184o0;

    /* JADX INFO: renamed from: p0 */
    public final String f47185p0;

    /* JADX INFO: renamed from: q0 */
    public final String f47186q0;

    /* JADX INFO: renamed from: r0 */
    public final String f47187r0;

    /* JADX INFO: renamed from: s0 */
    public final String f47188s0;

    /* JADX INFO: renamed from: t0 */
    public final String f47189t0;

    /* JADX INFO: renamed from: u0 */
    public final String f47190u0;

    /* JADX INFO: renamed from: v0 */
    public final C15447t f47191v0;

    /* JADX INFO: renamed from: w0 */
    public ConcurrentHashMap f47192w0;

    public C15158R1(C15447t c15447t, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C15447t c15447t2) {
        this.f47182Y = c15447t;
        this.f47183Z = str;
        this.f47184o0 = str2;
        this.f47185p0 = str3;
        this.f47186q0 = str4;
        this.f47187r0 = str5;
        this.f47188s0 = str6;
        this.f47189t0 = str7;
        this.f47190u0 = str8;
        this.f47191v0 = c15447t2;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("trace_id");
        c11248s.m12677z(interfaceC15127H, this.f47182Y);
        c11248s.m12668o("public_key");
        c11248s.m12660D(this.f47183Z);
        String str = this.f47184o0;
        if (str != null) {
            c11248s.m12668o("release");
            c11248s.m12660D(str);
        }
        String str2 = this.f47185p0;
        if (str2 != null) {
            c11248s.m12668o("environment");
            c11248s.m12660D(str2);
        }
        String str3 = this.f47186q0;
        if (str3 != null) {
            c11248s.m12668o("user_id");
            c11248s.m12660D(str3);
        }
        String str4 = this.f47187r0;
        if (str4 != null) {
            c11248s.m12668o("user_segment");
            c11248s.m12660D(str4);
        }
        String str5 = this.f47188s0;
        if (str5 != null) {
            c11248s.m12668o("transaction");
            c11248s.m12660D(str5);
        }
        String str6 = this.f47189t0;
        if (str6 != null) {
            c11248s.m12668o("sample_rate");
            c11248s.m12660D(str6);
        }
        String str7 = this.f47190u0;
        if (str7 != null) {
            c11248s.m12668o("sampled");
            c11248s.m12660D(str7);
        }
        C15447t c15447t = this.f47191v0;
        if (c15447t != null) {
            c11248s.m12668o("replay_id");
            c11248s.m12677z(interfaceC15127H, c15447t);
        }
        ConcurrentHashMap concurrentHashMap = this.f47192w0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47192w0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
