package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import p544W9.AbstractC8483G3;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15433f implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: A0 */
    public Long f48105A0;

    /* JADX INFO: renamed from: B0 */
    public Boolean f48106B0;

    /* JADX INFO: renamed from: C0 */
    public Long f48107C0;

    /* JADX INFO: renamed from: D0 */
    public Long f48108D0;

    /* JADX INFO: renamed from: E0 */
    public Long f48109E0;

    /* JADX INFO: renamed from: F0 */
    public Long f48110F0;

    /* JADX INFO: renamed from: G0 */
    public Integer f48111G0;

    /* JADX INFO: renamed from: H0 */
    public Integer f48112H0;

    /* JADX INFO: renamed from: I0 */
    public Float f48113I0;

    /* JADX INFO: renamed from: J0 */
    public Integer f48114J0;

    /* JADX INFO: renamed from: K0 */
    public Date f48115K0;

    /* JADX INFO: renamed from: L0 */
    public TimeZone f48116L0;

    /* JADX INFO: renamed from: M0 */
    public String f48117M0;

    /* JADX INFO: renamed from: N0 */
    public String f48118N0;

    /* JADX INFO: renamed from: O0 */
    public String f48119O0;

    /* JADX INFO: renamed from: P0 */
    public String f48120P0;

    /* JADX INFO: renamed from: Q0 */
    public Float f48121Q0;

    /* JADX INFO: renamed from: R0 */
    public Integer f48122R0;

    /* JADX INFO: renamed from: S0 */
    public Double f48123S0;

    /* JADX INFO: renamed from: T0 */
    public String f48124T0;

    /* JADX INFO: renamed from: U0 */
    public ConcurrentHashMap f48125U0;

    /* JADX INFO: renamed from: Y */
    public String f48126Y;

    /* JADX INFO: renamed from: Z */
    public String f48127Z;

    /* JADX INFO: renamed from: o0 */
    public String f48128o0;

    /* JADX INFO: renamed from: p0 */
    public String f48129p0;

    /* JADX INFO: renamed from: q0 */
    public String f48130q0;

    /* JADX INFO: renamed from: r0 */
    public String f48131r0;

    /* JADX INFO: renamed from: s0 */
    public String[] f48132s0;

    /* JADX INFO: renamed from: t0 */
    public Float f48133t0;

    /* JADX INFO: renamed from: u0 */
    public Boolean f48134u0;

    /* JADX INFO: renamed from: v0 */
    public Boolean f48135v0;

    /* JADX INFO: renamed from: w0 */
    public EnumC15432e f48136w0;

    /* JADX INFO: renamed from: x0 */
    public Boolean f48137x0;

    /* JADX INFO: renamed from: y0 */
    public Long f48138y0;

    /* JADX INFO: renamed from: z0 */
    public Long f48139z0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15433f.class != obj.getClass()) {
            return false;
        }
        C15433f c15433f = (C15433f) obj;
        return AbstractC8483G3.m9132b(this.f48126Y, c15433f.f48126Y) && AbstractC8483G3.m9132b(this.f48127Z, c15433f.f48127Z) && AbstractC8483G3.m9132b(this.f48128o0, c15433f.f48128o0) && AbstractC8483G3.m9132b(this.f48129p0, c15433f.f48129p0) && AbstractC8483G3.m9132b(this.f48130q0, c15433f.f48130q0) && AbstractC8483G3.m9132b(this.f48131r0, c15433f.f48131r0) && Arrays.equals(this.f48132s0, c15433f.f48132s0) && AbstractC8483G3.m9132b(this.f48133t0, c15433f.f48133t0) && AbstractC8483G3.m9132b(this.f48134u0, c15433f.f48134u0) && AbstractC8483G3.m9132b(this.f48135v0, c15433f.f48135v0) && this.f48136w0 == c15433f.f48136w0 && AbstractC8483G3.m9132b(this.f48137x0, c15433f.f48137x0) && AbstractC8483G3.m9132b(this.f48138y0, c15433f.f48138y0) && AbstractC8483G3.m9132b(this.f48139z0, c15433f.f48139z0) && AbstractC8483G3.m9132b(this.f48105A0, c15433f.f48105A0) && AbstractC8483G3.m9132b(this.f48106B0, c15433f.f48106B0) && AbstractC8483G3.m9132b(this.f48107C0, c15433f.f48107C0) && AbstractC8483G3.m9132b(this.f48108D0, c15433f.f48108D0) && AbstractC8483G3.m9132b(this.f48109E0, c15433f.f48109E0) && AbstractC8483G3.m9132b(this.f48110F0, c15433f.f48110F0) && AbstractC8483G3.m9132b(this.f48111G0, c15433f.f48111G0) && AbstractC8483G3.m9132b(this.f48112H0, c15433f.f48112H0) && AbstractC8483G3.m9132b(this.f48113I0, c15433f.f48113I0) && AbstractC8483G3.m9132b(this.f48114J0, c15433f.f48114J0) && AbstractC8483G3.m9132b(this.f48115K0, c15433f.f48115K0) && AbstractC8483G3.m9132b(this.f48117M0, c15433f.f48117M0) && AbstractC8483G3.m9132b(this.f48118N0, c15433f.f48118N0) && AbstractC8483G3.m9132b(this.f48119O0, c15433f.f48119O0) && AbstractC8483G3.m9132b(this.f48120P0, c15433f.f48120P0) && AbstractC8483G3.m9132b(this.f48121Q0, c15433f.f48121Q0) && AbstractC8483G3.m9132b(this.f48122R0, c15433f.f48122R0) && AbstractC8483G3.m9132b(this.f48123S0, c15433f.f48123S0) && AbstractC8483G3.m9132b(this.f48124T0, c15433f.f48124T0);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f48126Y, this.f48127Z, this.f48128o0, this.f48129p0, this.f48130q0, this.f48131r0, this.f48133t0, this.f48134u0, this.f48135v0, this.f48136w0, this.f48137x0, this.f48138y0, this.f48139z0, this.f48105A0, this.f48106B0, this.f48107C0, this.f48108D0, this.f48109E0, this.f48110F0, this.f48111G0, this.f48112H0, this.f48113I0, this.f48114J0, this.f48115K0, this.f48116L0, this.f48117M0, this.f48118N0, this.f48119O0, this.f48120P0, this.f48121Q0, this.f48122R0, this.f48123S0, this.f48124T0}) * 31) + Arrays.hashCode(this.f48132s0);
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.f48126Y != null) {
            c11248s.m12668o(DiagnosticsEntry.NAME_KEY);
            c11248s.m12660D(this.f48126Y);
        }
        if (this.f48127Z != null) {
            c11248s.m12668o("manufacturer");
            c11248s.m12660D(this.f48127Z);
        }
        if (this.f48128o0 != null) {
            c11248s.m12668o("brand");
            c11248s.m12660D(this.f48128o0);
        }
        if (this.f48129p0 != null) {
            c11248s.m12668o("family");
            c11248s.m12660D(this.f48129p0);
        }
        if (this.f48130q0 != null) {
            c11248s.m12668o("model");
            c11248s.m12660D(this.f48130q0);
        }
        if (this.f48131r0 != null) {
            c11248s.m12668o("model_id");
            c11248s.m12660D(this.f48131r0);
        }
        if (this.f48132s0 != null) {
            c11248s.m12668o("archs");
            c11248s.m12677z(interfaceC15127H, this.f48132s0);
        }
        if (this.f48133t0 != null) {
            c11248s.m12668o("battery_level");
            c11248s.m12659B(this.f48133t0);
        }
        if (this.f48134u0 != null) {
            c11248s.m12668o("charging");
            c11248s.m12658A(this.f48134u0);
        }
        if (this.f48135v0 != null) {
            c11248s.m12668o("online");
            c11248s.m12658A(this.f48135v0);
        }
        if (this.f48136w0 != null) {
            c11248s.m12668o("orientation");
            c11248s.m12677z(interfaceC15127H, this.f48136w0);
        }
        if (this.f48137x0 != null) {
            c11248s.m12668o("simulator");
            c11248s.m12658A(this.f48137x0);
        }
        if (this.f48138y0 != null) {
            c11248s.m12668o("memory_size");
            c11248s.m12659B(this.f48138y0);
        }
        if (this.f48139z0 != null) {
            c11248s.m12668o("free_memory");
            c11248s.m12659B(this.f48139z0);
        }
        if (this.f48105A0 != null) {
            c11248s.m12668o("usable_memory");
            c11248s.m12659B(this.f48105A0);
        }
        if (this.f48106B0 != null) {
            c11248s.m12668o("low_memory");
            c11248s.m12658A(this.f48106B0);
        }
        if (this.f48107C0 != null) {
            c11248s.m12668o("storage_size");
            c11248s.m12659B(this.f48107C0);
        }
        if (this.f48108D0 != null) {
            c11248s.m12668o("free_storage");
            c11248s.m12659B(this.f48108D0);
        }
        if (this.f48109E0 != null) {
            c11248s.m12668o("external_storage_size");
            c11248s.m12659B(this.f48109E0);
        }
        if (this.f48110F0 != null) {
            c11248s.m12668o("external_free_storage");
            c11248s.m12659B(this.f48110F0);
        }
        if (this.f48111G0 != null) {
            c11248s.m12668o("screen_width_pixels");
            c11248s.m12659B(this.f48111G0);
        }
        if (this.f48112H0 != null) {
            c11248s.m12668o("screen_height_pixels");
            c11248s.m12659B(this.f48112H0);
        }
        if (this.f48113I0 != null) {
            c11248s.m12668o("screen_density");
            c11248s.m12659B(this.f48113I0);
        }
        if (this.f48114J0 != null) {
            c11248s.m12668o("screen_dpi");
            c11248s.m12659B(this.f48114J0);
        }
        if (this.f48115K0 != null) {
            c11248s.m12668o("boot_time");
            c11248s.m12677z(interfaceC15127H, this.f48115K0);
        }
        if (this.f48116L0 != null) {
            c11248s.m12668o("timezone");
            c11248s.m12677z(interfaceC15127H, this.f48116L0);
        }
        if (this.f48117M0 != null) {
            c11248s.m12668o(ParameterNames.f31999ID);
            c11248s.m12660D(this.f48117M0);
        }
        if (this.f48118N0 != null) {
            c11248s.m12668o("language");
            c11248s.m12660D(this.f48118N0);
        }
        if (this.f48120P0 != null) {
            c11248s.m12668o("connection_type");
            c11248s.m12660D(this.f48120P0);
        }
        if (this.f48121Q0 != null) {
            c11248s.m12668o("battery_temperature");
            c11248s.m12659B(this.f48121Q0);
        }
        if (this.f48119O0 != null) {
            c11248s.m12668o("locale");
            c11248s.m12660D(this.f48119O0);
        }
        if (this.f48122R0 != null) {
            c11248s.m12668o("processor_count");
            c11248s.m12659B(this.f48122R0);
        }
        if (this.f48123S0 != null) {
            c11248s.m12668o("processor_frequency");
            c11248s.m12659B(this.f48123S0);
        }
        if (this.f48124T0 != null) {
            c11248s.m12668o("cpu_description");
            c11248s.m12660D(this.f48124T0);
        }
        ConcurrentHashMap concurrentHashMap = this.f48125U0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f48125U0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
