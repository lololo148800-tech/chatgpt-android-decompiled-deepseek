package p530Vi;

import android.app.Application;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.segment.analytics.kotlin.core.Settings;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p138F8.vJO.vRJidSveZHcTw;
import p451Sb.C7102a;
import p458Si.C7142d;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Vi.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C8317m {

    /* JADX INFO: renamed from: a */
    public final String f25915a;

    /* JADX INFO: renamed from: b */
    public final Object f25916b;

    /* JADX INFO: renamed from: c */
    public final C7142d f25917c;

    /* JADX INFO: renamed from: d */
    public final boolean f25918d;

    /* JADX INFO: renamed from: e */
    public final boolean f25919e;

    /* JADX INFO: renamed from: f */
    public final boolean f25920f;

    /* JADX INFO: renamed from: g */
    public final boolean f25921g;

    /* JADX INFO: renamed from: h */
    public final int f25922h;

    /* JADX INFO: renamed from: i */
    public final int f25923i;

    /* JADX INFO: renamed from: j */
    public final List f25924j;

    /* JADX INFO: renamed from: k */
    public final Settings f25925k;

    /* JADX INFO: renamed from: l */
    public final boolean f25926l;

    /* JADX INFO: renamed from: m */
    public final String f25927m;

    /* JADX INFO: renamed from: n */
    public final String f25928n;

    /* JADX INFO: renamed from: o */
    public final C7102a f25929o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC1436k f25930p;

    public C8317m(Application application) {
        C7142d c7142d = C7142d.f22717a;
        C17689w c17689w = C17689w.f56480Y;
        Settings settings = new Settings();
        C7102a c7102a = new C7102a(19);
        this.f25915a = "oai";
        this.f25916b = application;
        this.f25917c = c7142d;
        this.f25918d = false;
        this.f25919e = true;
        this.f25920f = false;
        this.f25921g = false;
        this.f25922h = 20;
        this.f25923i = 30;
        this.f25924j = c17689w;
        this.f25925k = settings;
        this.f25926l = false;
        this.f25927m = "android.chat.openai.com/ces/v1";
        this.f25928n = "android.chat.openai.com/ces/v1";
        this.f25929o = c7102a;
        this.f25930p = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8317m)) {
            return false;
        }
        C8317m c8317m = (C8317m) obj;
        return AbstractC16544l.m18089b(this.f25915a, c8317m.f25915a) && AbstractC16544l.m18089b(this.f25916b, c8317m.f25916b) && AbstractC16544l.m18089b(this.f25917c, c8317m.f25917c) && this.f25918d == c8317m.f25918d && this.f25919e == c8317m.f25919e && this.f25920f == c8317m.f25920f && this.f25921g == c8317m.f25921g && this.f25922h == c8317m.f25922h && this.f25923i == c8317m.f25923i && AbstractC16544l.m18089b(this.f25924j, c8317m.f25924j) && AbstractC16544l.m18089b(this.f25925k, c8317m.f25925k) && this.f25926l == c8317m.f25926l && AbstractC16544l.m18089b(this.f25927m, c8317m.f25927m) && AbstractC16544l.m18089b(this.f25928n, c8317m.f25928n) && AbstractC16544l.m18089b(this.f25929o, c8317m.f25929o) && AbstractC16544l.m18089b(this.f25930p, c8317m.f25930p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    public final int hashCode() {
        int iHashCode = this.f25915a.hashCode() * 31;
        Object obj = this.f25916b;
        int iHashCode2 = (this.f25917c.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31;
        boolean z6 = this.f25918d;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode2 + r6) * 31;
        boolean z10 = this.f25919e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.f25920f;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i12 = (i11 + r11) * 31;
        boolean z12 = this.f25921g;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int iHashCode3 = (this.f25925k.hashCode() + AbstractC14376f.m15858x(this.f25924j, (((((i12 + r12) * 31) + this.f25922h) * 31) + this.f25923i) * 31, 31)) * 31;
        boolean z13 = this.f25926l;
        int iHashCode4 = (this.f25929o.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p((iHashCode3 + (z13 ? 1 : z13)) * 31, 31, this.f25927m), 31, this.f25928n)) * 31;
        InterfaceC1436k interfaceC1436k = this.f25930p;
        return iHashCode4 + (interfaceC1436k != null ? interfaceC1436k.hashCode() : 0);
    }

    public final String toString() {
        return "Configuration(writeKey=" + this.f25915a + ", application=" + this.f25916b + ", storageProvider=" + this.f25917c + ", collectDeviceId=" + this.f25918d + vRJidSveZHcTw.oCLrDiEWtQEyXbc + this.f25919e + ", useLifecycleObserver=" + this.f25920f + ", trackDeepLinks=" + this.f25921g + ", flushAt=" + this.f25922h + lZYtIbClQJm.waT + this.f25923i + ", flushPolicies=" + this.f25924j + ", defaultSettings=" + this.f25925k + ", autoAddSegmentDestination=" + this.f25926l + ", apiHost=" + this.f25927m + ", cdnHost=" + this.f25928n + ", requestFactory=" + this.f25929o + ", errorHandler=" + this.f25930p + ')';
    }
}
