package io.sentry.rrweb;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import livekit.org.webrtc.MediaStreamTrack;
import p379Pb.LVf.efyhmdM;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.rrweb.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15471l extends AbstractC15461b implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: A0 */
    public int f48323A0;

    /* JADX INFO: renamed from: B0 */
    public HashMap f48324B0;

    /* JADX INFO: renamed from: C0 */
    public ConcurrentHashMap f48325C0;

    /* JADX INFO: renamed from: D0 */
    public ConcurrentHashMap f48326D0;

    /* JADX INFO: renamed from: o0 */
    public String f48327o0;

    /* JADX INFO: renamed from: p0 */
    public int f48328p0;

    /* JADX INFO: renamed from: q0 */
    public long f48329q0;

    /* JADX INFO: renamed from: r0 */
    public long f48330r0;

    /* JADX INFO: renamed from: s0 */
    public String f48331s0;

    /* JADX INFO: renamed from: t0 */
    public String f48332t0;

    /* JADX INFO: renamed from: u0 */
    public int f48333u0;

    /* JADX INFO: renamed from: v0 */
    public int f48334v0;

    /* JADX INFO: renamed from: w0 */
    public int f48335w0;

    /* JADX INFO: renamed from: x0 */
    public String f48336x0;

    /* JADX INFO: renamed from: y0 */
    public int f48337y0;

    /* JADX INFO: renamed from: z0 */
    public int f48338z0;

    public C15471l() {
        super(EnumC15462c.Custom);
        this.f48331s0 = "h264";
        this.f48332t0 = "mp4";
        this.f48336x0 = "constant";
        this.f48327o0 = MediaStreamTrack.VIDEO_TRACK_KIND;
    }

    @Override // io.sentry.rrweb.AbstractC15461b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15471l.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C15471l c15471l = (C15471l) obj;
        return this.f48328p0 == c15471l.f48328p0 && this.f48329q0 == c15471l.f48329q0 && this.f48330r0 == c15471l.f48330r0 && this.f48333u0 == c15471l.f48333u0 && this.f48334v0 == c15471l.f48334v0 && this.f48335w0 == c15471l.f48335w0 && this.f48337y0 == c15471l.f48337y0 && this.f48338z0 == c15471l.f48338z0 && this.f48323A0 == c15471l.f48323A0 && AbstractC8483G3.m9132b(this.f48327o0, c15471l.f48327o0) && AbstractC8483G3.m9132b(this.f48331s0, c15471l.f48331s0) && AbstractC8483G3.m9132b(this.f48332t0, c15471l.f48332t0) && AbstractC8483G3.m9132b(this.f48336x0, c15471l.f48336x0);
    }

    @Override // io.sentry.rrweb.AbstractC15461b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f48327o0, Integer.valueOf(this.f48328p0), Long.valueOf(this.f48329q0), Long.valueOf(this.f48330r0), this.f48331s0, this.f48332t0, Integer.valueOf(this.f48333u0), Integer.valueOf(this.f48334v0), Integer.valueOf(this.f48335w0), this.f48336x0, Integer.valueOf(this.f48337y0), Integer.valueOf(this.f48338z0), Integer.valueOf(this.f48323A0)});
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("type");
        c11248s.m12677z(interfaceC15127H, this.f48290Y);
        c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
        c11248s.m12676y(this.f48291Z);
        c11248s.m12668o("data");
        c11248s.m12663d();
        c11248s.m12668o(ParameterNames.TAG);
        c11248s.m12660D(this.f48327o0);
        c11248s.m12668o("payload");
        c11248s.m12663d();
        c11248s.m12668o("segmentId");
        c11248s.m12676y(this.f48328p0);
        c11248s.m12668o(efyhmdM.SbOtWylV);
        c11248s.m12676y(this.f48329q0);
        c11248s.m12668o("duration");
        c11248s.m12676y(this.f48330r0);
        c11248s.m12668o("encoding");
        c11248s.m12660D(this.f48331s0);
        c11248s.m12668o("container");
        c11248s.m12660D(this.f48332t0);
        c11248s.m12668o("height");
        c11248s.m12676y(this.f48333u0);
        c11248s.m12668o("width");
        c11248s.m12676y(this.f48334v0);
        c11248s.m12668o("frameCount");
        c11248s.m12676y(this.f48335w0);
        c11248s.m12668o("frameRate");
        c11248s.m12676y(this.f48337y0);
        c11248s.m12668o("frameRateType");
        c11248s.m12660D(this.f48336x0);
        c11248s.m12668o("left");
        c11248s.m12676y(this.f48338z0);
        c11248s.m12668o("top");
        c11248s.m12676y(this.f48323A0);
        ConcurrentHashMap concurrentHashMap = this.f48325C0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48325C0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
        ConcurrentHashMap concurrentHashMap2 = this.f48326D0;
        if (concurrentHashMap2 != null) {
            for (K k10 : concurrentHashMap2.keySet()) {
                AbstractC14376f.m15827F(this.f48326D0, k10, c11248s, k10, interfaceC15127H);
            }
        }
        c11248s.m12665h();
        HashMap map = this.f48324B0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48324B0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
