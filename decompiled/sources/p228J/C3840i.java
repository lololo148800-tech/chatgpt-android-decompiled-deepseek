package p228J;

import android.util.Size;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import java.util.HashMap;
import p1053v3.p1054lN.IGDwkYw;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: renamed from: J.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3840i {

    /* JADX INFO: renamed from: a */
    public final Size f11615a;

    /* JADX INFO: renamed from: b */
    public final HashMap f11616b;

    /* JADX INFO: renamed from: c */
    public final Size f11617c;

    /* JADX INFO: renamed from: d */
    public final HashMap f11618d;

    /* JADX INFO: renamed from: e */
    public final Size f11619e;

    /* JADX INFO: renamed from: f */
    public final HashMap f11620f;

    /* JADX INFO: renamed from: g */
    public final HashMap f11621g;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3840i)) {
            return false;
        }
        C3840i c3840i = (C3840i) obj;
        return this.f11615a.equals(c3840i.f11615a) && this.f11616b.equals(c3840i.f11616b) && this.f11617c.equals(c3840i.f11617c) && this.f11618d.equals(c3840i.f11618d) && this.f11619e.equals(c3840i.f11619e) && this.f11620f.equals(c3840i.f11620f) && this.f11621g.equals(c3840i.f11621g);
    }

    public final int hashCode() {
        return ((((((((((((this.f11615a.hashCode() ^ 1000003) * 1000003) ^ this.f11616b.hashCode()) * 1000003) ^ this.f11617c.hashCode()) * 1000003) ^ this.f11618d.hashCode()) * 1000003) ^ this.f11619e.hashCode()) * 1000003) ^ this.f11620f.hashCode()) * 1000003) ^ this.f11621g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f11615a + ", s720pSizeMap=" + this.f11616b + IGDwkYw.iHDFySFpkkaSJO + this.f11617c + ", s1440pSizeMap=" + this.f11618d + ", recordSize=" + this.f11619e + ", maximumSizeMap=" + this.f11620f + ", ultraMaximumSizeMap=" + this.f11621g + "}";
    }

    public C3840i(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
        if (size != null) {
            this.f11615a = size;
            this.f11616b = map;
            if (size2 != null) {
                this.f11617c = size2;
                this.f11618d = map2;
                if (size3 != null) {
                    this.f11619e = size3;
                    this.f11620f = map3;
                    this.f11621g = map4;
                    return;
                }
                throw new NullPointerException(VjclRfeKsMflo.RAPZvh);
            }
            throw new NullPointerException(FpwNpGDhomXHZ.EDZjA);
        }
        throw new NullPointerException("Null analysisSize");
    }
}
