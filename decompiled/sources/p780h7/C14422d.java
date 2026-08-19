package p780h7;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17335b;
import p1071w0.AbstractC20734X;
import p641a7.EnumC10517c;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: h7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14422d {

    /* JADX INFO: renamed from: a */
    public final boolean f45319a;

    /* JADX INFO: renamed from: b */
    public final boolean f45320b;

    /* JADX INFO: renamed from: c */
    public final Map f45321c;

    /* JADX INFO: renamed from: d */
    public final int f45322d;

    /* JADX INFO: renamed from: e */
    public final int f45323e;

    /* JADX INFO: renamed from: f */
    public final Proxy f45324f;

    /* JADX INFO: renamed from: g */
    public final C17335b f45325g;

    /* JADX INFO: renamed from: h */
    public final EnumC10517c f45326h;

    /* JADX INFO: renamed from: i */
    public final int f45327i;

    /* JADX INFO: renamed from: j */
    public final C14419a f45328j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC14425g f45329k;

    public C14422d(boolean z6, boolean z10, Map map, int i10, int i11, Proxy proxy, C17335b c17335b, EnumC10517c site, int i12, C14419a c14419a, InterfaceC14425g interfaceC14425g) {
        AbstractC14376f.m15825D(i10, "batchSize");
        AbstractC14376f.m15825D(i11, "uploadFrequency");
        AbstractC16544l.m18094g(site, "site");
        AbstractC14376f.m15825D(i12, "batchProcessingLevel");
        this.f45319a = z6;
        this.f45320b = z10;
        this.f45321c = map;
        this.f45322d = i10;
        this.f45323e = i11;
        this.f45324f = proxy;
        this.f45325g = c17335b;
        this.f45326h = site;
        this.f45327i = i12;
        this.f45328j = c14419a;
        this.f45329k = interfaceC14425g;
    }

    /* JADX INFO: renamed from: a */
    public static C14422d m15934a(C14422d c14422d, boolean z6, LinkedHashMap linkedHashMap, int i10, int i11, C14419a c14419a, int i12) {
        boolean z10 = c14422d.f45319a;
        boolean z11 = (i12 & 2) != 0 ? c14422d.f45320b : z6;
        Map map = (i12 & 4) != 0 ? c14422d.f45321c : linkedHashMap;
        int i13 = (i12 & 8) != 0 ? c14422d.f45322d : i10;
        int i14 = (i12 & 16) != 0 ? c14422d.f45323e : i11;
        Proxy proxy = c14422d.f45324f;
        C17335b c17335b = c14422d.f45325g;
        c14422d.getClass();
        EnumC10517c site = c14422d.f45326h;
        int i15 = c14422d.f45327i;
        c14422d.getClass();
        C14419a backpressureStrategy = (i12 & 2048) != 0 ? c14422d.f45328j : c14419a;
        InterfaceC14425g interfaceC14425g = c14422d.f45329k;
        c14422d.getClass();
        AbstractC16544l.m18094g(map, YladLSetV.LfxN);
        AbstractC14376f.m15825D(i13, "batchSize");
        AbstractC14376f.m15825D(i14, "uploadFrequency");
        AbstractC16544l.m18094g(site, "site");
        AbstractC14376f.m15825D(i15, "batchProcessingLevel");
        AbstractC16544l.m18094g(backpressureStrategy, "backpressureStrategy");
        return new C14422d(z10, z11, map, i13, i14, proxy, c17335b, site, i15, backpressureStrategy, interfaceC14425g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14422d)) {
            return false;
        }
        C14422d c14422d = (C14422d) obj;
        return this.f45319a == c14422d.f45319a && this.f45320b == c14422d.f45320b && this.f45321c.equals(c14422d.f45321c) && this.f45322d == c14422d.f45322d && this.f45323e == c14422d.f45323e && AbstractC16544l.m18089b(this.f45324f, c14422d.f45324f) && this.f45325g.equals(c14422d.f45325g) && AbstractC16544l.m18089b(null, null) && this.f45326h == c14422d.f45326h && this.f45327i == c14422d.f45327i && AbstractC16544l.m18089b(null, null) && this.f45328j.equals(c14422d.f45328j) && AbstractC16544l.m18089b(this.f45329k, c14422d.f45329k);
    }

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f45323e, AbstractC12107L1.m13820k(this.f45322d, AbstractC20734X.m21250u((((this.f45319a ? 1231 : 1237) * 31) + (this.f45320b ? 1231 : 1237)) * 31, 31, this.f45321c), 31), 31);
        Proxy proxy = this.f45324f;
        int iHashCode = (this.f45328j.hashCode() + AbstractC12107L1.m13820k(this.f45327i, (this.f45326h.hashCode() + ((this.f45325g.hashCode() + ((iM13820k + (proxy == null ? 0 : proxy.hashCode())) * 31)) * 961)) * 31, 961)) * 31;
        InterfaceC14425g interfaceC14425g = this.f45329k;
        return iHashCode + (interfaceC14425g != null ? interfaceC14425g.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Core(needsClearTextHttp=");
        sb2.append(this.f45319a);
        sb2.append(", enableDeveloperModeWhenDebuggable=");
        sb2.append(this.f45320b);
        sb2.append(", firstPartyHostsWithHeaderTypes=");
        sb2.append(this.f45321c);
        sb2.append(", batchSize=");
        int i10 = this.f45322d;
        if (i10 == 1) {
            str = "SMALL";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "LARGE";
        } else {
            str = "MEDIUM";
        }
        sb2.append(str);
        sb2.append(", uploadFrequency=");
        sb2.append(AbstractC14376f.m15832K(this.f45323e));
        sb2.append(", proxy=");
        sb2.append(this.f45324f);
        sb2.append(", proxyAuth=");
        sb2.append(this.f45325g);
        sb2.append(", encryption=null, site=");
        sb2.append(this.f45326h);
        sb2.append(", batchProcessingLevel=");
        int i11 = this.f45327i;
        if (i11 == 1) {
            str2 = "LOW";
        } else if (i11 != 2) {
            str2 = i11 != 3 ? "null" : "HIGH";
        } else {
            str2 = "MEDIUM";
        }
        sb2.append(str2);
        sb2.append(", persistenceStrategyFactory=null, backpressureStrategy=");
        sb2.append(this.f45328j);
        sb2.append(", uploadSchedulerStrategy=");
        sb2.append(this.f45329k);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
