package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p658b5.C11248s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: io.sentry.protocol.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C15427G implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: Y */
    public String f48074Y;

    /* JADX INFO: renamed from: Z */
    public String f48075Z;

    /* JADX INFO: renamed from: o0 */
    public String f48076o0;

    /* JADX INFO: renamed from: p0 */
    public String f48077p0;

    /* JADX INFO: renamed from: q0 */
    public Double f48078q0;

    /* JADX INFO: renamed from: r0 */
    public Double f48079r0;

    /* JADX INFO: renamed from: s0 */
    public Double f48080s0;

    /* JADX INFO: renamed from: t0 */
    public Double f48081t0;

    /* JADX INFO: renamed from: u0 */
    public String f48082u0;

    /* JADX INFO: renamed from: v0 */
    public Double f48083v0;

    /* JADX INFO: renamed from: w0 */
    public List f48084w0;

    /* JADX INFO: renamed from: x0 */
    public HashMap f48085x0;

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48074Y != null) {
            c11248s.m12668o("rendering_system");
            c11248s.m12660D(this.f48074Y);
        }
        if (this.f48075Z != null) {
            c11248s.m12668o("type");
            c11248s.m12660D(this.f48075Z);
        }
        if (this.f48076o0 != null) {
            c11248s.m12668o("identifier");
            c11248s.m12660D(this.f48076o0);
        }
        if (this.f48077p0 != null) {
            c11248s.m12668o(ParameterNames.TAG);
            c11248s.m12660D(this.f48077p0);
        }
        if (this.f48078q0 != null) {
            c11248s.m12668o("width");
            c11248s.m12659B(this.f48078q0);
        }
        if (this.f48079r0 != null) {
            c11248s.m12668o("height");
            c11248s.m12659B(this.f48079r0);
        }
        if (this.f48080s0 != null) {
            c11248s.m12668o("x");
            c11248s.m12659B(this.f48080s0);
        }
        if (this.f48081t0 != null) {
            c11248s.m12668o("y");
            c11248s.m12659B(this.f48081t0);
        }
        if (this.f48082u0 != null) {
            c11248s.m12668o("visibility");
            c11248s.m12660D(this.f48082u0);
        }
        if (this.f48083v0 != null) {
            c11248s.m12668o("alpha");
            c11248s.m12659B(this.f48083v0);
        }
        List list = this.f48084w0;
        if (list != null && !list.isEmpty()) {
            c11248s.m12668o("children");
            c11248s.m12677z(interfaceC15127H, this.f48084w0);
        }
        HashMap map = this.f48085x0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC14376f.m15826E(this.f48085x0, str, c11248s, str, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
