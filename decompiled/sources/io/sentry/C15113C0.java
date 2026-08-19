package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import livekit.org.webrtc.WebrtcBuildVersion;
import p011A9.p012Ra.ahZQMZ;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p658b5.C11248s;
import p775h2.AbstractC14376f;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15113C0 implements InterfaceC15374i0 {

    /* JADX INFO: renamed from: A0 */
    public String f47020A0;

    /* JADX INFO: renamed from: B0 */
    public final ArrayList f47021B0;

    /* JADX INFO: renamed from: C0 */
    public String f47022C0;

    /* JADX INFO: renamed from: D0 */
    public String f47023D0;

    /* JADX INFO: renamed from: E0 */
    public String f47024E0;

    /* JADX INFO: renamed from: F0 */
    public String f47025F0;

    /* JADX INFO: renamed from: G0 */
    public String f47026G0;

    /* JADX INFO: renamed from: H0 */
    public String f47027H0;

    /* JADX INFO: renamed from: I0 */
    public String f47028I0;

    /* JADX INFO: renamed from: J0 */
    public String f47029J0;

    /* JADX INFO: renamed from: K0 */
    public String f47030K0;

    /* JADX INFO: renamed from: L0 */
    public Date f47031L0;

    /* JADX INFO: renamed from: M0 */
    public final HashMap f47032M0;

    /* JADX INFO: renamed from: O0 */
    public ConcurrentHashMap f47034O0;

    /* JADX INFO: renamed from: Y */
    public final File f47035Y;

    /* JADX INFO: renamed from: Z */
    public final Callable f47036Z;

    /* JADX INFO: renamed from: o0 */
    public int f47037o0;

    /* JADX INFO: renamed from: q0 */
    public String f47039q0;

    /* JADX INFO: renamed from: r0 */
    public String f47040r0;

    /* JADX INFO: renamed from: s0 */
    public String f47041s0;

    /* JADX INFO: renamed from: t0 */
    public String f47042t0;

    /* JADX INFO: renamed from: u0 */
    public String f47043u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f47044v0;

    /* JADX INFO: renamed from: w0 */
    public String f47045w0;

    /* JADX INFO: renamed from: y0 */
    public String f47047y0;

    /* JADX INFO: renamed from: z0 */
    public String f47048z0;

    /* JADX INFO: renamed from: x0 */
    public List f47046x0 = new ArrayList();

    /* JADX INFO: renamed from: N0 */
    public String f47033N0 = null;

    /* JADX INFO: renamed from: p0 */
    public String f47038p0 = Locale.getDefault().toString();

    public C15113C0(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i10, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, HashMap map) {
        this.f47035Y = file;
        this.f47031L0 = date;
        this.f47045w0 = str5;
        this.f47036Z = callable;
        this.f47037o0 = i10;
        String str14 = ahZQMZ.hrDSptkz;
        this.f47039q0 = str6 != null ? str6 : str14;
        this.f47040r0 = str7 != null ? str7 : str14;
        this.f47043u0 = str8 != null ? str8 : str14;
        this.f47044v0 = bool != null ? bool.booleanValue() : false;
        this.f47047y0 = str9 != null ? str9 : WebrtcBuildVersion.maint_version;
        this.f47041s0 = str14;
        this.f47042t0 = "android";
        this.f47048z0 = "android";
        this.f47020A0 = str10 != null ? str10 : str14;
        this.f47021B0 = arrayList;
        this.f47022C0 = str.isEmpty() ? tpXhEMGxfXFVSh.YOiQgSD : str;
        this.f47023D0 = str4;
        this.f47024E0 = str14;
        this.f47025F0 = str11 != null ? str11 : str14;
        this.f47026G0 = str2;
        this.f47027H0 = str3;
        this.f47028I0 = UUID.randomUUID().toString();
        this.f47029J0 = str12 != null ? str12 : "production";
        this.f47030K0 = str13;
        if (!str13.equals("normal") && !this.f47030K0.equals("timeout") && !this.f47030K0.equals("backgrounded")) {
            this.f47030K0 = "normal";
        }
        this.f47032M0 = map;
    }

    @Override // io.sentry.InterfaceC15374i0
    public final void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        c11248s.m12668o("android_api_level");
        c11248s.m12677z(interfaceC15127H, Integer.valueOf(this.f47037o0));
        c11248s.m12668o("device_locale");
        c11248s.m12677z(interfaceC15127H, this.f47038p0);
        c11248s.m12668o("device_manufacturer");
        c11248s.m12660D(this.f47039q0);
        c11248s.m12668o("device_model");
        c11248s.m12660D(this.f47040r0);
        c11248s.m12668o("device_os_build_number");
        c11248s.m12660D(this.f47041s0);
        c11248s.m12668o("device_os_name");
        c11248s.m12660D(this.f47042t0);
        c11248s.m12668o("device_os_version");
        c11248s.m12660D(this.f47043u0);
        c11248s.m12668o("device_is_emulator");
        c11248s.m12661E(this.f47044v0);
        c11248s.m12668o("architecture");
        c11248s.m12677z(interfaceC15127H, this.f47045w0);
        c11248s.m12668o("device_cpu_frequencies");
        c11248s.m12677z(interfaceC15127H, this.f47046x0);
        c11248s.m12668o("device_physical_memory_bytes");
        c11248s.m12660D(this.f47047y0);
        c11248s.m12668o("platform");
        c11248s.m12660D(this.f47048z0);
        c11248s.m12668o("build_id");
        c11248s.m12660D(this.f47020A0);
        c11248s.m12668o("transaction_name");
        c11248s.m12660D(this.f47022C0);
        c11248s.m12668o("duration_ns");
        c11248s.m12660D(this.f47023D0);
        c11248s.m12668o("version_name");
        c11248s.m12660D(this.f47025F0);
        c11248s.m12668o("version_code");
        c11248s.m12660D(this.f47024E0);
        ArrayList arrayList = this.f47021B0;
        if (!arrayList.isEmpty()) {
            c11248s.m12668o("transactions");
            c11248s.m12677z(interfaceC15127H, arrayList);
        }
        c11248s.m12668o("transaction_id");
        c11248s.m12660D(this.f47026G0);
        c11248s.m12668o("trace_id");
        c11248s.m12660D(this.f47027H0);
        c11248s.m12668o("profile_id");
        c11248s.m12660D(this.f47028I0);
        c11248s.m12668o("environment");
        c11248s.m12660D(this.f47029J0);
        c11248s.m12668o("truncation_reason");
        c11248s.m12660D(this.f47030K0);
        if (this.f47033N0 != null) {
            c11248s.m12668o("sampled_profile");
            c11248s.m12660D(this.f47033N0);
        }
        c11248s.m12668o("measurements");
        c11248s.m12677z(interfaceC15127H, this.f47032M0);
        c11248s.m12668o(DiagnosticsEntry.TIMESTAMP_KEY);
        c11248s.m12677z(interfaceC15127H, this.f47031L0);
        ConcurrentHashMap concurrentHashMap = this.f47034O0;
        if (concurrentHashMap != null) {
            for (K k8 : concurrentHashMap.keySet()) {
                AbstractC14376f.m15827F(this.f47034O0, k8, c11248s, k8, interfaceC15127H);
            }
        }
        c11248s.m12665h();
    }
}
