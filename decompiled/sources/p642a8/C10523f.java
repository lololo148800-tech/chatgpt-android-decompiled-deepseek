package p642a8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p210I7.InterfaceC3649a;
import p592Y7.InterfaceC9672g;
import p744f8.C13580a;
import p775h2.AbstractC14376f;
import p867l8.C16830b;
import p959q8.C18643e;
import p959q8.InterfaceC18645g;
import p959q8.InterfaceC18646h;

/* JADX INFO: renamed from: a8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10523f {

    /* JADX INFO: renamed from: a */
    public final String f31186a;

    /* JADX INFO: renamed from: b */
    public final float f31187b;

    /* JADX INFO: renamed from: c */
    public final float f31188c;

    /* JADX INFO: renamed from: d */
    public final float f31189d;

    /* JADX INFO: renamed from: e */
    public final boolean f31190e;

    /* JADX INFO: renamed from: f */
    public final List f31191f;

    /* JADX INFO: renamed from: g */
    public final C16830b f31192g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC18646h f31193h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC18645g f31194i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC3649a f31195j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC3649a f31196k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC3649a f31197l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC3649a f31198m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC3649a f31199n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC3649a f31200o;

    /* JADX INFO: renamed from: p */
    public final boolean f31201p;

    /* JADX INFO: renamed from: q */
    public final boolean f31202q;

    /* JADX INFO: renamed from: r */
    public final boolean f31203r;

    /* JADX INFO: renamed from: s */
    public final int f31204s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC9672g f31205t;

    /* JADX INFO: renamed from: u */
    public final Map f31206u;

    public C10523f(String str, float f10, float f11, float f12, boolean z6, List list, C16830b c16830b, InterfaceC18646h interfaceC18646h, InterfaceC18645g interfaceC18645g, InterfaceC3649a interfaceC3649a, InterfaceC3649a interfaceC3649a2, InterfaceC3649a interfaceC3649a3, InterfaceC3649a interfaceC3649a4, InterfaceC3649a interfaceC3649a5, InterfaceC3649a interfaceC3649a6, boolean z10, boolean z11, boolean z12, int i10, InterfaceC9672g interfaceC9672g, Map map) {
        AbstractC14376f.m15825D(i10, "vitalsMonitorUpdateFrequency");
        this.f31186a = str;
        this.f31187b = f10;
        this.f31188c = f11;
        this.f31189d = f12;
        this.f31190e = z6;
        this.f31191f = list;
        this.f31192g = c16830b;
        this.f31193h = interfaceC18646h;
        this.f31194i = interfaceC18645g;
        this.f31195j = interfaceC3649a;
        this.f31196k = interfaceC3649a2;
        this.f31197l = interfaceC3649a3;
        this.f31198m = interfaceC3649a4;
        this.f31199n = interfaceC3649a5;
        this.f31200o = interfaceC3649a6;
        this.f31201p = z10;
        this.f31202q = z11;
        this.f31203r = z12;
        this.f31204s = i10;
        this.f31205t = interfaceC9672g;
        this.f31206u = map;
    }

    /* JADX INFO: renamed from: a */
    public static C10523f m10975a(C10523f c10523f, float f10, float f11, List list, C16830b c16830b, C18643e c18643e, C13580a c13580a, boolean z6, int i10) {
        String str = c10523f.f31186a;
        float f12 = (i10 & 2) != 0 ? c10523f.f31187b : f10;
        float f13 = c10523f.f31188c;
        float f14 = (i10 & 8) != 0 ? c10523f.f31189d : f11;
        boolean z10 = c10523f.f31190e;
        List touchTargetExtraAttributesProviders = (i10 & 32) != 0 ? c10523f.f31191f : list;
        C16830b interactionPredicate = (i10 & 64) != 0 ? c10523f.f31192g : c16830b;
        InterfaceC18646h interfaceC18646h = (i10 & 128) != 0 ? c10523f.f31193h : c18643e;
        InterfaceC18645g interfaceC18645g = (i10 & 256) != 0 ? c10523f.f31194i : c13580a;
        InterfaceC3649a interfaceC3649a = c10523f.f31195j;
        InterfaceC3649a interfaceC3649a2 = c10523f.f31196k;
        InterfaceC3649a interfaceC3649a3 = c10523f.f31197l;
        InterfaceC3649a interfaceC3649a4 = c10523f.f31198m;
        InterfaceC3649a interfaceC3649a5 = c10523f.f31199n;
        InterfaceC3649a interfaceC3649a6 = c10523f.f31200o;
        boolean z11 = c10523f.f31201p;
        boolean z12 = (i10 & 65536) != 0 ? c10523f.f31202q : z6;
        boolean z13 = c10523f.f31203r;
        int i11 = c10523f.f31204s;
        InterfaceC9672g interfaceC9672g = c10523f.f31205t;
        Map map = c10523f.f31206u;
        c10523f.getClass();
        AbstractC16544l.m18094g(touchTargetExtraAttributesProviders, "touchTargetExtraAttributesProviders");
        AbstractC16544l.m18094g(interactionPredicate, "interactionPredicate");
        AbstractC14376f.m15825D(i11, "vitalsMonitorUpdateFrequency");
        return new C10523f(str, f12, f13, f14, z10, touchTargetExtraAttributesProviders, interactionPredicate, interfaceC18646h, interfaceC18645g, interfaceC3649a, interfaceC3649a2, interfaceC3649a3, interfaceC3649a4, interfaceC3649a5, interfaceC3649a6, z11, z12, z13, i11, interfaceC9672g, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10523f)) {
            return false;
        }
        C10523f c10523f = (C10523f) obj;
        return AbstractC16544l.m18089b(this.f31186a, c10523f.f31186a) && Float.compare(this.f31187b, c10523f.f31187b) == 0 && Float.compare(this.f31188c, c10523f.f31188c) == 0 && Float.compare(this.f31189d, c10523f.f31189d) == 0 && this.f31190e == c10523f.f31190e && this.f31191f.equals(c10523f.f31191f) && this.f31192g.equals(c10523f.f31192g) && AbstractC16544l.m18089b(this.f31193h, c10523f.f31193h) && AbstractC16544l.m18089b(this.f31194i, c10523f.f31194i) && this.f31195j.equals(c10523f.f31195j) && this.f31196k.equals(c10523f.f31196k) && this.f31197l.equals(c10523f.f31197l) && this.f31198m.equals(c10523f.f31198m) && this.f31199n.equals(c10523f.f31199n) && this.f31200o.equals(c10523f.f31200o) && this.f31201p == c10523f.f31201p && this.f31202q == c10523f.f31202q && this.f31203r == c10523f.f31203r && this.f31204s == c10523f.f31204s && this.f31205t.equals(c10523f.f31205t) && this.f31206u.equals(c10523f.f31206u);
    }

    public final int hashCode() {
        String str = this.f31186a;
        int iM15858x = AbstractC14376f.m15858x(this.f31191f, (AbstractC12107L1.m13819j(this.f31189d, AbstractC12107L1.m13819j(this.f31188c, AbstractC12107L1.m13819j(this.f31187b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31) + (this.f31190e ? 1231 : 1237)) * 31, 961);
        InterfaceC18646h interfaceC18646h = this.f31193h;
        int iHashCode = (iM15858x + (interfaceC18646h == null ? 0 : interfaceC18646h.hashCode())) * 31;
        InterfaceC18645g interfaceC18645g = this.f31194i;
        return this.f31206u.hashCode() + ((this.f31205t.hashCode() + AbstractC12107L1.m13820k(this.f31204s, (((((((this.f31200o.hashCode() + ((this.f31199n.hashCode() + ((this.f31198m.hashCode() + ((this.f31197l.hashCode() + ((this.f31196k.hashCode() + ((this.f31195j.hashCode() + ((iHashCode + (interfaceC18645g != null ? interfaceC18645g.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f31201p ? 1231 : 1237)) * 31) + (this.f31202q ? 1231 : 1237)) * 31) + (this.f31203r ? 1231 : 1237)) * 31, 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Configuration(customEndpointUrl=");
        sb2.append(this.f31186a);
        sb2.append(", sampleRate=");
        sb2.append(this.f31187b);
        sb2.append(", telemetrySampleRate=");
        sb2.append(this.f31188c);
        sb2.append(", telemetryConfigurationSampleRate=");
        sb2.append(this.f31189d);
        sb2.append(", userActionTracking=");
        sb2.append(this.f31190e);
        sb2.append(", touchTargetExtraAttributesProviders=");
        sb2.append(this.f31191f);
        sb2.append(", interactionPredicate=");
        sb2.append(this.f31192g);
        sb2.append(", viewTrackingStrategy=");
        sb2.append(this.f31193h);
        sb2.append(", longTaskTrackingStrategy=");
        sb2.append(this.f31194i);
        sb2.append(", viewEventMapper=");
        sb2.append(this.f31195j);
        sb2.append(", errorEventMapper=");
        sb2.append(this.f31196k);
        sb2.append(", resourceEventMapper=");
        sb2.append(this.f31197l);
        sb2.append(", actionEventMapper=");
        sb2.append(this.f31198m);
        sb2.append(", longTaskEventMapper=");
        sb2.append(this.f31199n);
        sb2.append(", telemetryConfigurationMapper=");
        sb2.append(this.f31200o);
        sb2.append(", backgroundEventTracking=");
        sb2.append(this.f31201p);
        sb2.append(", trackFrustrations=");
        sb2.append(this.f31202q);
        sb2.append(", trackNonFatalAnrs=");
        sb2.append(this.f31203r);
        sb2.append(", vitalsMonitorUpdateFrequency=");
        int i10 = this.f31204s;
        if (i10 == 1) {
            str = "FREQUENT";
        } else if (i10 == 2) {
            str = "AVERAGE";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "NEVER";
        } else {
            str = "RARE";
        }
        sb2.append(str);
        sb2.append(", sessionListener=");
        sb2.append(this.f31205t);
        sb2.append(", additionalConfig=");
        sb2.append(this.f31206u);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
