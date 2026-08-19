package p676c7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: c7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11683b {

    /* JADX INFO: renamed from: a */
    public final String f35425a;

    /* JADX INFO: renamed from: b */
    public final String f35426b;

    /* JADX INFO: renamed from: c */
    public final String f35427c;

    /* JADX INFO: renamed from: d */
    public final EnumC11684c f35428d;

    /* JADX INFO: renamed from: e */
    public final String f35429e;

    /* JADX INFO: renamed from: f */
    public final String f35430f;

    /* JADX INFO: renamed from: g */
    public final String f35431g;

    /* JADX INFO: renamed from: h */
    public final String f35432h;

    /* JADX INFO: renamed from: i */
    public final String f35433i;

    public C11683b(String deviceName, String deviceBrand, String deviceModel, EnumC11684c deviceType, String deviceBuildId, String osName, String osMajorVersion, String osVersion, String architecture) {
        AbstractC16544l.m18094g(deviceName, "deviceName");
        AbstractC16544l.m18094g(deviceBrand, "deviceBrand");
        AbstractC16544l.m18094g(deviceModel, "deviceModel");
        AbstractC16544l.m18094g(deviceType, "deviceType");
        AbstractC16544l.m18094g(deviceBuildId, "deviceBuildId");
        AbstractC16544l.m18094g(osName, "osName");
        AbstractC16544l.m18094g(osMajorVersion, "osMajorVersion");
        AbstractC16544l.m18094g(osVersion, "osVersion");
        AbstractC16544l.m18094g(architecture, "architecture");
        this.f35425a = deviceName;
        this.f35426b = deviceBrand;
        this.f35427c = deviceModel;
        this.f35428d = deviceType;
        this.f35429e = deviceBuildId;
        this.f35430f = osName;
        this.f35431g = osMajorVersion;
        this.f35432h = osVersion;
        this.f35433i = architecture;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11683b)) {
            return false;
        }
        C11683b c11683b = (C11683b) obj;
        return AbstractC16544l.m18089b(this.f35425a, c11683b.f35425a) && AbstractC16544l.m18089b(this.f35426b, c11683b.f35426b) && AbstractC16544l.m18089b(this.f35427c, c11683b.f35427c) && this.f35428d == c11683b.f35428d && AbstractC16544l.m18089b(this.f35429e, c11683b.f35429e) && AbstractC16544l.m18089b(this.f35430f, c11683b.f35430f) && AbstractC16544l.m18089b(this.f35431g, c11683b.f35431g) && AbstractC16544l.m18089b(this.f35432h, c11683b.f35432h) && AbstractC16544l.m18089b(this.f35433i, c11683b.f35433i);
    }

    public final int hashCode() {
        return this.f35433i.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p((this.f35428d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f35425a.hashCode() * 31, 31, this.f35426b), 31, this.f35427c)) * 31, 31, this.f35429e), 31, this.f35430f), 31, this.f35431g), 31, this.f35432h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfo(deviceName=");
        sb2.append(this.f35425a);
        sb2.append(", deviceBrand=");
        sb2.append(this.f35426b);
        sb2.append(", deviceModel=");
        sb2.append(this.f35427c);
        sb2.append(", deviceType=");
        sb2.append(this.f35428d);
        sb2.append(", deviceBuildId=");
        sb2.append(this.f35429e);
        sb2.append(", osName=");
        sb2.append(this.f35430f);
        sb2.append(", osMajorVersion=");
        sb2.append(this.f35431g);
        sb2.append(", osVersion=");
        sb2.append(this.f35432h);
        sb2.append(", architecture=");
        return AbstractC9306j0.m9891j(this.f35433i, Separators.RPAREN, sb2);
    }
}
