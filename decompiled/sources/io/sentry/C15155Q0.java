package io.sentry;

import p117Eb.C2391u;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15155Q0 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public boolean f47171Y;

    /* JADX INFO: renamed from: Z */
    public Double f47172Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f47173o0;

    /* JADX INFO: renamed from: p0 */
    public Double f47174p0;

    /* JADX INFO: renamed from: q0 */
    public String f47175q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f47176r0;

    /* JADX INFO: renamed from: s0 */
    public int f47177s0;

    /* JADX INFO: renamed from: t0 */
    public ConcurrentHashMap f47178t0;

    public C15155Q0(C15524y1 c15524y1, C2391u c2391u) {
        this.f47173o0 = ((Boolean) c2391u.f7430o0).booleanValue();
        this.f47174p0 = (Double) c2391u.f7429Z;
        this.f47171Y = ((Boolean) c2391u.f7431p0).booleanValue();
        this.f47172Z = (Double) c2391u.f7432q0;
        this.f47175q0 = c15524y1.getProfilingTracesDirPath();
        this.f47176r0 = c15524y1.isProfilingEnabled();
        this.f47177s0 = c15524y1.getProfilingTracesHz();
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("profile_sampled");
        c11248s.m12677z(interfaceC15127H, Boolean.valueOf(this.f47171Y));
        c11248s.m12668o("profile_sample_rate");
        c11248s.m12677z(interfaceC15127H, this.f47172Z);
        c11248s.m12668o("trace_sampled");
        c11248s.m12677z(interfaceC15127H, Boolean.valueOf(this.f47173o0));
        c11248s.m12668o("trace_sample_rate");
        c11248s.m12677z(interfaceC15127H, this.f47174p0);
        c11248s.m12668o("profiling_traces_dir_path");
        c11248s.m12677z(interfaceC15127H, this.f47175q0);
        c11248s.m12668o("is_profiling_enabled");
        c11248s.m12677z(interfaceC15127H, Boolean.valueOf(this.f47176r0));
        c11248s.m12668o("profiling_traces_hz");
        c11248s.m12677z(interfaceC15127H, Integer.valueOf(this.f47177s0));
        ConcurrentHashMap concurrentHashMap = this.f47178t0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47178t0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
